package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.CriarProjetoPage;
import br.com.serenitybddtemplate.pages.CriarUsuarioPage;
import net.thucydides.core.annotations.Step;

public class CriarUsuarioSteps {
    CriarUsuarioPage criarUsuarioPage;

    @Step("Criar Projeto: preencher Nome De Usuario")
    public void preencherNomeDeUsuario(String nomeUsuario) {
        criarUsuarioPage.preencherNomeDeUsuario(nomeUsuario);
    }
    @Step("Criar Projeto: preencher Nome Verdadeiro")
    public void preencherNomeVerdadeiro(String nomeVerdadeiro) {
        criarUsuarioPage.preencherNomeVerdadeiro(nomeVerdadeiro);
    }
    @Step("Criar Projeto: preencher Email")
    public void preencherEmail(String email) {
        criarUsuarioPage.preencherEmail(email);
    }
    @Step("Criar Projeto: preencher Nivel De Acesso")
    public void preencherNivelDeAcesso(String nivelDeAcesso) {
        criarUsuarioPage.preencherNivelDeAcesso(nivelDeAcesso);
    }
    @Step("Criar Projeto: clicar Habilitado")
    public void clicarHabilitado( ) {
        criarUsuarioPage.clicarHabilitado();
    }
    @Step("Criar Projeto: clicar Protegido")
    public void clicarProtegido( ) {
        criarUsuarioPage.clicarProtegido();
    }
    @Step("Criar Projeto: clicar Criar Usuario")
    public void clicarCriarUsuario( ) {
        criarUsuarioPage.clicarCriarUsuario();
    }

    @Step("Criar Projeto: retorno Usuario Salvo Erro")
    public String retornoUsuarioSalvoErro( ) {
        return criarUsuarioPage.retornoUsuarioSalvoErro();
    }

    @Step("Criar Projeto: retorno Usuario Salvo")
    public String retornoUsuarioSalvo( ) {
        return criarUsuarioPage.retornoUsuarioSalvo();
    }



}
