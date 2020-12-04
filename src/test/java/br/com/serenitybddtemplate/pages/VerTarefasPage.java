package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerTarefasPage extends PageBase {

    //Constructor
    public VerTarefasPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By imprimirTarefasButton = By.linkText("Imprimir Tarefas");// //a[contains(text(),'Imprimir Tarefas')]    css=div.btn-toolbar > div.btn-group.pull-left > a.btn.btn-primary.btn-white.btn-round.btn-sm
    By imprimirWordButton = By.cssSelector("i.fa.fa-file-word-o");

    By exportarParaArquivoCSVButton = By.linkText("Exportar para Arquivo CSV");

    By ExportacaoParaExcelButton = By.linkText("Exportação para Excel");

    By resumoButton = By.xpath("//a[contains(text(),'Resumo')]");



    By tarefaCriadaButton = null;

    //Detalhes da tarefa
    By idDaTarefaTextArea = By.cssSelector("td.bug-id");



    By relacionamentoDeTarefasCombobox = By.name("rel_type");
    By tarefaDoRelacionamentoField = By.name("dest_bug_id");
    By adicionarRelacionamentoButton = By.name("add_relationship");

    By criarCloneButton = By.xpath("//input[@value='Criar Clone']");


    By fecharTarefaButton = By.xpath("//input[@value='Fechar']");



    //Actions
    public void clicarEmImprimirTarefas(){
        click(imprimirTarefasButton);
        click(imprimirWordButton);
    }
    public void clicarExportarArquivoCSV(){
        click(exportarParaArquivoCSVButton);
    }
    public void clicarExportarExcel(){
        click(ExportacaoParaExcelButton);
    }
    public void clicarResumo(){
        click(resumoButton);
    }


    public String retornarIDDaTarefaTextArea(){
        return getText(idDaTarefaTextArea);
    }



    public Boolean verificoTarefaCriado(String idTarefa){
        tarefaCriadaButton = By.partialLinkText(idTarefa);
        if(returnIfElementExistsLowTimeout(tarefaCriadaButton)) {
            return true;
        }
        else{

            return false;
        }
    }


    public void definirRelacaoDaTarefa(String relacionamento){
        comboBoxSelectByVisibleText(relacionamentoDeTarefasCombobox,relacionamento);
    }
    public void definirTarefaDaRelacao(String tarefa){
        sendKeys(tarefaDoRelacionamentoField,tarefa);
    }
    public void adicionarRelacionamentoDeTarefas(){
        click(adicionarRelacionamentoButton);
    }

    public void clicarEmCriarClone(){
        click(criarCloneButton);
    }

    public void clicarEmFecharTarefa(){
        click(fecharTarefaButton);
    }



}
