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
    By alterarContaTextArea = By.xpath("//form[@id='account-update-form']/div/div/h4");


    By preferenciasButton = By.linkText("Preferências");

    By projetoCombobox = By.id("default-project-id");
    By atualizarPreferenciasDeUsuarioButton = By.xpath("//input[@value='Atualizar Preferências']");


    //Actions
    public String retornarAlterarConta( ){
        try {
            if (returnIfElementExistsLowTimeout(alterarContaTextArea)) {
                return getText(alterarContaTextArea);
            } else {
                return " ";
            }
        }catch (Exception e){
            return " ";
        }

    }


    public void clicarEmPreferencias( ){
        click(preferenciasButton);
    }

    public void selecionarProjetoPadrao(String projeto){
        comboBoxSelectByVisibleText(projetoCombobox,projeto);
    }

    public void clicarEmAtualizarPreferencias( ){
        click(atualizarPreferenciasDeUsuarioButton);
    }



}
