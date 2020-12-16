package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.dbsteps.UsersDBSteps;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ZerarBancoStepDefinitions {


    @Steps
    UsersDBSteps usersDBSteps;


    @When("executo script '(.*)'")
    public void apagarbase( String query) {
        usersDBSteps.executaQuery(query);
    }

}
