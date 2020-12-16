package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerenciarPage extends PageBase {

    //Constructor
    public GerenciarPage(WebDriver driver){
        super(driver);
    }
    //Mapping

    //menus
    By visaoGeralButton = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/ul/li[1]/a/i");
    By gerenciarUsuariosButton = By.partialLinkText("Gerenciar Usuários");
    By gerenciarProjetosButton = By.partialLinkText("Gerenciar Projetos");
    By gerenciarMarcadoresButton = By.partialLinkText("Gerenciar Marcadores");
    By gerenciarcamposPersonalizadosButton = By.partialLinkText("Gerenciar Campos Personalizados");
    By gerenciarperfisGlobaisButton = By.partialLinkText("Gerenciar Perfís Globais");
    By gerenciarpluginsButton = By.partialLinkText("Gerenciar Plugins");
    By gerenciarconfiguracaoButton = By.partialLinkText("Gerenciar Configuração");
    // retornos da pagina
    By visaoGeralTextArea = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div[2]/div/h4");
    By gerenciarUsuariosTextArea = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div[4]/div/h4");
    By gerenciarProjetosTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[2]/div[1]/h4");
    By gerenciarMarcadoresTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[4]/div[1]/h4");
    By gerenciarcamposPersonalizadosTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[2]/div[1]/h4");
    By gerenciarperfisGlobaisTextArea = By.xpath("//*[@id='account-profile-form']/fieldset/div/div[1]/h4");
    By gerenciarpluginsTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[2]/form/fieldset/div/div[1]/h4");
    By gerenciarconfiguracaoTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div[3]/div[2]/div[1]/h4");

    //Actions
    public void clicarVisaoGeral(){
        click(visaoGeralButton);
    }
    public void clicarGerenciarUsuarios(){
        click(gerenciarUsuariosButton);
    }
    public void clicarGerenciarProjetos(){
        click(gerenciarProjetosButton);
    }
    public void clicarGerenciarMarcadores(){
        click(gerenciarMarcadoresButton);
    }
    public void clicarGerenciarcamposPersonalizados(){
        click(gerenciarcamposPersonalizadosButton);
    }
    public void clicarGerenciarperfisGlobais(){
        click(gerenciarperfisGlobaisButton);
    }
    public void clicarGerenciarplugins(){
        click(gerenciarpluginsButton);
    }
    public void clicarGerenciarconfiguracao(){
        click(gerenciarconfiguracaoButton);
    }
    // retornos da pagina
    public String retornaVisaoGeral(){
        return getText(visaoGeralTextArea);
    }
    public String retornaGerenciarUsuarios(){
        return getText(gerenciarUsuariosTextArea);
    }
    public String retornaGerenciarProjetos(){
        return getText(gerenciarProjetosTextArea);
    }
    public String retornaGerenciarMarcadores(){
        return getText(gerenciarMarcadoresTextArea);
    }
    public String retornaGerenciarcamposPersonalizados(){
        return getText(gerenciarcamposPersonalizadosTextArea);
    }
    public String retornaGerenciarperfisGlobais(){
        return getText(gerenciarperfisGlobaisTextArea);
    }
    public String retornaGerenciarplugins(){
        return getText(gerenciarpluginsTextArea);
    }
    public String retornaGerenciarconfiguracao(){
        return getText(gerenciarconfiguracaoTextArea);
    }






}
