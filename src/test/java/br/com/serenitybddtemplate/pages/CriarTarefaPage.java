package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CriarTarefaPage extends PageBase {

    //Constructor
    public CriarTarefaPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By categoriaCombobox = By.id("category_id");
    By frequenciaCombobox = By.id("reproducibility");
    By gravidadeCombobox = By.id("severity");
    By prioridadeCombobox = By.id("priority");
    By selecionarPerfilButton = By.xpath("//*[@id='profile_closed_link']/i");
    By fecharSelecionarPerfilButton = By.xpath("//*[@id='profile_open_link']/i");
    By plataformaField= By.id("platform");
    By soField= By.id("os");
    By versaoSOField= By.id("os_build");
    By atribuirCombobox= By.id("handler_id");
    By resumoField= By.id("summary");
    By descricaoField= By.id("description");
    By passosParaReproduzirField = By.id("steps_to_reproduce");
    By informacoesAdicionaisField= By.id("additional_info");
    By aplicarMarcadoresField= By.id("tag_string");


    By enviarArquivosButton= By.xpath("//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[12]/td/div[2]");
    By visibilidadePublicoRadiobutton = By.xpath("//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[1]/span");
    By visibilidadePrivadoRadiobutton = By.xpath("//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[2]/span");

    By continuarRelatandoCheckbutton = By.xpath("//*[@id='report_bug_form']/div/div[2]/div[1]/div/table/tbody/tr[14]/td/label/span");


    By criarNovaTarefaButton = By.xpath("//*[@id='report_bug_form']/div/div[2]/div[2]/input");

    By msgAoSalvarTarefaTextArea = By.xpath("//div[@id='main-container']/div[2]/div[2]/div/div/div/div[2]/p");


    //Escolher Projeto
    By selecionarProjetoCombobox = By.id("select-project-id");
    By tornarPadraoCheckbox = By.cssSelector("span.lbl");
    By selecionarProjetoButton = By.xpath("//input[@value='Selecionar Projeto']");






    //Actions

    public void selecionarCategoria(String Categoria){
        comboBoxSelectByVisibleText(categoriaCombobox,Categoria);
    }
    public void selecionarFrequencia(String frequencia){
        comboBoxSelectByVisibleText(frequenciaCombobox,frequencia);
    }
    public void selecionarGravidade(String gravidade){
        comboBoxSelectByVisibleText(gravidadeCombobox,gravidade);
    }
    public void selecionarPrioridade(String prioridade){
        comboBoxSelectByVisibleText(prioridadeCombobox,prioridade);
    }
    public void clicarSelecionarPerfil(){
        try{

            clickWait1sec(selecionarPerfilButton);

        }catch (Exception ignored){}
    }
    public void preencherPlataforma(String plataforma){
        sendKeys(plataformaField,plataforma);
    }
    public void preencherSO(String so){
        sendKeys(soField,so);
    }
    public void preencherVersaoSO(String versaoSO){
        sendKeys(versaoSOField,versaoSO);
    }
    public void selecionarCategoriaAtribuir(String atribuir){
        comboBoxSelectByVisibleText(atribuirCombobox,atribuir);
    }
    public void preencherResumo(String resumo){
        sendKeys(resumoField,resumo);
    }

    public void preencherDescricao(String descricao){
        sendKeys(descricaoField,descricao);
    }
    public void preencherPassosParaReproduzir(String passosParaReproduzir){
        sendKeys(passosParaReproduzirField,passosParaReproduzir);
    }
    public void preencherInformacoesAdicionais(String informacoesAdicionais){
        sendKeys(informacoesAdicionaisField,informacoesAdicionais);
    }
    public void preencherAplicarMarcadores(String aplicarMarcadores){
        sendKeys(aplicarMarcadoresField,aplicarMarcadores);
    }
    public void clicarEnviarArquivos(){
        sendKeys(enviarArquivosButton,"D:/JOB/desafiomat/src/test/java/br/com/serenitybddtemplate/files/img.JPG");
    }
    public void clicarVisibilidadePublico(){
        click(visibilidadePublicoRadiobutton);
    }
    public void clicarVisibilidadePrivado(){
        click(visibilidadePrivadoRadiobutton);
    }
    public void clicarContinuarRelatando(){
        click(continuarRelatandoCheckbutton);
    }


    public void clicarCriarNovaTarefa(){
        click(criarNovaTarefaButton);
    }

    public String retornaMSGAoSalvarTarefa(){
        return getText(msgAoSalvarTarefaTextArea);
    }






}
