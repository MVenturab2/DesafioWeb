package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends PageBase {

    //Constructor
    public MainPage(WebDriver driver){
        super(driver);
    }
    //Mapping

    //Abas no menu
    By minhaVisaoButton = By.cssSelector("i.menu-icon.fa.fa-dashboard");
    By verTarefasButton = By.cssSelector("i.menu-icon.fa.fa-list-alt");
    By criarTarefaButton = By.xpath("//*[@id='sidebar']/ul/li[3]/a/i");
    By registroDeMudancasButton = By.xpath("//*[@id='sidebar']/ul/li[4]/a/i");
    By planejamentoButton = By.cssSelector("i.menu-icon.fa.fa-road");
    By resumoButton = By.cssSelector("i.menu-icon.fa.fa-bar-chart-o");
    //By gerenciarButton = By.xpath("//*[@id='sidebar']/ul/li[7]/a/i");
    By gerenciarButton = By.cssSelector("i.menu-icon.fa.fa-gears");



    By hideSidebarButton = By.xpath("//*[@id='sidebar-btn']/i");


    By convidarUsuariosButton = By.linkText("Convidar Usuários");



    //texto na pagina
    By informacoesSiteTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[2]/div[1]/h4");
    By resumoTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[2]/div[1]/h4");
    By planejamentoTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/p");
    By registroMudancasTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/p");
    By detalhesFormularioTarefaTextArea = By.xpath("//*[@id='report_bug_form']/div/div[1]/h4");

    By filtrosTextArea = By.xpath("//*[@id='filter']/div[1]/h4");
    By atribuidosAMimTextArea = By.xpath("//*[@id='assigned']/div[1]/h4/a");



    By usernameLoginInfoTextArea = By.xpath("//*[@id='navbar-container']/div[2]/ul/li[3]/a/span");
    By reportIssueLink = By.xpath("//a[@href='/bug_report_page.php']");



    //cabeçalho
    By minhaContaButton = By.linkText("Minha Conta");




    //Actions

    //Abrir telas
    public void clicarEmMinhaVisao(){
        click(minhaVisaoButton);
    }
    public void clicarEmVerTarefas(){
        click(verTarefasButton);
    }
    public void clicarEmCriarTarefa(){
        click(criarTarefaButton);
    }
    public void clicarEmRegistroDeMudancas(){
        click(registroDeMudancasButton);
    }
    public void clicarEmPlanejamento(){
        click(planejamentoButton);
    }
    public void clicaEmResumo(){
        click(resumoButton);
    }
    public void clicarEmGerenciar(){
        click(gerenciarButton);
    }

    public void clicarEmMinimizarSidebar(){
        click(hideSidebarButton);
    }

    public void clicarConvidarUsuarios(){
        click(convidarUsuariosButton);
    }








    //retornar informações da tela
    public String retornaUsernameDasInformacoesDeLogin(){
        return getText(usernameLoginInfoTextArea);
    }



    public String retornaInformacoesSite(){
        return getText(informacoesSiteTextArea);
    }
    public String retornaResumo(){
        return getText(resumoTextArea);
    }
    public String retornaPlanejamento(){
        return getText(planejamentoTextArea);
    }
    public String retornaRegistroMudancas(){
        return getText(registroMudancasTextArea);
    }
    public String retornaDetalhesFormularioTarefa(){
        return getText(detalhesFormularioTarefaTextArea);
    }
    public String retornaFiltros(){
        return getText(filtrosTextArea);
    }
    public String retornaatribuidosAMim(){
        return getText(atribuidosAMimTextArea);
    }





    public void clicarEmReportIssue(){
        click(reportIssueLink);
    }


    public void clicarEmMinhaConta(){
        click(minhaContaButton);
    }

}
