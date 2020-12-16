package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.CriarTarefaPage;
import net.thucydides.core.annotations.Step;

public class CriarTarefaSteps {
    CriarTarefaPage criarTarefaPage;

    @Step("Criar Tarefa: Selecionar Categoria '{0}'")
    public void selecionarCategoria(String Categoria){
        criarTarefaPage.selecionarCategoria(Categoria);
    }
    @Step("Criar Tarefa: Selecionar Frequencia '{0}'")
    public void selecionarFrequencia(String frequencia){
        criarTarefaPage.selecionarFrequencia(frequencia);
    }
    @Step("Criar Tarefa: Selecionar Gravidade '{0}'")
    public void selecionarGravidade(String gravidade){
        criarTarefaPage.selecionarGravidade(gravidade);
    }
    @Step("Criar Tarefa: Selecionar Prioridade '{0}'")
    public void selecionarPrioridade(String prioridade){
        criarTarefaPage.selecionarPrioridade(prioridade);
    }
    @Step("Criar Tarefa: Clicar Selecionar Perfil")
    public void clicarSelecionarPerfil(){
        criarTarefaPage.clicarSelecionarPerfil();
    }
    @Step("Criar Tarefa: Preencher Plataforma '{0}'")
    public void preencherPlataforma(String plataforma){
        criarTarefaPage.preencherPlataforma(plataforma);
    }
    @Step("Criar Tarefa: Preencher SO '{0}'")
    public void preencherSO(String so){
        criarTarefaPage.preencherSO(so);
    }
    @Step("Criar Tarefa: Preencher Versao SO '{0}'")
    public void preencherVersaoSO(String versaoSO){
        criarTarefaPage.preencherVersaoSO(versaoSO);
    }
    @Step("Criar Tarefa: Selecionar Categoria Atribuir '{0}'")
    public void selecionarCategoriaAtribuir(String atribuir){
        criarTarefaPage.selecionarCategoriaAtribuir(atribuir);
    }
    @Step("Criar Tarefa: Preencher Resumo '{0}'")
    public void preencherResumo(String resumo){
        criarTarefaPage.preencherResumo(resumo);
    }
    @Step("Criar Tarefa: Preencher Descricao '{0}'")
    public void preencherDescricao(String descricao){
        criarTarefaPage.preencherDescricao(descricao);
    }
    @Step("Criar Tarefa: Preencher Passos Para Reproduzir '{0}'")
    public void preencherPassosParaReproduzir(String passosParaReproduzir){
        criarTarefaPage.preencherPassosParaReproduzir(passosParaReproduzir);
    }
    @Step("Criar Tarefa: Preencher Informacoes Adicionais '{0}'")
    public void preencherInformacoesAdicionais(String informacoesAdicionais){
        criarTarefaPage.preencherInformacoesAdicionais(informacoesAdicionais);
    }
    @Step("Criar Tarefa: Preencher Aplicar Marcadores '{0}'")
    public void preencherAplicarMarcadores(String aplicarMarcadores){
        criarTarefaPage.preencherAplicarMarcadores(aplicarMarcadores);
    }
    @Step("Criar Tarefa: Clicar Enviar Arquivos")
    public void clicarEnviarArquivos(){
        criarTarefaPage.clicarEnviarArquivos();
    }
    @Step("Criar Tarefa: Clicar Visibilidade Publico")
    public void clicarVisibilidadePublico(){
        criarTarefaPage.clicarVisibilidadePublico();
    }
    @Step("Criar Tarefa: Clicar Visibilidade Privado")
    public void clicarVisibilidadePrivado(){
        criarTarefaPage.clicarVisibilidadePrivado();
    }
    @Step("Criar Tarefa: Clicar Continuar Relatando")
    public void clicarContinuarRelatando(){
        criarTarefaPage.clicarContinuarRelatando();
    }
    @Step("Criar Tarefa: Clicar Criar Nova Tarefa")
    public void clicarCriarNovaTarefa(){
        criarTarefaPage.clicarCriarNovaTarefa();
    }
    //retornos da pagina
    @Step("Criar Tarefa: retorna MSG Ao Salvar Tarefa")
    public String retornaMSGAoSalvarTarefa(){
        return criarTarefaPage.retornaMSGAoSalvarTarefa();
    }








}
