package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.MinhaVisaoPage;
import net.thucydides.core.annotations.Step;

public class MinhaVisaoSteps {
    MinhaVisaoPage minhaVisaoPage;

    @Step("Minha Visao: clicar Tarefa Criada '{0}'")
    public void clicarTarefaCriada( ){
        minhaVisaoPage.clicarTarefaCriada();
    }
    @Step("Minha Visao: clicar Em Apagar Tarefa")
    public void clicarEmApagarTarefa(){
        minhaVisaoPage.clicarEmApagarTarefa();
    }
    @Step("Minha Visao: clicar Em confirmar Apagar Tarefa")
    public void clicarEmConfirmarApagarTarefa(){
        minhaVisaoPage.clicarEmConfirmarApagarTarefa();
    }

}
