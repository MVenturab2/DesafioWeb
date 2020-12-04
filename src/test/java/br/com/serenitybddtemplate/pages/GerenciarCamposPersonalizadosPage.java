package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GerenciarCamposPersonalizadosPage extends PageBase {

    //Constructor
    public GerenciarCamposPersonalizadosPage(WebDriver driver){
        super(driver);
    }
    //Mapping


    //menus

    By nomeCampoPersonalizadoField = By.name("name");
    By criarNovoCampoPersonalizadoButton = By.xpath("//input[@value='Novo Campo Personalizado']");
    By cliqueAquiParaProsseguirButton = By.linkText("Clique aqui para prosseguir");



    By primeiraLinhaCampoPersonalizadoTextArea = By.xpath("//*[@id='main-container']/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/table/tbody/tr/td[1]/a");

    //Alterar Campo Personalizado
    By tipoCombobox = By.id("custom-field-type");
    By valoresPossiveisField = By.id("custom-field-possible-values");
    By valorPadraoField = By.id("custom-field-default-value");
    By expressaoRegularField = By.id("custom-field-valid-regexp");
    By acessoDeLeituraCombobox = By.id("custom-field-access-level-r");
    By acessoDeEscritaCombobox = By.id("custom-field-access-level-rw");
    By comprimentoMinimoField = By.id("custom-field-length-min");
    By comprimentoMaximoField = By.id("custom-field-length-max");
    By adicionarAoFiltroCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[10]/td[2]/label/span");
    By mostrarAoCriarTarefasCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[11]/td[2]/label/span");
    By mostrarAoAtualizarTarefasCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[12]/td[2]/label/span");
    By mostrarAoResolverTarefasCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[13]/td[2]/label/span");
    By mostrarAoFecharTarefasCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[14]/td[2]/label/span");
    By requeridoAoRelatoCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[15]/td[2]/label/span");
    By requeridoAoAtualizacaoCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[16]/td[2]/label/span");
    By requeridoAoResolucaoCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[17]/td[2]/label/span");
    By requeridoAoFechamentoCheckbox = By.id("//form[@id='manage-custom-field-update-form']/div/div[2]/div/div/table/tbody/tr[18]/td[2]/label/span");

    By atualizaCampoPersonalizadoButton = By.xpath("//input[@value='Atualizar Campo Personalizado']");
    By projetoCriado1Button = By.id("//*[@id='custom-field-project-id']/option[1]");
    By vincularCampoPersonalizadoButton = By.linkText("Vincular Campo Personalizado");


    By ApagarCampoPersonalizadoButton = By.xpath("//input[@value='Apagar Campo Personalizado']");



    By ApagarCampoButton = By.xpath("//input[@value='Apagar Campo']");




    //Actions


    public void preencherNomeCampoPersonalizado(String nome){
        sendKeys(nomeCampoPersonalizadoField,nome);
    }
    public void clicarCriarNovoCampoPersonalizado(){
        click(criarNovoCampoPersonalizadoButton);
    }
    public void cliqueAquiParaProsseguir(){
        click(cliqueAquiParaProsseguirButton);
    }

    public String retornaPrimeiraLinhaCampoPersonalizado(){
        return getText(primeiraLinhaCampoPersonalizadoTextArea);
    }


    //Alterar Campo Personalizado
    public void selecionarTipo(String tipo){
        comboBoxSelectByVisibleText(tipoCombobox,tipo);
    }
    public void preencherValoresPossiveis(String valoresPossiveis){
        sendKeys(valoresPossiveisField,valoresPossiveis);
    }
    public void preencherValorPadrao(String valorPadrao){
        sendKeys(valorPadraoField,valorPadrao);
    }
    public void preencherExpressaoRegular(String expressaoRegular){
        sendKeys(expressaoRegularField,expressaoRegular);
    }
    public void selecionarAcessoDeLeitura(String acessoDeLeitura){
        comboBoxSelectByVisibleText(acessoDeLeituraCombobox,acessoDeLeitura);
    }
    public void selecionarAcessoDeEscrita(String acessoDeEscrita){
        comboBoxSelectByVisibleText(acessoDeEscritaCombobox,acessoDeEscrita);
    }
    public void preencherComprimentoMinimo(String comprimentoMinimo){
        sendKeys(comprimentoMinimoField,comprimentoMinimo);
    }
    public void preencherComprimentoMaximo(String comprimentoMaximo){
        sendKeys(comprimentoMaximoField,comprimentoMaximo);
    }
    public void marcarAdicionarAoFiltro(){
        click(adicionarAoFiltroCheckbox);
    }
    public void marcarMostrarAoCriarTarefas(){
        click(mostrarAoCriarTarefasCheckbox);
    }
    public void marcarMostrarAoAtualizarTarefas(){
        click(mostrarAoAtualizarTarefasCheckbox);
    }
    public void marcarMostrarAoResolverTarefas(){
        click(mostrarAoResolverTarefasCheckbox);
    }
    public void marcarMostrarAoFecharTarefas(){
        click(mostrarAoFecharTarefasCheckbox);
    }
    public void marcarRequeridoAoRelato(){
        click(requeridoAoRelatoCheckbox);
    }
    public void marcarRequeridoAoAtualizacao(){
        click(requeridoAoAtualizacaoCheckbox);
    }
    public void marcarRequeridoAoResolucao(){
        click(requeridoAoResolucaoCheckbox);
    }
    public void marcarRequeridoAoFechamento(){
        click(requeridoAoFechamentoCheckbox);
    }

    public void marcarProjetoCriado1(){
        click(projetoCriado1Button);
    }
    public void marcarVincularCampoPersonalizado(){
        click(vincularCampoPersonalizadoButton);
    }


    public void clicarAtualizaCampoPersonalizado(){
        click(atualizaCampoPersonalizadoButton);

    }

    public void clicarApagarCampoPersonalizado(){
        click(ApagarCampoPersonalizadoButton);


    }

    public void clicarApagarCampo(){
        click(ApagarCampoButton);


    }







}
