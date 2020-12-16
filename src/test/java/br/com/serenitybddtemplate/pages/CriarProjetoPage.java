package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarProjetoPage extends PageBase {

    //Constructor
    public CriarProjetoPage(WebDriver driver) {
        super(driver);
    }

    //Mapping
    By nomeProjetoField = By.id("project-name");
    By estadoCombobox = By.id("project-status");
    By herdarGlobaisCheckbox = By.xpath("//*[@id='manage-project-create-form']/div/div[2]/div/div/table/tbody/tr[3]/td[2]/label/span");
    By visibilidadeCombobox = By.id("project-view-state");
    By descricaoField = By.id("project-description");
    By adicionarProjetoButton = By.xpath("//input[@value='Adicionar projeto']");
    //retornos da pagina
    By retornoAoSalvarProjetoTextArea =  By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div/div[2]/p");

    //Actions
    public void preencherNomeProjeto(String nomeProjeto) {
        sendKeys(nomeProjetoField, nomeProjeto);
    }
    public void selecionarEstado(String estado) {
        comboBoxSelectByVisibleText(estadoCombobox, estado);
    }
    public void marcarHerdarGlobais( ) {
        click(herdarGlobaisCheckbox);
    }
    public void selecionarVisibilidade(String visibilidade) {
        comboBoxSelectByVisibleText(visibilidadeCombobox, visibilidade);
    }
    public void preencherDescricao(String descricao) {
        sendKeys(descricaoField, descricao);
    }
    public void clicarAdicionarProjeto() {
        click(adicionarProjetoButton);
    }
    //retornos da pagina
    public String retornaMSGAoSalvarProjeto() {
        return getText(retornoAoSalvarProjetoTextArea);
    }

}