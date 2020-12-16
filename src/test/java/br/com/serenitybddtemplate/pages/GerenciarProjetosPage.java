package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerenciarProjetosPage extends PageBase {

    //Constructor
    public GerenciarProjetosPage(WebDriver driver){
        super(driver);
    }
    //Mapping

    By criarNovoProjetoButton = By.cssSelector("button.btn.btn-primary.btn-white.btn-round");
    By projetoCriadoButton = null;
    By todosProjetosCriadosButton = By.linkText("Todos os Projetos");
    By apagarProjetoButton = By.xpath("//input[@value='Apagar Projeto']");
    By criarNovoSubprojetoButton = By.xpath("//button[@type='submit']");
    By atualizarProjetoButton = By.xpath("//input[@value='Atualizar Projeto']");
    By selecionarSubProjetoCombobox = By.name("subproject_id");
    By adicionarComoSubprojetoButton = By.xpath("//input[@value='Adicionar como Subprojeto']");
    By desvincularSubprojetoButton = By.linkText("Desvincular");
    By nomeDaVersaoDoProjetoField = By.name("version");
    By adicionarVersaoDoProjetoButton = By.name("add_version");
    By adicionarEAlterarVersaoDoProjetoButton = By.name("add_and_edit_version");
    By versaoField = By.id("proj-version-new-version");
    By ordemPorDataField = By.id("proj-version-date-order");
    By descricaoDaVersaoField = By.id("proj-version-description");
    By liberadaCheckBox = By.xpath("//form[@id='manage-proj-version-update-form']/div/div[2]/div/div/table/tbody/tr[4]/td[2]/label/span");
    By obsoletoCheckbox = By.xpath("//form[@id='manage-proj-version-update-form']/div/div[2]/div/div/table/tbody/tr[5]/td[2]/label/span");
    By atualizarVersaoButton = By.xpath("//input[@value='Atualizar Versão']");
    By apagarVersaoDoProjetoButton = By.xpath("//input[@value='Apagar Versão']");
    // Categorias Globais
    By nomeCategoriaGlobalField = By.name("name");
    By adicionarCategoriaButton = By.xpath("//input[@value='Adicionar Categoria']");
    By adicionarEEditarCategoriaButton = By.name("add_and_edit_category");
    By alterarCategoriaDoProjetoTextArea = By.xpath("//*[@id='manage-proj-category-update-form']/div/div[1]/h4");
    By apagarCategoriaGlobalButton = By.xpath("//input[@value='Apagar Categoria']");
    By primeiraLinhaCategoriaGlobalTextArea = By.xpath("//div[@id='categories']/div/div[2]/div/div/table/tbody/tr/td");
    By erroCategoriaGlobalTextArea = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div[2]/p[2]");
    By atribuirUsuarioCategoriaGlobalCombobox = By.id("proj-category-assigned-to");
    By atualizarCategoriaButton = By.xpath("//input[@value='Atualizar Categoria']");
    By nomeCategoriaGlobalEditProjField = By.xpath("(//input[@name='name'])[2]");


    //Actions
    public void clicarCriarNovoProjeto(){
        click(criarNovoProjetoButton);
    }
    public Boolean verificoProjetoCriado(String projeto){
        projetoCriadoButton = By.partialLinkText(projeto);
        if(returnIfElementExistsLowTimeout(projetoCriadoButton)) {
            return true;
        }
        else{
            return false;
        }
    }
    public void acessarTodosProjetos(String projeto ) {
        projetoCriadoButton = By.partialLinkText(projeto);
        click(projetoCriadoButton);
        if(returnIfElementExistsLowTimeout(todosProjetosCriadosButton)) {
            click(todosProjetosCriadosButton);
            if(returnIfElementExistsLowTimeout(projetoCriadoButton)) {
                click(projetoCriadoButton);
            }
        }
    }

    public void acessoProjetoCriado(String projeto) {
        try {
            acessarTodosProjetos(projeto);
        } catch (Exception ignored) {
        }
    }

    public void apagarOProjeto(){
        click(apagarProjetoButton);
        click(apagarProjetoButton);
    }
    public void clicarEmCriarNovoSubprojeto(){
        click(criarNovoSubprojetoButton);
    }
    public void clicarEmAtualizarProjeto(){
        click(atualizarProjetoButton);
    }
    public void selecionarSubProjeto(String subprojeto){
        comboBoxSelectByVisibleText(selecionarSubProjetoCombobox,subprojeto);
    }
    public void clicarEmAdicionarComoSubprojeto(){
        click(adicionarComoSubprojetoButton);
    }
    public void clicarEmDesvincularSubprojeto(){
        click(desvincularSubprojetoButton);
    }
    public void preencherNomeDaVersaoDoProjeto(String versao){
        sendKeys(nomeDaVersaoDoProjetoField,versao);
    }
    public void clicarEmAdicionarVersaoDoProjeto(){
        click(adicionarVersaoDoProjetoButton);
    }
    public void clicarEmAdicionarEAlterarVersaoDoProjeto(){
        click(adicionarEAlterarVersaoDoProjetoButton);
    }
    public void preencherVersao(String versao){
        sendKeys(versaoField,versao);
    }
    public void preencherOrdemPorData(String ordemPorData){
        sendKeys(ordemPorDataField,ordemPorData);
    }
    public void preencherDescricaoDaVersao(String DescricaoDaVersao){
        sendKeys(descricaoDaVersaoField,DescricaoDaVersao);
    }
    public void clicarEmLiberada(){
        click(liberadaCheckBox);
    }
    public void clicarEmObsoleto(){
        click(obsoletoCheckbox);
    }
    public void clicarEmAtualizarVersao(){
        click(atualizarVersaoButton);
    }
    public void clicarEmApagarVersaoDoProjeto(){
        click(apagarVersaoDoProjetoButton);
    }

    // Categorias Globais
    public void preencherNomeCategoriaGlobal(String nome){
        sendKeys(nomeCategoriaGlobalField,nome);
    }
    public void preencherNomeCategoriaGlobalEditProj(String nome){
        sendKeys(nomeCategoriaGlobalEditProjField,nome);
    }
    public void clicarEmAdicionarCategoria(){
        click(adicionarCategoriaButton);
    }
    public void clicarEmAdicionarEEditarCategoria(){
        click(adicionarEEditarCategoriaButton);
    }
    public String retornarTelaAterarCategoriaGlobal(){
        return getText(alterarCategoriaDoProjetoTextArea);
    }
    public void apagarCategoriaGlobal(){
         click(apagarCategoriaGlobalButton);
         click(apagarCategoriaGlobalButton);
    }
    public String retornaPrimeiraLinhaCategoriaGlobal(){
        return getText(primeiraLinhaCategoriaGlobalTextArea);
    }
    public String retornaErroCategoriaGlobal(){
        return getText(erroCategoriaGlobalTextArea);
    }
    public void selecionarUsuarioCategoriaGlobal(String usuario){
        comboBoxSelectByVisibleText(atribuirUsuarioCategoriaGlobalCombobox,usuario);
    }
    public void clicarAtualizarCategoria( ){
        click(atualizarCategoriaButton);
    }

}
