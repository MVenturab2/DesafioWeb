package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.CriarTarefaSteps;

import br.com.serenitybddtemplate.steps.MainSteps;
import br.com.serenitybddtemplate.steps.MinhaVisaoSteps;
import br.com.serenitybddtemplate.steps.VerTarefasSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class criarTarefaStepDefinitions {
    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    MainSteps mainSteps;

    @Steps
    MinhaVisaoSteps minhaVisaoSteps;

    @Steps
    VerTarefasSteps verTarefasSteps;

    @Given("que estou logado como administrador no sistema")
    public void preencherUsuario(){

        String usuario = Serenity.sessionVariableCalled("usuario");
        Assert.assertEquals(usuario, mainSteps.retornaUsernameDasInformacoesDeLogin());
        //administrator/root
    }


    @When("clico em criar tarefa")
    public void clicarEmLogin(){
        mainSteps.clicarEmCriarTarefa();
    }

    @And("preencho os detalhes do relatorio")
    public void verificarSeUsuarioEstaAutenticado(DataTable informacao){
        List<Map<String,String>> data = informacao.asMaps(String.class, String.class);
        criarTarefaSteps.selecionarCategoria(data.get(0).get("Categoria"));


        criarTarefaSteps.selecionarFrequencia(data.get(0).get("Frequencia"));

        criarTarefaSteps.selecionarGravidade(data.get(0).get("Gravidade"));

        criarTarefaSteps.selecionarPrioridade(data.get(0).get("Prioridade"));


        if(data.get(0).get("Selecionar Perfil").equals("Sim")) {
            criarTarefaSteps.clicarSelecionarPerfil();
            criarTarefaSteps.preencherPlataforma(data.get(0).get("Plataforma"));
            criarTarefaSteps.preencherSO(data.get(0).get("SO"));
            criarTarefaSteps.preencherVersaoSO(data.get(0).get("Versao SO"));
        }

        criarTarefaSteps.selecionarCategoriaAtribuir(data.get(0).get("Atribuir"));

        Serenity.setSessionVariable("Resumo").to(data.get(0).get("Resumo"));

        criarTarefaSteps.preencherResumo(data.get(0).get("Resumo"));

        criarTarefaSteps.preencherDescricao(data.get(0).get("Descricao"));

        criarTarefaSteps.preencherPassosParaReproduzir(data.get(0).get("Passos Reproduzir"));

        criarTarefaSteps.preencherInformacoesAdicionais(data.get(0).get("informacoes Adicionais"));

        if(data.get(0).get("Anexo").equals("sim")) {
            criarTarefaSteps.clicarEnviarArquivos();
        }

        if(data.get(0).get("Visibilidade").equals("privado")) {
            criarTarefaSteps.clicarVisibilidadePrivado();
        }
        else {
            criarTarefaSteps.clicarVisibilidadePublico();
        }

        //criarTarefaSteps.clicarContinuarRelatando();

        criarTarefaSteps.clicarCriarNovaTarefa();


    }




    @Then("Sistema retorna mensagem de tarefa criada com '(.*)'")
    public void apresentaMensagemDeTarefaSucesso(String mensagem){
        Assert.assertEquals(mensagem,criarTarefaSteps.retornaMSGAoSalvarTarefa());



        Serenity.setSessionVariable("id Da Tarefa").to(verTarefasSteps.retornarIDDaTarefaTextArea());




    }

    @Then("seleciono a tarefa criada")
    public void selecionarTarefaCriada( ){
        String tarefa = Serenity.sessionVariableCalled("Resumo");
        minhaVisaoSteps.clicarTarefaCriada(tarefa);
    }

    @And("apago a tarefa")
    public void apagarTarefa(){
        minhaVisaoSteps.clicarEmApagarTarefa();
    }


    @And("^A situação da tarefa se encontra '(.*)' na tela de ver tarefas$")
    public void retornaSituaçãoDaTarefa(boolean situacao) {
        String tarefas = Serenity.sessionVariableCalled("id Da Tarefa");

        //System.out.println(tarefas);

        Assert.assertEquals(situacao ,verTarefasSteps.verificoTarefaCriado(tarefas));

    }

    @And("^defino relação de '(.*)' para outra tarefa$")
    public void definirRelacionamentoEntreTarefas(String relacao) {
        String tarefa = Serenity.sessionVariableCalled("id Da Tarefa");

        verTarefasSteps.definirRelacaoDaTarefa(relacao);
        verTarefasSteps.definirTarefaDaRelacao(tarefa);
        verTarefasSteps.adicionarRelacionamentoDeTarefas();


    }

    @And("^crio um clone da tarefa$")
    public void clicarEmCriarClone( ) {

        verTarefasSteps.clicarEmCriarClone();
        criarTarefaSteps.clicarCriarNovaTarefa();

    }

    @And("^clico em fechar tarefa$")
    public void clicarEmFecharTarefa( ) {

        verTarefasSteps.clicarEmFecharTarefa();


    }





}
