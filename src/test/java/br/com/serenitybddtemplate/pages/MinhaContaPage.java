package br.com.serenitybddtemplate.pages;


import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MinhaContaPage extends PageBase {

    //Constructor
    public MinhaContaPage(WebDriver driver){
        super(driver);
    }

    //Mapping
    By preferenciasButton = By.linkText("Preferências");
    By projetoCombobox = By.id("default-project-id");
    By atualizarPreferenciasDeUsuarioButton = By.xpath("//input[@value='Atualizar Preferências']");
    //retornos da pagina
    By alterarContaTextArea = By.xpath("//form[@id='account-update-form']/div/div/h4");

    //Actions
    public void clicarEmPreferencias( ){
        click(preferenciasButton);
    }
    public void selecionarProjetoPadrao(String projeto){
        comboBoxSelectByVisibleText(projetoCombobox,projeto);
    }
    public void clicarEmAtualizarPreferencias( ){
        click(atualizarPreferenciasDeUsuarioButton);
    }
    //retornos da pagina
    public String retornarAlterarConta( ){
        try { if (returnIfElementExistsLowTimeout(alterarContaTextArea)) { return getText(alterarContaTextArea); } else { return " "; }
        }catch (Exception e){ return " "; }
    }
}
