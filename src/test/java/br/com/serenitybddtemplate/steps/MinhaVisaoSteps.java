package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.MainPage;
import br.com.serenitybddtemplate.pages.MinhaVisaoPage;
import net.thucydides.core.annotations.Step;

public class MinhaVisaoSteps {
    MinhaVisaoPage minhaVisaoPage;

    @Step("Minha Visao: clicar Tarefa Criada")
    public void clicarTarefaCriada(String tarefa){
        minhaVisaoPage.clicarTarefaCriada(tarefa);
    }

    @Step("Minha Visao: clicar Em Apagar Tarefa")
    public void clicarEmApagarTarefa(){
        minhaVisaoPage.clicarEmApagarTarefa();
    }




}
