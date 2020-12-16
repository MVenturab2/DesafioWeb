package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.CriarProjetoSteps;
import br.com.serenitybddtemplate.steps.CriarTarefaSteps;
import br.com.serenitybddtemplate.steps.GerenciarProjetosSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import static br.com.serenitybddtemplate.utils.GeraNomesAleatoriosUtils.gerarNumeros;

public class GerenciarCategoriasGlobaisStepDefinitions {

    @Steps
    GerenciarProjetosSteps gerenciarProjetosSteps;

    @And("^preencho o nome da categoria global '(.*)'$")
    public void adicionarCategoriaGlobal(String nome) {
        String nomeCategoriaGlobal = "";
        if(nome.equals("Aleatorio")){
            nomeCategoriaGlobal = "Categ " + gerarNumeros();
        }else if(nome.equals("repetido")){
            nomeCategoriaGlobal = gerenciarProjetosSteps.retornaPrimeiraLinhaCategoriaGlobal();
        }else{
            nomeCategoriaGlobal = nome;
        }
        Serenity.setSessionVariable("Categoria Global").to(nomeCategoriaGlobal);
        gerenciarProjetosSteps.preencherNomeCategoriaGlobal(nomeCategoriaGlobal);
    }

    @And("^preencho o nome da categoria global '(.*)' no campo da edição do projeto$")
    public void adicionarCategoriaGlobalNaEdicaoDoProj(String nome) {
        String nomeCategoriaGlobal = "";
        if(nome.equals("Aleatorio")){
            nomeCategoriaGlobal = "Categ " + gerarNumeros();
        }else{
            nomeCategoriaGlobal = nome;
        }
        Serenity.setSessionVariable("Categoria Global").to(nomeCategoriaGlobal);
        gerenciarProjetosSteps.preencherNomeCategoriaGlobalEditProj(nomeCategoriaGlobal);
    }

    @And("^clico em adicionar Categoria Global$")
    public void clicarEmAdicionarCategoria() {
        gerenciarProjetosSteps.clicarEmAdicionarCategoria();
    }

    @And("^clico em adicionar e Editar Categoria Global$")
    public void clicarEmAdicionarEEditarCategoria() {
        gerenciarProjetosSteps.clicarEmAdicionarEEditarCategoria();
    }

    @And("^sistema vai para tela de alteração da Categoria Global$")
    public void retornarNomeCategoriaGlobalEmAlterar() {
        Assert.assertEquals("Alterar Categoria do Projeto" ,gerenciarProjetosSteps.retornarTelaAterarCategoriaGlobal());
    }

    @And("^Apago a categoria global criada$")
    public void apagarCategoriaGlobal() {
        gerenciarProjetosSteps.apagarCategoriaGlobal();
    }

    @Then("sistema apresenta mensagem de erro ao criar Categoria devido '(.*)'")
    public void retornarMensagemApagarContaDeUsuario(String msg) {
        Assert.assertEquals(msg,gerenciarProjetosSteps.retornaErroCategoriaGlobal());
    }

    @Then("seleciono o usuario '(.*)' na atribuição da Categoria Global")
    public void selecionarUsuarioCategoriaGlobal(String usuario) {
        gerenciarProjetosSteps.selecionarUsuarioCategoriaGlobal(usuario);
    }

    @Then("atualizo a Categoria Global")
    public void clicarAtualizarCategoria() {
        gerenciarProjetosSteps.clicarAtualizarCategoria();
    }

}
