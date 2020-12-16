package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.GerenciarUsuariosPage;
import net.thucydides.core.annotations.Step;

public class GerenciarUsuariosSteps {
    GerenciarUsuariosPage gerenciarUsuariosPage;


    @Step("Gerenciar Usuarios: clicar Criar Nova Conta")
    public void clicarCriarNovaConta(){
        gerenciarUsuariosPage.clicarCriarNovaConta();
    }
    @Step("Gerenciar Usuarios: preencher Procurar Conta '{0}'")
    public void preencherProcurarConta(String conta){
        gerenciarUsuariosPage.preencherProcurarConta(conta);
    }
    @Step("Gerenciar Usuarios: clicar Aplicar Filtro")
    public void clicarAplicarFiltro(){
        gerenciarUsuariosPage.clicarAplicarFiltro();
    }
    @Step("Gerenciar Usuarios: clicar Apagar Usuario")
    public void clicarApagarUsuario(){
        gerenciarUsuariosPage.clicarApagarUsuario();
    }
    @Step("Gerenciar Usuarios: clicar Apagar Conta")
    public void clicarApagarConta(){
        gerenciarUsuariosPage.clicarApagarConta();
    }
    @Step("Gerenciar Usuarios: gerenciar Usuario Selecionado '{0}'")
    public void clicarEmUsuarioSelecionado(String usuario){
        gerenciarUsuariosPage.clicarEmUsuarioSelecionado(usuario);
    }
    //Alterar senha
    @Step("Gerenciar Usuarios: preencher Velha Senha '{0}'")
    public void preencherVelhaSenha(String velhaSenha){
        gerenciarUsuariosPage.preencherVelhaSenha(velhaSenha);
    }
    @Step("Gerenciar Usuarios: preencher Nova Senha '{0}'")
    public void preencherNovaSenha(String novaSenha){
        gerenciarUsuariosPage.preencherNovaSenha(novaSenha);
    }
    @Step("Gerenciar Usuarios: preencher Nova Senha Confirmar '{0}'")
    public void preencherNovaSenhaConfirmar(String novaSenha){
        gerenciarUsuariosPage.preencherNovaSenhaConfirmar(novaSenha);
    }
    @Step("Gerenciar Usuarios: clicar Em Atualizar Usuario")
    public void clicarEmAtualizarUsuario(){
        gerenciarUsuariosPage.clicarEmAtualizarUsuario();
    }
    @Step("Gerenciar Usuarios: clique Aqui Para Prosseguir")
    public void cliqueAquiParaProsseguir(){
        gerenciarUsuariosPage.cliqueAquiParaProsseguir();
    }

    //retornos da pagina
    @Step("Gerenciar Usuarios: retornar Mensagem De Exclusao")
    public String retornarMensagemDeExclusao(){
        return gerenciarUsuariosPage.retornarMensagemDeExclusao();
    }



}
