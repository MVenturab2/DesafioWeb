package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.MinhaContaPage;
import net.thucydides.core.annotations.Step;

public class MinhaContaSteps {
    MinhaContaPage minhaContaPage;

    @Step("minha Conta: clicar Em Preferencias ")
    public void clicarEmPreferencias( ) {
        minhaContaPage.clicarEmPreferencias();
    }
    @Step("minha Conta: selecionar Projeto Padrao '{0}'")
    public void selecionarProjetoPadrao(String projeto){
        minhaContaPage.selecionarProjetoPadrao(projeto);
    }
    @Step("minha Conta: clicarEmAtualizarPreferencias")
    public void clicarEmAtualizarPreferencias( ){
        minhaContaPage.clicarEmAtualizarPreferencias();
    }
    //retornos da pagina
    @Step("minha Conta: retornar Alterar Conta ")
    public String retornarAlterarConta( ) {
        return minhaContaPage.retornarAlterarConta();
    }
}
