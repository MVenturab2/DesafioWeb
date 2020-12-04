package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.CriarUsuarioPage;
import br.com.serenitybddtemplate.pages.MinhaContaPage;
import net.thucydides.core.annotations.Step;

public class MinhaContaSteps {
    MinhaContaPage minhaContaPage;

    @Step("minha Conta: retornar Alterar Conta ")
    public String retornarAlterarConta( ) {
        return minhaContaPage.retornarAlterarConta();
    }


    @Step("minha Conta: clicar Em Preferencias ")
    public void clicarEmPreferencias( ) {
        minhaContaPage.clicarEmPreferencias();
    }


    @Step("minha Conta: selecionar Projeto Padrao")
    public void selecionarProjetoPadrao(String projeto){
        minhaContaPage.selecionarProjetoPadrao(projeto);
    }

    @Step("minha Conta: clicarEmAtualizarPreferencias")
    public void clicarEmAtualizarPreferencias( ){
        minhaContaPage.clicarEmAtualizarPreferencias();
    }


}
