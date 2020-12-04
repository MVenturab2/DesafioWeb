package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarUsuarioPage extends PageBase {

    //Constructor
    public CriarUsuarioPage(WebDriver driver) {
        super(driver);
    }

    //Mapping
    By nomeDeUsuarioField = By.id("user-username");
    By nomeVerdadeiroField = By.id("user-realname");
    By emailField = By.id("email-field");
    By nivelDeAcessoField = By.id("user-access-level");
    By habilitadoCheckbox = By.xpath("//form[@id='manage-user-create-form']/div/div[2]/div/div/table/tbody/tr[5]/td[2]/label/span");
    By protegidoCheckbox = By.xpath("//form[@id='manage-user-create-form']/div/div[2]/div/div/table/tbody/tr[6]/td[2]/label/span");
    By criarUsuarioButton = By.xpath("//input[@value='Criar Usuário']");

    By retornoUsuarioSalvoErroButton = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div[2]/p[2]");

    By retornoUsuarioSalvoButton = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div/div[2]/p");

    //Actions

    public void preencherNomeDeUsuario(String nomeUsuario) {
        sendKeys(nomeDeUsuarioField, nomeUsuario);
    }
    public void preencherNomeVerdadeiro(String nomeVerdadeiro) {
        sendKeys(nomeVerdadeiroField, nomeVerdadeiro);
    }
    public void preencherEmail(String email) {
        sendKeys(emailField, email);
    }
    public void preencherNivelDeAcesso(String nivelDeAcesso) {
        sendKeys(nivelDeAcessoField, nivelDeAcesso);
    }
    public void clicarHabilitado( ) {
        click(habilitadoCheckbox );
    }
    public void clicarProtegido( ) {
        click(protegidoCheckbox );
    }
    public void clicarCriarUsuario( ) {
        click(criarUsuarioButton);
    }

    public String retornoUsuarioSalvoErro( ) {
        return getText(retornoUsuarioSalvoErroButton);
    }


    public String retornoUsuarioSalvo( ) {
        return getText(retornoUsuarioSalvoButton);
    }


}