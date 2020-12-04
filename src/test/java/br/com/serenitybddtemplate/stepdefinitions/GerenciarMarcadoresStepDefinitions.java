package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.CriarTarefaSteps;
import br.com.serenitybddtemplate.steps.GerenciarMarcadoresSteps;
import br.com.serenitybddtemplate.steps.GerenciarSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static br.com.serenitybddtemplate.utils.GeraNomesAleatoriosUtils.gerarNumeros;

public class GerenciarMarcadoresStepDefinitions {
    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarMarcadoresSteps gerenciarMarcadoresSteps;



    @And("preencho os detalhes de criar marcador:")
    public void preenchoDetalhesMarcador(DataTable detalhes) {
        List<Map<String,String>> data = detalhes.asMaps(String.class, String.class);

        String nomeMarcador = "";
        if(data.get(0).get("Nome").equals("Aleatorio")){
            nomeMarcador = "marc " + gerarNumeros();
        }else{
            nomeMarcador = data.get(0).get("Nome");
        }
        Serenity.setSessionVariable("NomeMarcador").to(nomeMarcador);

        gerenciarMarcadoresSteps.preencherNomeMarcador(nomeMarcador);
        gerenciarMarcadoresSteps.preencherDescricaoMarcador(data.get(0).get("descrição"));
        gerenciarMarcadoresSteps.clicarCriarMarcador();
    }



    @Then("acesso o marcador criado")
    public void clicarMarcadorCriado() {

        String nomeMarcador = Serenity.sessionVariableCalled("NomeMarcador");

        gerenciarMarcadoresSteps.clicarMarcadorCriado(nomeMarcador);
    }
    @Then("apago o marcador")
    public void apagarMarcador() {
        gerenciarMarcadoresSteps.apagarMarcador();
    }

    @Then("Sistema retorna '(.*)' para existencia do marcador")
    public void retornaMarcadorCriadoNaLista(boolean existencia) {
        String nomeMarcador = Serenity.sessionVariableCalled("NomeMarcador");

        Assert.assertEquals(existencia ,gerenciarMarcadoresSteps.retornaMarcadorCriado(nomeMarcador));
    }


    @Then("atualizo o marcador")
    public void clicarEmAtualizarMarcardor() {
        gerenciarMarcadoresSteps.clicarEmAtualizarMarcardor();
    }



    @And("preencho os detalhes para editar o marcador:")
    public void preenchoDetalhesEditarMarcador(DataTable detalhes) {
        List<Map<String,String>> data = detalhes.asMaps(String.class, String.class);

        String nomeMarcador = Serenity.sessionVariableCalled("NomeMarcador");

        String novoNomeMarcador = nomeMarcador + data.get(0).get("Nome");
        Serenity.setSessionVariable("NomeMarcador").to(novoNomeMarcador);

        gerenciarMarcadoresSteps.preencherNomeMarcador(data.get(0).get("Nome"));
        gerenciarMarcadoresSteps.preencherDescricaoMarcador(data.get(0).get("descrição"));
        gerenciarMarcadoresSteps.clicarEmAtualizarMarcardor();
    }








}
