package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.CriarTarefaSteps;
import br.com.serenitybddtemplate.steps.GerenciarSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import br.com.serenitybddtemplate.steps.VerTarefasSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class VerTarefasStepDefinitions {
    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    VerTarefasSteps verTarefasSteps;

    @Steps
    GerenciarSteps gerenciarSteps;

    @When("Clico em '(.*)' no campo Visualizando Tarefas")
    public void imprimir(String botão) {
        //Serenity.setSessionVariable("botão").to(botão);
        switch(botão){
            case "Imprimir Tarefas": verTarefasSteps.clicarEmImprimirTarefas();
            break;
            case "Exportar para Arquivo CSV": verTarefasSteps.clicarExportarArquivoCSV();
                break;
            case "Exportação para Excel": verTarefasSteps.clicarExportarExcel();
                break;
            case "Resumo": verTarefasSteps.clicarResumo();
                break;
        }
    }





}
