package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerenciarPerfisGlobaisPage extends PageBase {

    //Constructor
    public GerenciarPerfisGlobaisPage(WebDriver driver){
        super(driver);
    }
    //Mapping

    By plataformaField = By.id("platform");
    By osField = By.id("os");
    By versaoOSField = By.id("os-version");
    By descricaoField = By.id("description");
    By adicionarPerfilButton = By.xpath("//input[@value='Adicionar Perfil']");
    By selecionarPerfilCombobox = By.id("select-profile");
    By ParaApagarPerfilButton = By.xpath("//*[@id='account-profile-update-form']/div/div[2]/div[1]/div/table/tbody/tr[2]/td[2]/label/span");
    By EnviarButton = By.xpath("//input[@value='Enviar']");

    //Actions
    public void preencherPlataforma(String plataforma){
        sendKeys(plataformaField,plataforma);
    }
    public void preencherOs(String os){
        sendKeys(osField,os);
    }
    public void preencherVersaoOS(String versaoOS){
        sendKeys(versaoOSField,versaoOS);
    }
    public void preencherDescricao(String descricao){
        sendKeys(descricaoField,descricao);
    }
    public void clicarAdicionarPerfil(){
        click(adicionarPerfilButton);
    }
    public void selecionarPerfil(String perfil){
        comboBoxSelectByVisibleText(selecionarPerfilCombobox,perfil);
    }
    public void marcarParaApagarPerfil(){
        click(ParaApagarPerfilButton);
    }
    public void clicarEmEnviar(){
        click(EnviarButton);
    }
    //retornos da pagina
    public boolean retornarPerfilExiste(String perfil){
        return returnComboBoxByVisibleText(selecionarPerfilCombobox,perfil);
    }



}
