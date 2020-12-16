package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.CriarUsuarioPage;
import net.thucydides.core.annotations.Step;

public class CriarUsuarioSteps {
    CriarUsuarioPage criarUsuarioPage;

    @Step("Criar usuario: preencher Nome De Usuario '{0}'")
    public void preencherNomeDeUsuario(String nomeUsuario) {
        criarUsuarioPage.preencherNomeDeUsuario(nomeUsuario);
    }
    @Step("Criar usuario: preencher Nome Verdadeiro '{0}'")
    public void preencherNomeVerdadeiro(String nomeVerdadeiro) {
        criarUsuarioPage.preencherNomeVerdadeiro(nomeVerdadeiro);
    }
    @Step("Criar usuario: preencher Email '{0}'")
    public void preencherEmail(String email) {
        criarUsuarioPage.preencherEmail(email);
    }
    @Step("Criar usuario: preencher Nivel De Acesso '{0}'")
    public void preencherNivelDeAcesso(String nivelDeAcesso) {
        criarUsuarioPage.preencherNivelDeAcesso(nivelDeAcesso);
    }
    @Step("Criar usuario: clicar Habilitado")
    public void clicarHabilitado( ) {
        criarUsuarioPage.clicarHabilitado();
    }
    @Step("Criar usuario: clicar Protegido")
    public void clicarProtegido( ) {
        criarUsuarioPage.clicarProtegido();
    }
    @Step("Criar usuario: clicar Criar Usuario")
    public void clicarCriarUsuario( ) {
        criarUsuarioPage.clicarCriarUsuario();
    }
    //retornos da pagina
    @Step("Criar usuario: retorno Usuario Salvo Erro")
    public String retornoUsuarioSalvoErro( ) {
        return criarUsuarioPage.retornoUsuarioSalvoErro();
    }
    @Step("Criar usuario: retorno Usuario Salvo")
    public String retornoUsuarioSalvo( ) {
        return criarUsuarioPage.retornoUsuarioSalvo();
    }

}
