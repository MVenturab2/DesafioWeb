package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static br.com.serenitybddtemplate.utils.GeraNomesAleatoriosUtils.gerarNumeros;

public class GerenciarProjetosStepDefinitions {
    @Steps
    CriarProjetoSteps criarProjetoSteps;

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarProjetosSteps gerenciarProjetosSteps;

    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    GerenciarUsuariosSteps gerenciarUsuariosSteps;

    @Steps
    MinhaContaSteps minhaContaSteps;








    @And("preencho os detalhes do projeto:")
    public void preencherDetalhesProjeto(DataTable informacao) {
        List<Map<String,String>> data = informacao.asMaps(String.class, String.class);

        String nomeProjeto = "";
        if(data.get(0).get("Nome Projeto").equals("Aleatorio")){
            nomeProjeto = "Projeto " + gerarNumeros();
        }else if(data.get(0).get("Nome Projeto").equals("subprojeto")) {
            nomeProjeto = "SubProj " + gerarNumeros();
        }
        else{
            nomeProjeto = data.get(0).get("Nome Projeto");
        }
        Serenity.setSessionVariable("projeto").to(nomeProjeto);
        criarProjetoSteps.preencherNomeProjeto(nomeProjeto);


        criarProjetoSteps.selecionarEstado(data.get(0).get("Estado"));


        if(data.get(0).get("Herdar Globais").equals("não")) {
            criarProjetoSteps.marcarHerdarGlobais();
        }


        criarProjetoSteps.selecionarVisibilidade(data.get(0).get("Visibilidade"));


        criarProjetoSteps.preencherDescricao(data.get(0).get("Descricao"));


        criarProjetoSteps.clicarAdicionarProjeto();


    }


    @And("preencho os detalhes do projeto editado:")
    public void preencherDetalhesEditarProjeto(DataTable informacao) {
        List<Map<String,String>> data = informacao.asMaps(String.class, String.class);

        String nomeProjeto = Serenity.sessionVariableCalled("projeto");

        nomeProjeto = nomeProjeto + data.get(0).get("Nome Projeto");

        String edicao = data.get(0).get("Nome Projeto");

        Serenity.setSessionVariable("projeto").to(nomeProjeto);
        criarProjetoSteps.preencherNomeProjeto(edicao);


        criarProjetoSteps.selecionarEstado(data.get(0).get("Estado"));


        if(data.get(0).get("Herdar Globais").equals("não")) {
            criarProjetoSteps.marcarHerdarGlobais();
        }


        criarProjetoSteps.selecionarVisibilidade(data.get(0).get("Visibilidade"));


        criarProjetoSteps.preencherDescricao(data.get(0).get("Descricao"));



    }






    @And("^Verifico a necessidade de excluir projeto '(.*)'$")
    public void verificoNecessidadeDeExcluirProjeto(String projeto) {
        if(gerenciarProjetosSteps.verificoProjetoCriado(projeto)==true) {

            gerenciarProjetosSteps.acessoProjetoCriado(projeto);
            gerenciarProjetosSteps.apagarOProjeto();
        }
    }


    @When("^clico em criar novo projeto$")
    public void clico_em_criar_novo_projeto() {
        gerenciarProjetosSteps.clicarCriarNovoProjeto();
    }


    @Then("^Defino Projeto '(.*)' como padrao$")
    public void selecionarProjetoPadrao(String projeto) {

        minhaContaSteps.selecionarProjetoPadrao(projeto);
        minhaContaSteps.clicarEmAtualizarPreferencias();

    }

    @Then("^Sistema retorna mensagem de projeto criado com '(.*)'$")
    public void sistemaApresentaMensagemDeProjetoSucesso(String mensagem) {
        //String msgErro  = "Um projeto com este nome já existe. Por favor, volte e entre um nome diferente.";
        //String msgSucesso = "Operação realizada com sucesso";
        Assert.assertEquals(mensagem,criarProjetoSteps.retornaMSGAoSalvarProjeto());
    }




    @Then("^Sistema apresenta mensagem de erro ao criar projeto '(.*)'$")
    public void sistemaApresentaMensagemDeProjetoErro() {

        String msgErro  = "Um projeto com este nome já existe. Por favor, volte e entre um nome diferente.";
        String msgSucesso = "Operação realizada com sucesso";

        Assert.assertEquals(msgSucesso,criarProjetoSteps.retornaMSGAoSalvarProjeto());

    }




    @And("^acesso o projeto criado$")
    public void acessoProjetoCriado() {
        String projeto = Serenity.sessionVariableCalled("projeto");
        gerenciarProjetosSteps.acessoProjetoCriado(projeto);
    }

    @And("^crio novo subProjeto$")
    public void criarNovoSubprojeto() {
        gerenciarProjetosSteps.clicarEmCriarNovoSubprojeto();
    }



    @And("^apago o projeto$")
    public void apagoOProjeto() {
        gerenciarProjetosSteps.apagarOProjeto();
    }



    @And("^Atualizo o Projeto$")
    public void atualizarProjeto() {
        gerenciarProjetosSteps.clicarEmAtualizarProjeto();
    }





    @And("^A situação do projeto se encontra '(.*)' na tela de gerenciar projetos$")
    public void retornaMensagemDeSucessoApagarProjeto(boolean situacao) {
        String projeto = Serenity.sessionVariableCalled("projeto");

        //System.out.println(projeto);

        Assert.assertEquals(situacao ,gerenciarProjetosSteps.verificoProjetoCriado(projeto));

    }


    @And("adiciono subprojeto ja existente")
    public void adicionarSubprojetoExistente() {
        String subprojeto = "Projeto extra";
        gerenciarProjetosSteps.selecionarSubProjeto(subprojeto);
        gerenciarProjetosSteps.clicarEmAdicionarComoSubprojeto();
    }

    @And("desvinculo subprojeto")
    public void desvincularSubProjeto() {
        //String subprojeto = "Projeto extra";
        gerenciarProjetosSteps.clicarEmDesvincularSubprojeto();
    }

    @And("verifico o subprojeto")
    public void verificarSubprojeto() {
        Serenity.setSessionVariable("projeto").to("Projeto extra");
    }


    @And("preencho com '(.*)' a versão do projeto")
    public void preencherNomeDaVersaoDoProjeto(String versao) {

        if(versao.equals("Aleatorio")){
            versao = "Versão " + gerarNumeros();
        }


        gerenciarProjetosSteps.preencherNomeDaVersaoDoProjeto(versao);
    }
    @And("adiciono versao ao projeto")
    public void clicarEmAdicionarVersaoDoProjeto(){
        gerenciarProjetosSteps.clicarEmAdicionarVersaoDoProjeto();
    }
    @And("adiciono e altero a versao do projeto")
    public void clicarEmAdicionarEAlterarVersaoDoProjeto(){
        gerenciarProjetosSteps.clicarEmAdicionarEAlterarVersaoDoProjeto();
    }





    @And("preencho os detalhes da versao:")
    public void preencherDetalhesDaVersao(DataTable detalhes) {
        List<Map<String,String>> data = detalhes.asMaps(String.class, String.class);


        if(!data.get(0).get("versao").isEmpty()) {
            gerenciarProjetosSteps.preencherVersao(data.get(0).get("versao"));
        }
        if(!data.get(0).get("Ordem por Data").isEmpty()) {
            gerenciarProjetosSteps.preencherOrdemPorData(data.get(0).get("Ordem por Data"));
        }
        if(!data.get(0).get("Descricao").isEmpty()) {
            gerenciarProjetosSteps.preencherDescricaoDaVersao(data.get(0).get("Descricao"));
        }

        if(data.get(0).get("Liberada").equals("sim")) {
            gerenciarProjetosSteps.clicarEmLiberada();
        }
        if(data.get(0).get("Liberada").equals("sim")) {
            gerenciarProjetosSteps.clicarEmObsoleto();
        }
        gerenciarProjetosSteps.clicarEmAtualizarVersao();
    }



    @And("apago a versao ao editar")
    public void apagarVersaoAoEditar(){
        gerenciarProjetosSteps.clicarEmApagarVersaoDoProjeto();
        gerenciarProjetosSteps.clicarEmApagarVersaoDoProjeto();
    }


}
