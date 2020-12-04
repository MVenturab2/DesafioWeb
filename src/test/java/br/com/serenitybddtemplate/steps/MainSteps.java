package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class MainSteps {
    MainPage mainPage;

    @Step("Retorna username das informações de login")
    public String retornaUsernameDasInformacoesDeLogin(){
        return mainPage.retornaUsernameDasInformacoesDeLogin();
    }

    @Step("Clicar em 'Report Issue'")
    public void clicarEmReportIssue(){
        mainPage.clicarEmReportIssue();
    }

    // clicar em menus
    @Step("main: Clicar Em Minha Visao")
    public void clicarEmMinhaVisao(){
        mainPage.clicarEmMinhaVisao();
    }
    @Step("main: Clicar Em Ver Tarefas")
    public void clicarEmVerTarefas(){
        mainPage.clicarEmVerTarefas();
    }
    @Step("main: Clicar Em Criar Tarefa")
    public void clicarEmCriarTarefa(){
        mainPage.clicarEmCriarTarefa();
    }
    @Step("main: Clicar Em Registro De Mudancas")
    public void clicarEmRegistroDeMudancas(){
        mainPage.clicarEmRegistroDeMudancas();
    }
    @Step("main: Clicar Em Planejamento")
    public void clicarEmPlanejamento(){
        mainPage.clicarEmPlanejamento();
    }
    @Step("main: Clicar Em Resumo")
    public void clicaEmResumo(){
        mainPage.clicaEmResumo();
    }
    @Step("main: Clicar Em Gerenciar")
    public void clicarEmGerenciar(){
        mainPage.clicarEmGerenciar();
    }

    @Step("main: Clicar minimizar bandeja")
    public void clicarEmMinimizarSidebar(){
        mainPage.clicarEmMinimizarSidebar();
    }

    @Step("main: Clicar Convidar Usuarios")
    public void clicarConvidarUsuarios(){
        mainPage.clicarConvidarUsuarios();
    }







    //Retornar qual pagina esta
    @Step("main: retorna Informacoes Site")
    public String retornaInformacoesSite(){
        return mainPage.retornaInformacoesSite();
    }
    @Step("main: retorna Resumo")
    public String retornaResumo(){
        return mainPage.retornaResumo();
    }
    @Step("main: retorna Planejamento")
    public String retornaPlanejamento(){
        return mainPage.retornaPlanejamento();
    }
    @Step("main: retorna Registro Mudancas")
    public String retornaRegistroMudancas(){
        return mainPage.retornaRegistroMudancas();
    }
    @Step("main: retorna Detalhes Formulario Tarefa")
    public String retornaDetalhesFormularioTarefa(){
        return mainPage.retornaDetalhesFormularioTarefa();
    }
    @Step("main: retorna Filtros")
    public String retornaFiltros(){
        return mainPage.retornaFiltros();
    }
    @Step("main: retorna atribuidos A Mim")
    public String retornaatribuidosAMim(){
        return mainPage.retornaatribuidosAMim();
    }


    @Step("main: Clicar Em Minha Conta")
    public void clicarEmMinhaConta(){
        mainPage.clicarEmMinhaConta();
    }

}
