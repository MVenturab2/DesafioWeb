package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GerenciarUsuariosPage extends PageBase {

    //Constructor
    public GerenciarUsuariosPage(WebDriver driver){
        super(driver);
    }
    //Mapping


    //menus


    By criarNovaContaButton = By.linkText("Criar nova conta");

    By procurarContaField = By.id("search");
    By aplicarFiltroButton = By.xpath("//input[@value='Aplicar Filtro']");

    By apagarUsuarioButton = By.xpath("//input[@value='Apagar Usuário']");
    By apagarContaButton = By.xpath("//input[@value='Apagar Conta']");

    By mensagemDeExclusaoTextArea = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div/div[2]/p");

    By cliqueAquiParaProsseguirButton = By.linkText("Clique aqui para prosseguir");

    By velhaSenhaField = By.id("password-current");
    By novaSenhaField = By.id("password");
    By novaSenhaConfirmaField = By.id("password-confirm");
    By atualizarUsuarioButton = By.xpath("//input[@value='Atualizar Usuário']");



    By usaurioSelecionadoButton = null;





    //Actions
    public void clicarCriarNovaConta(){
        click(criarNovaContaButton);
    }

    public void preencherProcurarConta(String conta){
        sendKeys(procurarContaField,conta);
    }
    public void clicarAplicarFiltro(){
        click(aplicarFiltroButton);
    }


    public void clicarApagarUsuario(){
        click(apagarUsuarioButton);
    }
    public void clicarApagarConta(){
        click(apagarContaButton);
    }

    public String retornarMensagemDeExclusao(){
        return getText(mensagemDeExclusaoTextArea);
    }
    public void cliqueAquiParaProsseguir(){
        click(cliqueAquiParaProsseguirButton);
    }


    public void preencherVelhaSenha(String velhaSenha){
        sendKeys(velhaSenhaField,velhaSenha);
    }
    public void preencherNovaSenha(String novaSenha){
        sendKeys(novaSenhaField,novaSenha);

    }

    public void preencherNovaSenhaConfirmar(String novaSenhaConfirmar){

        sendKeys(novaSenhaConfirmaField,novaSenhaConfirmar);
    }



    public void clicarEmAtualizarUsuario(){
        click(atualizarUsuarioButton);
    }

    public void clicarEmUsuarioSelecionado(String usuario){


        usaurioSelecionadoButton = By.linkText(usuario);
//xpath=(//a[contains(text(),'administrator')])[2]
        click(usaurioSelecionadoButton);
    }






}
