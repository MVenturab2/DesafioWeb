package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.dbsteps.LimpaBaseDBSteps;
import br.com.serenitybddtemplate.flows.retornaElementosFlows;
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

    @Steps
    retornaElementosFlows retornaElementosFlows;


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


    @Then("O sistema retorna a tela solicitada")
    public void retornaTituloPage( ){
        String tela = Serenity.sessionVariableCalled("tela");
        switch(tela){
            case "Minha Visão": retornaElementosFlows.retornaElementosMinhaVisao();
                break;
            case "Ver Tarefas": retornaElementosFlows.retornaElementosFiltro();
                break;
            case "Criar Tarefa": retornaElementosFlows.retornaElementosCriarTarefa();
                break;
            case "Registro de Mudanças": retornaElementosFlows.retornaElementosRegistroMudancas();
                break;
            case "planejamento": retornaElementosFlows.retornaElementosPlanejamento();
                break;
            case "resumo": retornaElementosFlows.retornaElementosResumo();
                break;
            case "gerenciar": retornaElementosFlows.retornaElementosGerenciar();
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




    @When("O sistema retorna a tela de gerenciar solicitada")
    public void retornoTelaGerenciar() {
        String telaGerenciar = Serenity.sessionVariableCalled("telaGerenciar");
        switch(telaGerenciar){
            case "Info Do Site": retornaElementosFlows.retornaElementosGerenciarInfoSite();
                break;
            case "usuarios": retornaElementosFlows.retornaElementosGerenciarUsuarios();
                break;
            case "projetos": retornaElementosFlows.retornaElementosGerenciarProjetos();
                break;
            case "Marcadores": retornaElementosFlows.retornaElementosGerenciarMarcadores();
                break;
            case "Campos Personalizados": retornaElementosFlows.retornaElementosGerenciarCamposPersonalizados();
                break;
            case "Perfís Globais": retornaElementosFlows.retornaElementosGerenciarPerfisGlobais();
                break;
            case "Plugins": retornaElementosFlows.retornaElementosGerenciarPlugins();
                break;
            case "Configuração": retornaElementosFlows.retornaElementosGerenciarConfiguracao();
                break;
        }
    }


    @When("consulto o banco")
    public void consultarBanco() {
        limpaBaseDBSteps.retornaSenhaDoUsuarioDB("teste");
    }



}
