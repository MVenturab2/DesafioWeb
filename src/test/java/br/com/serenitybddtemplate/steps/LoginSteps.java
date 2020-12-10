package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    LoginPage loginPage;

    @Step("Abrir Mantis")
    public void abrirMantis(){
        loginPage.open();
    }

    @Step("Preencher usuário com '{0}'")
    public void preenhcerUsuario(String usuario){
        loginPage.preenhcerUsuario(usuario);
    }

    @Step("Preencher senha com '[0}'")
    public void preencherSenha(String senha){
        loginPage.preencherSenha(senha);
    }

    @Step("Clicar em 'Login'")
    public void clicarEmLogin(){
        loginPage.clicarEmLogin();
    }

    @Step("Retorna mensagem de erro")
    public String retornaMensagemDeErro(){
        return loginPage.retornaMensagemDeErro();
    }




    @Step("Preencher usuário com '{0}'")
    public void preencherUsuarioJavaScript(String usuario){
        loginPage.preencherUsuarioJavaScript(usuario);
    }

    @Step("Preencher senha com '[0}'")
    public void preencherSenhaJavaScript(String senha){
        loginPage.preencherSenhaJavaScript(senha);
    }

    @Step("Clicar em 'Login'")
    public void clicarEmLoginJavaScript(){
        loginPage.clicarEmLoginJavaScript();
    }


}
