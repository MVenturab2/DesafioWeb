package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.VerTarefasPage;
import net.thucydides.core.annotations.Step;

public class VerTarefasSteps {
    VerTarefasPage verTarefasPage;

    @Step("Ver tarefas: clicar Em Imprimir Tarefas")
    public void clicarEmImprimirTarefas(){
        verTarefasPage.clicarEmImprimirTarefas();
    }
    @Step("Ver tarefas: clicar Exportar Arquivo CSV")
    public void clicarExportarArquivoCSV(){
        verTarefasPage.clicarExportarArquivoCSV();
    }
    @Step("Ver tarefas: clicar Exportar Excel")
    public void clicarExportarExcel(){
        verTarefasPage.clicarExportarExcel();
    }
    @Step("Ver tarefas: clicar Resumo")
    public void clicarResumo(){
        verTarefasPage.clicarResumo();
    }
    @Step("Ver tarefas: retornar ID Da Tarefa TextArea")
    public String retornarIDDaTarefaTextArea(){
        return verTarefasPage.retornarIDDaTarefaTextArea();
    }
    @Step("Ver tarefas: verifico Tarefa Criado")
    public boolean verificoTarefaCriado(String idTarefa){
        return verTarefasPage.verificoTarefaCriado(idTarefa);
    }
    @Step("Ver tarefas: definir Relacao Da Tarefa")
    public void definirRelacaoDaTarefa( String relacionamento){
        verTarefasPage.definirRelacaoDaTarefa(relacionamento);
    }
    @Step("Ver tarefas: definir Tarefa Da Relacao")
    public void definirTarefaDaRelacao(String tarefa){
        verTarefasPage.definirTarefaDaRelacao(tarefa);
    }
    @Step("Ver tarefas: adicionar Relacionamento De Tarefas")
    public void adicionarRelacionamentoDeTarefas( ){
        verTarefasPage.adicionarRelacionamentoDeTarefas();
    }
    @Step("Ver tarefas: clicar Em Criar Clone")
    public void clicarEmCriarClone( ){
        verTarefasPage.clicarEmCriarClone();
    }
    @Step("Ver tarefas: clicar Em Fechar Tarefa")
    public void clicarEmFecharTarefa( ){
        verTarefasPage.clicarEmFecharTarefa();
    }
    @Step("Ver tarefas: selecionar Resolucao")
    public void selecionarResolucao(String resolucao ){
        verTarefasPage.selecionarResolucao(resolucao);
    }
    @Step("Ver tarefas: preencher Num Duplicado")
    public void preencherNumDuplicado( String numDuplicado){
        verTarefasPage.preencherNumDuplicado(numDuplicado);
    }
    @Step("Ver tarefas: Selecionar Atribuicao")
    public void SelecionarAtribuicao(String atribuicao ){
        verTarefasPage.SelecionarAtribuicao(atribuicao);
    }
    @Step("Ver tarefas: clicar Em Visibilidade Privado")
    public void clicarEmVisibilidadePrivado( ){
        verTarefasPage.clicarEmVisibilidadePrivado();
    }
    @Step("Ver tarefas: preencher Anotacao")
    public void preencherAnotacao(String anotacao ){
        verTarefasPage.preencherAnotacao(anotacao);
    }
    @Step("Ver tarefas: clicar Em Confirmar Fechar Tarefa")
    public void clicarEmConfirmarFecharTarefa( ){
        verTarefasPage.clicarEmConfirmarFecharTarefa();
    }
    @Step("Ver tarefas: retornar Estado da tarefa")
    public String retornarEstado( ){
        return verTarefasPage.retornarEstado();
    }
}
