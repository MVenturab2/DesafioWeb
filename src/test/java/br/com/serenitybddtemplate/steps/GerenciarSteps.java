package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.GerenciarPage;
import net.thucydides.core.annotations.Step;

public class GerenciarSteps {
    GerenciarPage gerenciarPage;

    @Step("Gerenciar Page: clicar Visao Geral")
    public void clicarVisaoGeral(){
        gerenciarPage.clicarVisaoGeral();
    }
    @Step("Gerenciar Page: clicar Gerenciar Usuarios")
    public void clicarGerenciarUsuarios(){
        gerenciarPage.clicarGerenciarUsuarios();
    }
    @Step("Gerenciar Page: clicar Gerenciar Projetos")
    public void clicarGerenciarProjetos(){
        gerenciarPage.clicarGerenciarProjetos();
    }
    @Step("Gerenciar Page: clicar Gerenciar Marcadores")
    public void clicarGerenciarMarcadores(){
        gerenciarPage.clicarGerenciarMarcadores();
    }
    @Step("Gerenciar Page: clicar Gerenciar campos Personalizados")
    public void clicarGerenciarcamposPersonalizados(){
        gerenciarPage.clicarGerenciarcamposPersonalizados();
    }
    @Step("Gerenciar Page: clicar Gerenciar perfis Globais")
    public void clicarGerenciarperfisGlobais(){
        gerenciarPage.clicarGerenciarperfisGlobais();
    }
    @Step("Gerenciar Page: clicar Gerenciar plugins")
    public void clicarGerenciarplugins(){
        gerenciarPage.clicarGerenciarplugins();
    }
    @Step("Gerenciar Page: clicar Gerenciar configuracao")
    public void clicarGerenciarconfiguracao(){
        gerenciarPage.clicarGerenciarconfiguracao();
    }
    // retornos da pagina
    @Step("Gerenciar Page: retornar Visao Geral")
    public String retornaVisaoGeral(){
        return gerenciarPage.retornaVisaoGeral();
    }
    @Step("Gerenciar Page: retornar Gerenciar Usuarios")
    public String retornaGerenciarUsuarios(){
        return gerenciarPage.retornaGerenciarUsuarios();
    }
    @Step("Gerenciar Page: retornar Gerenciar Projetos")
    public String retornaGerenciarProjetos(){
        return gerenciarPage.retornaGerenciarProjetos();
    }
    @Step("Gerenciar Page: retornar Gerenciar Marcadores")
    public String retornaGerenciarMarcadores(){
        return gerenciarPage.retornaGerenciarMarcadores();
    }
    @Step("Gerenciar Page: retornar Gerenciar campos Personalizados")
    public String retornaGerenciarcamposPersonalizados(){
        return gerenciarPage.retornaGerenciarcamposPersonalizados();
    }
    @Step("Gerenciar Page: retornar Gerenciar perfis Globais")
    public String retornaGerenciarperfisGlobais(){
        return gerenciarPage.retornaGerenciarperfisGlobais();
    }
    @Step("Gerenciar Page: retornar Gerenciar plugins")
    public String retornaGerenciarplugins(){
        return gerenciarPage.retornaGerenciarplugins();
    }
    @Step("Gerenciar Page: retornar Gerenciar configuracao")
    public String retornaGerenciarconfiguracao(){
        return gerenciarPage.retornaGerenciarconfiguracao();
    }
}
