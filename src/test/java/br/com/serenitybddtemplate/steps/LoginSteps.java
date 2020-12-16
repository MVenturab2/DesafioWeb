package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;

    //Abrir navagador
    @Step("Login: Abrir Mantis")
    public void abrirMantis(){
        loginPage.open();
    }

    //Login
    @Step("Login: Preencher usuário com '{0}'")
    public void preenhcerUsuario(String usuario){
        loginPage.preenhcerUsuario(usuario);
    }
    @Step("Login: Preencher senha com '[0}'")
    public void preencherSenha(String senha){
        loginPage.preencherSenha(senha);
    }
    @Step("Login: Clicar em entrar")
    public void clicarEmLogin(){
        loginPage.clicarEmLogin();
    }

    //JavaScript
    @Step("Login: Preencher usuário com '{0}' utilizando javascript")
    public void preencherUsuarioJavaScript(String usuario){
        loginPage.preencherUsuarioJavaScript(usuario);
    }
    @Step("Login: Preencher senha com '[0}' utilizando javascript")
    public void preencherSenhaJavaScript(String senha){
        loginPage.preencherSenhaJavaScript(senha);
    }
    @Step("Login: Clicar em Login utilizando javascript")
    public void clicarEmLoginJavaScript(){
        loginPage.clicarEmLoginJavaScript();
    }


    //Retornos da pagina
    @Step("Login: Retorna mensagem de erro")
    public String retornaMensagemDeErro(){
        return loginPage.retornaMensagemDeErro();
    }

}
