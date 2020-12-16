package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.flows.retornaElementosFlows;
import br.com.serenitybddtemplate.steps.GerenciarSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class NavegarAbasMenuStepDefinitions {

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarSteps gerenciarSteps;

    @Steps
    retornaElementosFlows retornaElementosFlows;


    //Menu principal
    @When("clico em Minha Visão")
    public void clicarEmMinhaVisao() {
        Serenity.setSessionVariable("tela").to("Minha Visão");
        mainSteps.clicarEmMinhaVisao();
    }
    @When("clico em Ver Tarefas")
    public void clicarEmVerTarefas( ) {
        Serenity.setSessionVariable("tela").to("Ver Tarefas");
        mainSteps.clicarEmVerTarefas();
    }
    @When("clico em Criar Tarefa")
    public void clicarEmCriarTarefa( ) {
        Serenity.setSessionVariable("tela").to("Criar Tarefa");
        mainSteps.clicarEmCriarTarefa();
    }
    @When("clico em Registro de Mudanças")
    public void clicarEmRegistrodeMudancas( ) {
        Serenity.setSessionVariable("tela").to("Registro de Mudanças");
        mainSteps.clicarEmRegistroDeMudancas();
    }
    @When("clico em planejamento")
    public void clicarEmplanejamento( ) {
        Serenity.setSessionVariable("tela").to("planejamento");
        mainSteps.clicarEmPlanejamento();
    }
    @When("clico em resumo")
    public void clicarEmresumo( ) {
        Serenity.setSessionVariable("tela").to("resumo");
        mainSteps.clicaEmResumo();
    }
    @When("clico em gerenciar")
    public void clicarEmgerenciar( ) {
        Serenity.setSessionVariable("tela").to("gerenciar");
        mainSteps.clicarEmGerenciar();
    }
    @When("clico em minimizar")
    public void clicarEmminimizar( ) {
        Serenity.setSessionVariable("tela").to("minimizar");
        mainSteps.clicarEmMinimizarSidebar();
    }
    @When("clico em Convidar Usuários")
    public void clicarEmConvidarUsuarios( ) {
        Serenity.setSessionVariable("tela").to("Convidar Usuários");
        mainSteps.clicarConvidarUsuarios();
    }

    //abas da tela gerenciar
    @When("acesso gerenciar Info Do Site")
    public void clicarEmAbasGerenciarInfoDoSite( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Info Do Site");
        gerenciarSteps.clicarVisaoGeral();
    }
    @When("acesso gerenciar Usuários")
    public void clicarEmAbasGerenciarUsuarios( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Usuários");
        gerenciarSteps.clicarGerenciarUsuarios();
    }
    @When("acesso gerenciar projetos")
    public void clicarEmAbasGerenciarprojetos( ) {
        Serenity.setSessionVariable("telaGerenciar").to("projetos");
        gerenciarSteps.clicarGerenciarProjetos();
    }



    @When("acesso gerenciar Marcadores")
    public void clicarEmAbasGerenciarMarcadores( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Marcadores");
        gerenciarSteps.clicarGerenciarMarcadores();
    }

    @When("acesso gerenciar Campos Personalizados")
    public void clicarEmAbasGerenciarCamposPersonalizados( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Campos Personalizados");
        gerenciarSteps.clicarGerenciarcamposPersonalizados();
    }
    @When("acesso gerenciar Perfís Globais")
    public void clicarEmAbasGerenciarPerfísGlobais( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Perfís Globais");
        gerenciarSteps.clicarGerenciarperfisGlobais();
    }
    @When("acesso gerenciar Plugins")
    public void clicarEmAbasGerenciarPlugins( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Plugins");
        gerenciarSteps.clicarGerenciarplugins();
    }
    @When("acesso gerenciar Configuração")
    public void clicarEmAbasGerenciarConfiguracao( ) {
        Serenity.setSessionVariable("telaGerenciar").to("Configuração");
        gerenciarSteps.clicarGerenciarconfiguracao();
    }


    //retornos da tela
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

}
