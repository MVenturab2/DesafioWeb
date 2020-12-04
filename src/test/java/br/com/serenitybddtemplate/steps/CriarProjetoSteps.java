package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.CriarProjetoPage;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Step;

public class CriarProjetoSteps {
    CriarProjetoPage criarProjetoPage;

    @Step("Criar Projeto: preencher Nome Projeto")
    public void preencherNomeProjeto(String nomeProjeto) {
        criarProjetoPage.preencherNomeProjeto(nomeProjeto);
    }
    @Step("Criar Projeto: selecionar Estado")
    public void selecionarEstado(String estado) {
        criarProjetoPage.selecionarEstado( estado);
    }
    @Step("Criar Projeto: marcar Herdar Globais")
    public void marcarHerdarGlobais( ) {
        criarProjetoPage.marcarHerdarGlobais();
    }
    @Step("Criar Projeto: selecionar Visibilidade")
    public void selecionarVisibilidade(String visibilidade) {
        criarProjetoPage.selecionarVisibilidade( visibilidade);
    }
    @Step("Criar Projeto: preencher Descricao")
    public void preencherDescricao(String descricao) {
        criarProjetoPage.preencherDescricao(descricao);
    }
    @Step("Criar Projeto: clicar Adicionar Projeto")
    public void clicarAdicionarProjeto() {
        criarProjetoPage.clicarAdicionarProjeto();
    }


    @Step("Criar Projeto: retorna MSG Ao Salvar Projeto")
    public String retornaMSGAoSalvarProjeto() {
        return criarProjetoPage.retornaMSGAoSalvarProjeto();
    }





}
