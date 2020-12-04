package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.GerenciarMarcadoresPage;
import net.thucydides.core.annotations.Step;

public class GerenciarMarcadoresSteps {
    GerenciarMarcadoresPage gerenciarMarcadoresPage;




    @Step("Gerenciar Marcadores: clicar Criar Marcador")
    public void clicarCriarMarcador(){
        gerenciarMarcadoresPage.clicarCriarMarcador();
    }

    @Step("Gerenciar Marcadores: preencher Nome Marcador")
    public void preencherNomeMarcador(String nome){
        gerenciarMarcadoresPage.preencherNomeMarcador(nome);
    }
    @Step("Gerenciar Marcadores: preencher Descricao Marcador")
    public void preencherDescricaoMarcador(String descricao){
        gerenciarMarcadoresPage.preencherDescricaoMarcador(descricao);
    }



    @Step("Gerenciar Marcadores: clicar Marcador Criado")
    public void clicarMarcadorCriado(String marcador){
        gerenciarMarcadoresPage.clicarMarcadorCriado(marcador);
    }
    @Step("Gerenciar Marcadores: apagar Marcador")
    public void apagarMarcador(){
        gerenciarMarcadoresPage.apagarMarcador();
    }

    @Step("Gerenciar Marcadores: clicar Em Atualizar Marcardor")
    public void clicarEmAtualizarMarcardor(){
        gerenciarMarcadoresPage.clicarEmAtualizarMarcardor();
    }



    @Step("Gerenciar Marcadores: retorna Marcador Criado")
    public boolean retornaMarcadorCriado(String marcador){
        return gerenciarMarcadoresPage.retornaMarcadorCriado(marcador);
    }




}
