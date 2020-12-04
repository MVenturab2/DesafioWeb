package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.CriarTarefaPage;
import net.thucydides.core.annotations.Step;

public class CriarTarefaSteps {
    CriarTarefaPage criarTarefaPage;

    @Step("Criar Tarefa: Selecionar Categoria")
    public void selecionarCategoria(String Categoria){
        criarTarefaPage.selecionarCategoria(Categoria);
    }
    @Step("Criar Tarefa: Selecionar Frequencia")
    public void selecionarFrequencia(String frequencia){
        criarTarefaPage.selecionarFrequencia(frequencia);
    }
    @Step("Criar Tarefa: Selecionar Gravidade")
    public void selecionarGravidade(String gravidade){
        criarTarefaPage.selecionarGravidade(gravidade);
    }
    @Step("Criar Tarefa: Selecionar Prioridade")
    public void selecionarPrioridade(String prioridade){
        criarTarefaPage.selecionarPrioridade(prioridade);
    }
    @Step("Criar Tarefa: Clicar Selecionar Perfil")
    public void clicarSelecionarPerfil(){
        criarTarefaPage.clicarSelecionarPerfil();
    }
    @Step("Criar Tarefa: Preencher Plataforma")
    public void preencherPlataforma(String plataforma){
        criarTarefaPage.preencherPlataforma(plataforma);
    }
    @Step("Criar Tarefa: Preencher SO")
    public void preencherSO(String so){
        criarTarefaPage.preencherSO(so);
    }
    @Step("Criar Tarefa: Preencher Versao SO")
    public void preencherVersaoSO(String versaoSO){
        criarTarefaPage.preencherVersaoSO(versaoSO);
    }
    @Step("Criar Tarefa: Selecionar Categoria Atribuir")
    public void selecionarCategoriaAtribuir(String atribuir){
        criarTarefaPage.selecionarCategoriaAtribuir(atribuir);
    }
    @Step("Criar Tarefa: Preencher Resumo")
    public void preencherResumo(String resumo){
        criarTarefaPage.preencherResumo(resumo);
    }
    @Step("Criar Tarefa: Preencher Descricao")
    public void preencherDescricao(String descricao){
        criarTarefaPage.preencherDescricao(descricao);
    }
    @Step("Criar Tarefa: Preencher Passos Para Reproduzir")
    public void preencherPassosParaReproduzir(String passosParaReproduzir){
        criarTarefaPage.preencherPassosParaReproduzir(passosParaReproduzir);
    }
    @Step("Criar Tarefa: Preencher Informacoes Adicionais")
    public void preencherInformacoesAdicionais(String informacoesAdicionais){
        criarTarefaPage.preencherInformacoesAdicionais(informacoesAdicionais);
    }
    @Step("Criar Tarefa: Preencher Aplicar Marcadores")
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
    @Step("Criar Tarefa: retorna MSG Ao Salvar Tarefa")
    public String retornaMSGAoSalvarTarefa(){
        return criarTarefaPage.retornaMSGAoSalvarTarefa();
    }








}
