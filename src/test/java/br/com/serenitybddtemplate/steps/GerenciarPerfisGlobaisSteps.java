package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.GerenciarMarcadoresPage;
import br.com.serenitybddtemplate.pages.GerenciarPerfisGlobaisPage;
import net.thucydides.core.annotations.Step;

public class GerenciarPerfisGlobaisSteps {
    GerenciarPerfisGlobaisPage gerenciarPerfisGlobaisPage;




    @Step("Gerenciar Perfis Globais: preencher Plataforma")
    public void preencherPlataforma(String plataforma){
        gerenciarPerfisGlobaisPage.preencherPlataforma(plataforma);
    }
    @Step("Gerenciar Perfis Globais: preencher Os")
    public void preencherOs(String os){
        gerenciarPerfisGlobaisPage.preencherOs(os);
    }
    @Step("Gerenciar Perfis Globais: preencher Versao OS")
    public void preencherVersaoOS(String versaoOS){
        gerenciarPerfisGlobaisPage.preencherVersaoOS(versaoOS);
    }
    @Step("Gerenciar Perfis Globais: preencher Descricao")
    public void preencherDescricao(String descricao){
        gerenciarPerfisGlobaisPage.preencherDescricao(descricao);
    }
    @Step("Gerenciar Perfis Globais: clicar Criar Marcador")
    public void clicarAdicionarPerfil( ){
        gerenciarPerfisGlobaisPage.clicarAdicionarPerfil();
    }
    @Step("Gerenciar Perfis Globais: selecionar Perfil")
    public void selecionarPerfil(String perfil ){
        gerenciarPerfisGlobaisPage.selecionarPerfil(perfil);
    }

    @Step("Gerenciar Perfis Globais: retornar Perfil Existe")
    public boolean retornarPerfilExiste(String perfil ){
        return gerenciarPerfisGlobaisPage.retornarPerfilExiste(perfil);
    }

    @Step("Gerenciar Perfis Globais: marcar Para Apagar Perfil")
    public void marcarParaApagarPerfil( ){
        gerenciarPerfisGlobaisPage.marcarParaApagarPerfil();
    }
    @Step("Gerenciar Perfis Globais: clicar Em Enviar Alterações")
    public void clicarEmEnviar( ){
        gerenciarPerfisGlobaisPage.clicarEmEnviar();
    }




}
