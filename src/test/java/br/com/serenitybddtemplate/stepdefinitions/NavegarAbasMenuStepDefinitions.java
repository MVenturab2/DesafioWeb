package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.dbsteps.LimpaBaseDBSteps;
import br.com.serenitybddtemplate.steps.CriarTarefaSteps;
import br.com.serenitybddtemplate.steps.GerenciarSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
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

public class NavegarAbasMenuStepDefinitions {
    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarSteps gerenciarSteps;


    @Steps
    LimpaBaseDBSteps limpaBaseDBSteps;

    @When("clico em '(.*)'")
    public void clicarEmUmaAba(String tela) {
        Serenity.setSessionVariable("tela").to(tela);
        switch(tela){
            case "Minha Visão": mainSteps.clicarEmMinhaVisao();
            break;
            case "Ver Tarefas": mainSteps.clicarEmVerTarefas();
            break;
            case "Criar Tarefa": mainSteps.clicarEmCriarTarefa();
            break;
            case "Registro de Mudanças": mainSteps.clicarEmRegistroDeMudancas();
            break;
            case "planejamento": mainSteps.clicarEmPlanejamento();
            break;
            case "resumo": mainSteps.clicaEmResumo();
            break;
            case "gerenciar": mainSteps.clicarEmGerenciar();
            break;
            case "minimizar": mainSteps.clicarEmMinimizarSidebar();
            break;
            case "Convidar Usuários": mainSteps.clicarConvidarUsuarios();
            break;



        }
    }


    @Then("O sistema retorna a tela com '(.*)'")
    public void retornaTituloPage(String retornoTela){
        String tela = Serenity.sessionVariableCalled("tela");
        switch(tela){
            case "Minha Visão": Assert.assertEquals(retornoTela, mainSteps.retornaatribuidosAMim());
                break;
            case "Ver Tarefas": Assert.assertEquals(retornoTela, mainSteps.retornaFiltros());
                break;
            case "Criar Tarefa": Assert.assertEquals(retornoTela, mainSteps.retornaDetalhesFormularioTarefa());
                break;
            case "Registro de Mudanças": Assert.assertEquals(retornoTela, mainSteps.retornaRegistroMudancas());
                break;
            case "planejamento": Assert.assertEquals(retornoTela, mainSteps.retornaPlanejamento());
                break;
            case "resumo": Assert.assertEquals(retornoTela, mainSteps.retornaResumo());
                break;
            case "gerenciar": Assert.assertEquals(retornoTela, gerenciarSteps.retornaVisaoGeral());
                break;
        }
    }



    @When("clico em gerenciar '(.*)'")
    public void clicarEmUmaAbaDeProjetos(String telaGerenciar) {
        Serenity.setSessionVariable("telaGerenciar").to(telaGerenciar);
        switch(telaGerenciar){

            case "Info Do Site": gerenciarSteps.clicarVisaoGeral();
                break;
            case "Usuários": gerenciarSteps.clicarGerenciarUsuarios();
                break;
            case "projetos": gerenciarSteps.clicarGerenciarProjetos();
                break;
            case "Marcadores": gerenciarSteps.clicarGerenciarMarcadores();
                break;
            case "Campos Personalizados": gerenciarSteps.clicarGerenciarcamposPersonalizados();
                break;
            case "Perfís Globais": gerenciarSteps.clicarGerenciarperfisGlobais();
                break;
            case "Plugins": gerenciarSteps.clicarGerenciarplugins();
                break;
            case "Configuração": gerenciarSteps.clicarGerenciarconfiguracao();
                break;
        }
    }




    @When("O sistema retorna a tela de gerenciar '(.*)'")
    public void retornoTelaGerenciar(String retornoAbaGerenciar) {
        String telaGerenciar = Serenity.sessionVariableCalled("telaGerenciar");
        switch(telaGerenciar){
            case "Info Do Site": Assert.assertTrue(gerenciarSteps.retornaVisaoGeral().contains(retornoAbaGerenciar));
                break;
            case "usuarios": Assert.assertTrue(gerenciarSteps.retornaGerenciarUsuarios().contains(retornoAbaGerenciar) );
                break;
            case "projetos": Assert.assertTrue(gerenciarSteps.retornaGerenciarProjetos().contains(retornoAbaGerenciar));
                break;
            case "Marcadores": Assert.assertTrue(gerenciarSteps.retornaGerenciarMarcadores().contains( retornoAbaGerenciar));
                break;
            case "Campos Personalizados": Assert.assertTrue(gerenciarSteps.retornaGerenciarcamposPersonalizados().contains( retornoAbaGerenciar) );
                break;
            case "Perfís Globais": Assert.assertTrue(gerenciarSteps.retornaGerenciarperfisGlobais().contains(retornoAbaGerenciar) );
                break;
            case "Plugins": Assert.assertTrue(gerenciarSteps.retornaGerenciarplugins().contains( retornoAbaGerenciar) );
                break;
            case "Configuração": Assert.assertTrue(gerenciarSteps.retornaGerenciarconfiguracao().contains(retornoAbaGerenciar) );
                break;
        }
    }


    @When("consulto o banco")
    public void consultarBanco() {
        limpaBaseDBSteps.retornaSenhaDoUsuarioDB("teste");
    }



}
