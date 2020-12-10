package br.com.serenitybddtemplate.pages;


import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase {

    //Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //Mapping
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By mensagemErroTextArea = By.xpath("//*[@id='main-container']/div/div/div/div/div[4]/p");
    By entrarButton = By.xpath("//input[@value='Entrar']");


    //Actions
    public void preenhcerUsuario(String usuario){
        sendKeys(usernameField, usuario);
    }

    public void preencherSenha(String senha){
        sendKeys(passwordField, senha);
    }

    public void clicarEmLogin(){
        click(entrarButton);
    }

    public String retornaMensagemDeErro(){
        return getText(mensagemErroTextArea);
    }




    public void preencherUsuarioJavaScript(String usuario){
        sendKeysJavaScript(usernameField, usuario);
    }

    public void preencherSenhaJavaScript(String senha){
        sendKeysJavaScript(passwordField, senha);
    }

    public void clicarEmLoginJavaScript(){
        clickJavaScript(entrarButton);
    }


}
