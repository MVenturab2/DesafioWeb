package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerenciarMarcadoresPage extends PageBase {

    //Constructor
    public GerenciarMarcadoresPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By nomeMarcadorField = By.name("name");
    By descricaoMarcadorField = By.id("tag-description");
    By criarMarcadorButton = By.name("config_set");
    By apagarMarcadoroButton = By.xpath("//input[@value='Apagar Marcador']");
    By atualizarMarcadorButton = By.xpath("//input[@value='Atualizar Marcador']");
    By marcadorCriadoButton = null;

    //Actions
    public void clicarCriarMarcador(){
        click(criarMarcadorButton);
    }
    public void preencherNomeMarcador(String nome){
        sendKeys(nomeMarcadorField,nome);
    }
    public void preencherDescricaoMarcador(String descricao){
        sendKeys(descricaoMarcadorField,descricao);
    }
    public void clicarMarcadorCriado(String marcador){
        marcadorCriadoButton = By.partialLinkText(marcador);
        click(marcadorCriadoButton);
    }
    public void apagarMarcador(){
        click(apagarMarcadoroButton);
    }
    public void clicarEmAtualizarMarcardor(){
        click(atualizarMarcadorButton);
    }
    //retornos da pagina
    public Boolean retornaMarcadorCriado(String marcador){
        marcadorCriadoButton = By.linkText(marcador);
        if(returnIfElementExistsLowTimeout(marcadorCriadoButton)) {
            return true;
        }
        else{
            return false;
        }
    }
}