package br.com.serenitybddtemplate.hooks;

import br.com.serenitybddtemplate.steps.LoginSteps;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;

public class GeneralHooks {
    @Steps
    LoginSteps loginSteps;

    @Before(order = 1, value = {"not @login"})
    public void beforeScenario(){
        //código a ser executado antes de cada cenário
        String usuario = "administrator";
        String senha = "vent";
        loginSteps.preenhcerUsuario(usuario);
        loginSteps.clicarEmLogin();
        loginSteps.preencherSenha(senha);
        loginSteps.clicarEmLogin();
        Serenity.setSessionVariable("usuario").to(usuario);
    }



    @Before(order = 0, value = {"not @query"})
    public void beforeScenariologin(){
        //código a ser executado antes de cada cenário
        loginSteps.executeQuery("cargaInicial.sql");
        loginSteps.abrirMantis();
    }


    @After
    public void afterScenario(){
        //código a ser executado depois de cada cenário

        loginSteps.executeQuery("limpaBase.sql");
        loginSteps.quitDriver();
    }
}
