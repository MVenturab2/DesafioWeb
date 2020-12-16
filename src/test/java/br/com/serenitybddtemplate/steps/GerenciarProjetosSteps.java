package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.GerenciarProjetosPage;
import net.thucydides.core.annotations.Step;

public class GerenciarProjetosSteps {
    GerenciarProjetosPage gerenciarProjetosPage;

    @Step("Gerenciar Projetos Page: clicar Criar Novo Projeto")
    public void clicarCriarNovoProjeto(){
        gerenciarProjetosPage.clicarCriarNovoProjeto();
    }
    @Step("Criar Projeto: verifico Projeto Criado '{0}'")
    public boolean verificoProjetoCriado(String projeto) {
        return gerenciarProjetosPage.verificoProjetoCriado(projeto);
    }
    @Step("Criar Projeto: acesso Projeto Criado '{0}'")
    public void acessoProjetoCriado(String projeto) {
        gerenciarProjetosPage.acessoProjetoCriado(projeto);
    }
    @Step("Gerenciar Projetos: clicar Em Criar Novo Subprojeto")
    public void clicarEmCriarNovoSubprojeto( ) {
        gerenciarProjetosPage.clicarEmCriarNovoSubprojeto();
    }
    @Step("Criar Projeto: clico em apagar Projeto")
    public void apagarOProjeto() {
        gerenciarProjetosPage.apagarOProjeto();
    }
    @Step("Gerenciar Projetos: clicar Em Atualizar Projeto")
    public void clicarEmAtualizarProjeto() {
        gerenciarProjetosPage.clicarEmAtualizarProjeto();
    }
    @Step("Gerenciar Projetos: selecionar SubProjeto '{0}'")
    public void selecionarSubProjeto(String subprojeto) {
        gerenciarProjetosPage.selecionarSubProjeto(subprojeto);
    }
    @Step("Gerenciar Projetos: clicar Em Adicionar Como Subprojeto")
    public void clicarEmAdicionarComoSubprojeto() {
        gerenciarProjetosPage.clicarEmAdicionarComoSubprojeto();
    }
    @Step("Gerenciar Projetos: clicar em desvincular Subprojeto")
    public void clicarEmDesvincularSubprojeto() {
        gerenciarProjetosPage.clicarEmDesvincularSubprojeto();
    }
    @Step("Gerenciar Projetos: preencher Nome Da Versao Do Projeto '{0}'")
    public void preencherNomeDaVersaoDoProjeto(String versao) {
        gerenciarProjetosPage.preencherNomeDaVersaoDoProjeto(versao);
    }
    @Step("Gerenciar Projetos: clicar Em Adicionar Versao Do Projeto")
    public void clicarEmAdicionarVersaoDoProjeto() {
        gerenciarProjetosPage.clicarEmAdicionarVersaoDoProjeto();
    }
    @Step("Gerenciar Projetos: clicar Em Adicionar E Alterar Versao Do Projeto")
    public void clicarEmAdicionarEAlterarVersaoDoProjeto() {
        gerenciarProjetosPage.clicarEmAdicionarEAlterarVersaoDoProjeto();
    }
    @Step("Gerenciar Projetos: preencher Versao '{0}'")
    public void preencherVersao(String versao) {
        gerenciarProjetosPage.preencherVersao(versao);
    }
    @Step("Gerenciar Projetos: preencher Ordem Por Data '{0}'")
    public void preencherOrdemPorData(String ordemPorData) {
        gerenciarProjetosPage.preencherOrdemPorData(ordemPorData);
    }
    @Step("Gerenciar Projetos: preencher Descricao Da Versao '{0}'")
    public void preencherDescricaoDaVersao(String descricao) {
        gerenciarProjetosPage.preencherDescricaoDaVersao(descricao);
    }
    @Step("Gerenciar Projetos: clicar Em Liberada")
    public void clicarEmLiberada() {
        gerenciarProjetosPage.clicarEmLiberada();
    }
    @Step("Gerenciar Projetos: clicar Em Obsoleto")
    public void clicarEmObsoleto() {
        gerenciarProjetosPage.clicarEmObsoleto();
    }
    @Step("Gerenciar Projetos: clicar Em Atualizar Versao")
    public void clicarEmAtualizarVersao() {
        gerenciarProjetosPage.clicarEmAtualizarVersao();
    }
    @Step("Gerenciar Projetos: clicar Em Apagar Versao Do Projeto")
    public void clicarEmApagarVersaoDoProjeto() {
        gerenciarProjetosPage.clicarEmApagarVersaoDoProjeto();
    }

    // Categorias Globais
    @Step("Gerenciar Projetos: preencher Nome Categoria Global '{0}'")
    public void preencherNomeCategoriaGlobal(String nome){
        gerenciarProjetosPage.preencherNomeCategoriaGlobal(nome);
    }
    @Step("Gerenciar Projetos: preencher Nome Categoria Global na edição do projeto '{0}'")
    public void preencherNomeCategoriaGlobalEditProj(String nome){
        gerenciarProjetosPage.preencherNomeCategoriaGlobalEditProj(nome);
    }
    @Step("Gerenciar Projetos: clicar Em Adicionar Categoria")
    public void clicarEmAdicionarCategoria(){
        gerenciarProjetosPage.clicarEmAdicionarCategoria();
    }
    @Step("Gerenciar Projetos: clicar Em Adicionar E Editar Categoria")
    public void clicarEmAdicionarEEditarCategoria(){
        gerenciarProjetosPage.clicarEmAdicionarEEditarCategoria();
    }
    @Step("Gerenciar Projetos: retornar Tela Aterar Categoria Global")
    public String retornarTelaAterarCategoriaGlobal(){
        return gerenciarProjetosPage.retornarTelaAterarCategoriaGlobal();
    }
    @Step("Gerenciar Projetos: apagar Categoria Global")
    public void apagarCategoriaGlobal(){
        gerenciarProjetosPage.apagarCategoriaGlobal();
    }
    @Step("Gerenciar Projetos: retorna Primeira Linha Categoria Global")
    public String retornaPrimeiraLinhaCategoriaGlobal(){
        return gerenciarProjetosPage.retornaPrimeiraLinhaCategoriaGlobal();
    }
    @Step("Gerenciar Projetos: retorna Erro Categoria Global")
    public String retornaErroCategoriaGlobal(){
        return gerenciarProjetosPage.retornaErroCategoriaGlobal();
    }
    @Step("Gerenciar Projetos: selecionar Usuario atribuido a Categoria Global '{0}'")
    public void selecionarUsuarioCategoriaGlobal(String usuario){
         gerenciarProjetosPage.selecionarUsuarioCategoriaGlobal(usuario);
    }
    @Step("Gerenciar Projetos: clicarAtualizarCategoria")
    public void clicarAtualizarCategoria( ){
        gerenciarProjetosPage.clicarAtualizarCategoria();
    }

}
