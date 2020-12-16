package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.GerenciarCamposPersonalizadosSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import java.util.List;
import java.util.Map;

import static br.com.serenitybddtemplate.utils.GeraNomesAleatoriosUtils.gerarNumeros;

public class GerenciarCamposPersonalizadosStepDefinitions {

    @Steps
    GerenciarCamposPersonalizadosSteps gerenciarCamposPersonalizadosSteps;


    @And("crio um novo campo personalizado '(.*)'")
    public void criarCamposPersonalizados(String nome) {
        String nomeCampoPersonalizado = "";
        if(nome.equals("Aleatorio")){
            nomeCampoPersonalizado = "camp " + gerarNumeros();
        }else if(nome.equals("Repetido")){
            nomeCampoPersonalizado = gerenciarCamposPersonalizadosSteps.retornaPrimeiraLinhaCampoPersonalizado();
        }else{
            nomeCampoPersonalizado = nome;
        }
        Serenity.setSessionVariable("Campo Personalizado").to(nomeCampoPersonalizado);
        gerenciarCamposPersonalizadosSteps.preencherNomeCampoPersonalizado(nomeCampoPersonalizado);
        gerenciarCamposPersonalizadosSteps.clicarCriarNovoCampoPersonalizado();
    }


    @And("preencho os detalhes do campo personalizado:")
    public void preenchoDetalhesMarcador(DataTable detalhes) {
        List<Map<String,String>> data = detalhes.asMaps(String.class, String.class);
        gerenciarCamposPersonalizadosSteps.selecionarTipo(data.get(0).get("Tipo"));
        gerenciarCamposPersonalizadosSteps.preencherValoresPossiveis(data.get(0).get("Valores Possíveis"));
        gerenciarCamposPersonalizadosSteps.preencherValorPadrao(data.get(0).get("Valor Padrão"));
        gerenciarCamposPersonalizadosSteps.preencherExpressaoRegular(data.get(0).get("Expressão Regular"));
        gerenciarCamposPersonalizadosSteps.selecionarAcessoDeLeitura(data.get(0).get("Acesso de Leitura"));
        gerenciarCamposPersonalizadosSteps.selecionarAcessoDeEscrita(data.get(0).get("Acesso de Escrita"));
        gerenciarCamposPersonalizadosSteps.preencherComprimentoMinimo(data.get(0).get("Comprimento Mínimo"));
        gerenciarCamposPersonalizadosSteps.preencherComprimentoMaximo(data.get(0).get("Comprimento Máximo"));
        if(data.get(0).get("Adicionar ao Filtro").equals("nao")) {
            gerenciarCamposPersonalizadosSteps.marcarAdicionarAoFiltro();
        }
        if(data.get(0).get("Mostrar ao criar tarefas").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarMostrarAoCriarTarefas();
        }
        if(data.get(0).get("Mostrar ao atualizar tarefas").equals("nao")) {
            gerenciarCamposPersonalizadosSteps.marcarMostrarAoAtualizarTarefas();
        }
        if(data.get(0).get("Mostrar ao resolver tarefas").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarMostrarAoResolverTarefas();
        }
        if(data.get(0).get("Mostrar ao fechar tarefas").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarMostrarAoFecharTarefas();
        }
        if(data.get(0).get("Requerido no relato").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarRequeridoAoRelato();
        }
        if(data.get(0).get("Requerido na atualização").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarRequeridoAoAtualizacao();
        }
        if(data.get(0).get("Requerido na resolução").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarRequeridoAoResolucao();
        }
        if(data.get(0).get("Requerido no fechamento").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarRequeridoAoFechamento();
        }
        if(data.get(0).get("Projetos").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarProjetoCriado1();
        }
        if(data.get(0).get("Sequência").equals("sim")) {
            gerenciarCamposPersonalizadosSteps.marcarVincularCampoPersonalizado();
        }
        gerenciarCamposPersonalizadosSteps.clicarAtualizaCampoPersonalizado();
    }

    @And("apago o campo personalizado")
    public void apagoCampoPersonalizado( ) {
        gerenciarCamposPersonalizadosSteps.clicarApagarCampoPersonalizado();
        gerenciarCamposPersonalizadosSteps.clicarApagarCampo();
    }

}
