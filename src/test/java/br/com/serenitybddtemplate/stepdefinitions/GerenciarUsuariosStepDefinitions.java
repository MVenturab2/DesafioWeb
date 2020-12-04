package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class GerenciarUsuariosStepDefinitions {
    @Steps
    CriarTarefaSteps criarTarefaSteps;

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarMarcadoresSteps gerenciarMarcadoresSteps;

    @Steps
    GerenciarUsuariosSteps gerenciarUsuariosSteps;

    @Steps
    CriarUsuarioSteps criarUsuarioSteps;

    @Steps
    MinhaContaSteps minhaContaSteps;

    @Steps
    LoginSteps loginSteps;

    @And("clico em criar nova conta")
    public void clicarEmCriarNovaConta() {
        gerenciarUsuariosSteps.clicarCriarNovaConta();
    }


    @And("preencho os detalhes da nova conta:")
    public void preenchoDetalhesDaNovaConta(DataTable detalhes) {
        List<Map<String,String>> data = detalhes.asMaps(String.class, String.class);

        criarUsuarioSteps.preencherNomeDeUsuario(data.get(0).get("Nome do usuario"));
        criarUsuarioSteps.preencherNomeVerdadeiro(data.get(0).get("nome verdadeiro"));
        criarUsuarioSteps.preencherEmail(data.get(0).get("email"));
        criarUsuarioSteps.preencherNivelDeAcesso(data.get(0).get("nivel de acesso"));

        if(data.get(0).get("nivel de acesso").equals("nao")) {
            criarUsuarioSteps.clicarHabilitado();
        }
        if(data.get(0).get("nivel de acesso").equals("nao")) {
            criarUsuarioSteps.clicarProtegido();
        }


        criarUsuarioSteps.clicarCriarUsuario();


    }

    @Then("Sistema apresenta mensagem de usuario criado com erro devido '(.*)'")
    public void retornaMensagemUsuarioCriado(String msgErro) {



        Assert.assertEquals(msgErro,criarUsuarioSteps.retornoUsuarioSalvoErro());
    }
    @Then("Sistema apresenta mensagem de usuario criado '(.*)'")
    public void retornaMarcadorCriado(String msg) {



        Assert.assertEquals(msg,criarUsuarioSteps.retornoUsuarioSalvo());
    }


    @When("Apago o usuario criado")
    public void apagarUsuario( ) {



        gerenciarUsuariosSteps.clicarApagarUsuario();
        gerenciarUsuariosSteps.clicarApagarConta();
    }

    @Then("sistema retorna mensagem '(.*)' para excluir conta")
    public void retornarMensagemApagarContaDeUsuario( String msg) {

        Assert.assertEquals(msg,gerenciarUsuariosSteps.retornarMensagemDeExclusao());
        gerenciarUsuariosSteps.cliqueAquiParaProsseguir();
    }

    @Then("preencho a senha antiga '(.*)' e a nova senha '(.*)' se for solicitado")
    public void retornarMensagemApagarContaDeUsuario( String velha, String nova) {

        //Assert.assertEquals("Alterar Conta",minhaContaSteps.retornarAlterarConta());
        if (minhaContaSteps.retornarAlterarConta().equals("Alterar Conta")) {

            gerenciarUsuariosSteps.preencherVelhaSenha(velha);
            gerenciarUsuariosSteps.preencherNovaSenha(nova);
            gerenciarUsuariosSteps.preencherNovaSenhaConfirmar(nova);

            gerenciarUsuariosSteps.clicarEmAtualizarUsuario();


        } else {
            loginSteps.clicarEmLogin();
        }
    }


    @Then("seleciono o usuario '(.*)' na tela de Gerenciar Usuarios")
    public void gerenciarUsuarioSelecionado(String usuario ) {


        gerenciarUsuariosSteps.clicarEmUsuarioSelecionado(usuario);
        mainSteps.clicarEmMinhaConta();
        minhaContaSteps.clicarEmPreferencias();



    }



}
