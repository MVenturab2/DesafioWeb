package br.com.serenitybddtemplate.pages;

import br.com.serenitybddtemplate.bases.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MinhaVisaoPage extends PageBase {

    //Constructor
    public MinhaVisaoPage(WebDriver driver){
        super(driver);
    }
    //Mapping
    By tarefaCriadaButton = By.linkText("Tarefa de teste para apagar");
    By apagarButton = By.xpath("//input[@value='Apagar']");
    By apagarTarefaButton = By.xpath("//input[@value='Apagar Tarefas']");

    //Actions
    public void clicarTarefaCriada( ){
        click(tarefaCriadaButton);
    }
    public void clicarEmApagarTarefa( ){
        click(apagarButton);
    }
    public void clicarEmConfirmarApagarTarefa( ){
        click(apagarTarefaButton);
    }

}
