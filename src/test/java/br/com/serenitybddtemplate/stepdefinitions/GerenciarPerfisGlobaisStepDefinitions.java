package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.CriarTarefaSteps;
import br.com.serenitybddtemplate.steps.GerenciarMarcadoresSteps;
import br.com.serenitybddtemplate.steps.GerenciarPerfisGlobaisSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static br.com.serenitybddtemplate.utils.GeraNomesAleatoriosUtils.gerarNumeros;

public class GerenciarPerfisGlobaisStepDefinitions {
    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarPerfisGlobaisSteps gerenciarPerfisGlobaisSteps;





    @And("preencho os detalhes de criar Perfil Global:")
    public void preenchoDetalhesDoPerfilGlobal(DataTable detalhes) {
        List<Map<String,String>> data = detalhes.asMaps(String.class, String.class);

        String plataforma = "";
        String so = "";
        String versaoSO = "";

        if(data.get(0).get("Plataforma").equals("Aleatorio")){
            plataforma = "p" + gerarNumeros();
        }else{
            plataforma = data.get(0).get("Plataforma");
        }
        if(data.get(0).get("Plataforma").equals("Aleatorio")){
            so = "s" + gerarNumeros();
        }else{
            so = data.get(0).get("SO");
        }
        if(data.get(0).get("Plataforma").equals("Aleatorio")){
            versaoSO = "v" + gerarNumeros();
        }else{
            versaoSO = data.get(0).get("Versão SO");
        }

        gerenciarPerfisGlobaisSteps.preencherPlataforma(plataforma);
        gerenciarPerfisGlobaisSteps.preencherOs(so);
        gerenciarPerfisGlobaisSteps.preencherVersaoOS(versaoSO);
        gerenciarPerfisGlobaisSteps.preencherDescricao(data.get(0).get("Descrição Adicional"));

        String perfilCriado = plataforma+" "+so+ " "+versaoSO ;
        Serenity.setSessionVariable("Perfil").to(perfilCriado);
        gerenciarPerfisGlobaisSteps.clicarAdicionarPerfil();
    }
    @Then("Sistema retorna a situação do perfil como '(.*)'")
    public void retornaPerfilGlobalCriado( boolean situacao) {


        String perfilCriado = Serenity.sessionVariableCalled("Perfil");

        Assert.assertEquals(situacao ,gerenciarPerfisGlobaisSteps.retornarPerfilExiste(perfilCriado));
    }


    @Then("seleciono perfil global")
    public void selecionoPerfilGlobal(  ) {
        String perfilCriado = Serenity.sessionVariableCalled("Perfil");
        gerenciarPerfisGlobaisSteps.selecionarPerfil(perfilCriado);
    }



    @Then("envio comando para apagar o perfil")
    public void enviarComandoParaApagarPerfil(  ) {

        gerenciarPerfisGlobaisSteps.marcarParaApagarPerfil();
        gerenciarPerfisGlobaisSteps.clicarEmEnviar();

    }



}
