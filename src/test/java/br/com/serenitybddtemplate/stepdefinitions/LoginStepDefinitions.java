package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.LoginSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Steps
    MainSteps mainSteps;

    @Given("informo o usuario '(.*)'")
    public void preencherUsuario(String usuario){
        Serenity.setSessionVariable("usuario").to(usuario);
        loginSteps.preenhcerUsuario(usuario);
        //administrator/root
    }

    @And("informo a senha '(.*)'")
    public void preencherSenha(String senha){
        loginSteps.preencherSenha(senha);
    }

    @When("clico em entrar")
    public void clicarEmLogin(){
        loginSteps.clicarEmLogin();
    }

    @Then("o usuário deve ser autenticado com sucesso")
    public void verificarSeUsuarioEstaAutenticado(){
        String usuario = Serenity.sessionVariableCalled("usuario");
        Assert.assertEquals(usuario, mainSteps.retornaUsernameDasInformacoesDeLogin());
    }

    @Then("a mensagem de erro ao logar deve ser apresentada")
    public void verificarErroAoLogar(){
        String mensagemErro = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";
        Assert.assertEquals(mensagemErro, loginSteps.retornaMensagemDeErro());
    }





}
