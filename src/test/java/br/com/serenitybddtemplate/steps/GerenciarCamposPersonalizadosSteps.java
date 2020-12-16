package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.GerenciarCamposPersonalizadosPage;
import net.thucydides.core.annotations.Step;

public class GerenciarCamposPersonalizadosSteps {
    GerenciarCamposPersonalizadosPage gerenciarCamposPersonalizadosPage;

    @Step("Gerenciar Campos Personalizados: preencher Nome Campo Personalizado '{0}'")
    public void preencherNomeCampoPersonalizado(String nome){
        gerenciarCamposPersonalizadosPage.preencherNomeCampoPersonalizado(nome);
    }
    @Step("Gerenciar Campos Personalizados: clicar Criar Novo Campo Personalizado")
    public void clicarCriarNovoCampoPersonalizado(){
        gerenciarCamposPersonalizadosPage.clicarCriarNovoCampoPersonalizado();
    }
    @Step("Gerenciar Campos Personalizados: clicar em clique Aqui Para Prosseguir")
    public void cliqueAquiParaProsseguir(){
        gerenciarCamposPersonalizadosPage.cliqueAquiParaProsseguir();
    }
    //retornos da pagina
    @Step("Gerenciar Campos Personalizados: retorna Primeira Linha Campos Personalizados")
    public String retornaPrimeiraLinhaCampoPersonalizado(){
        return gerenciarCamposPersonalizadosPage.retornaPrimeiraLinhaCampoPersonalizado();
    }
    //Alterar Campo Personalizado
    @Step("Gerenciar Campos Personalizados: selecionar Tipo '{0}'")
    public void selecionarTipo(String tipo){
        gerenciarCamposPersonalizadosPage.selecionarTipo(tipo);
    }
    @Step("Gerenciar Campos Personalizados: preencher Valores Possiveis '{0}'")
    public void preencherValoresPossiveis(String valoresPossiveis){
        gerenciarCamposPersonalizadosPage.preencherValoresPossiveis(valoresPossiveis);
    }
    @Step("Gerenciar Campos Personalizados: preencher Valor Padrao '{0}'")
    public void preencherValorPadrao(String valorPadrao){
        gerenciarCamposPersonalizadosPage.preencherValorPadrao(valorPadrao);
    }
    @Step("Gerenciar Campos Personalizados: preencher Expressao Regular '{0}'")
    public void preencherExpressaoRegular(String expressaoRegular){
        gerenciarCamposPersonalizadosPage.preencherExpressaoRegular(expressaoRegular);
    }
    @Step("Gerenciar Campos Personalizados: selecionar Acesso De Leitura '{0}'")
    public void selecionarAcessoDeLeitura(String acessoDeLeitura){
        gerenciarCamposPersonalizadosPage.selecionarAcessoDeLeitura(acessoDeLeitura);
    }
    @Step("Gerenciar Campos Personalizados: selecionar Acesso De Escrita '{0}'")
    public void selecionarAcessoDeEscrita(String acessoDeEscrita){
        gerenciarCamposPersonalizadosPage.selecionarAcessoDeEscrita(acessoDeEscrita);
    }
    @Step("Gerenciar Campos Personalizados: preencher Comprimento Minimo '{0}'")
    public void preencherComprimentoMinimo(String comprimentoMinimo){
        gerenciarCamposPersonalizadosPage.preencherComprimentoMinimo(comprimentoMinimo);
    }
    @Step("Gerenciar Campos Personalizados: preencher Comprimento Maximo '{0}'")
    public void preencherComprimentoMaximo(String comprimentoMaximo){
        gerenciarCamposPersonalizadosPage.preencherComprimentoMaximo(comprimentoMaximo);
    }
    @Step("Gerenciar Campos Personalizados: marcar Adicionar Ao Filtro")
    public void marcarAdicionarAoFiltro(){
        gerenciarCamposPersonalizadosPage.marcarAdicionarAoFiltro();
    }
    @Step("Gerenciar Campos Personalizados: marcar Mostrar Ao Criar Tarefas")
    public void marcarMostrarAoCriarTarefas(){
        gerenciarCamposPersonalizadosPage.marcarMostrarAoCriarTarefas();
    }
    @Step("Gerenciar Campos Personalizados: marcar Mostrar Ao Atualizar Tarefas")
    public void marcarMostrarAoAtualizarTarefas(){
        gerenciarCamposPersonalizadosPage.marcarMostrarAoAtualizarTarefas();
    }
    @Step("Gerenciar Campos Personalizados: marcar Mostrar Ao Resolver Tarefas")
    public void marcarMostrarAoResolverTarefas(){
        gerenciarCamposPersonalizadosPage.marcarMostrarAoResolverTarefas();
    }
    @Step("Gerenciar Campos Personalizados: marcar Mostrar Ao Fechar Tarefas")
    public void marcarMostrarAoFecharTarefas(){
        gerenciarCamposPersonalizadosPage.marcarMostrarAoFecharTarefas();
    }
    @Step("Gerenciar Campos Personalizados: marcar Requerido Ao Relato")
    public void marcarRequeridoAoRelato(){
        gerenciarCamposPersonalizadosPage.marcarRequeridoAoRelato();
    }
    @Step("Gerenciar Campos Personalizados: marcar Requerido Ao Atualizacao")
    public void marcarRequeridoAoAtualizacao(){
        gerenciarCamposPersonalizadosPage.marcarRequeridoAoAtualizacao();
    }
    @Step("Gerenciar Campos Personalizados: marcar Requerido Ao Resolucao")
    public void marcarRequeridoAoResolucao(){
        gerenciarCamposPersonalizadosPage.marcarRequeridoAoResolucao();
    }
    @Step("Gerenciar Campos Personalizados: marcar Requerido Ao Fechamento")
    public void marcarRequeridoAoFechamento(){
        gerenciarCamposPersonalizadosPage.marcarRequeridoAoFechamento();
    }
    @Step("Gerenciar Campos Personalizados: marcar Atualiza Campo Personalizado")
    public void clicarAtualizaCampoPersonalizado(){
        gerenciarCamposPersonalizadosPage.clicarAtualizaCampoPersonalizado();
    }
    @Step("Gerenciar Campos Personalizados: marcar Projeto Criado 1")
    public void marcarProjetoCriado1(){
        gerenciarCamposPersonalizadosPage.marcarProjetoCriado1();
    }
    @Step("Gerenciar Campos Personalizados: marcar Vincular Campo Personalizado")
    public void marcarVincularCampoPersonalizado(){
        gerenciarCamposPersonalizadosPage.marcarVincularCampoPersonalizado();
    }
    @Step("Gerenciar Campos Personalizados: clicar em Apagar Campo Personalizado")
    public void clicarApagarCampoPersonalizado(){
        gerenciarCamposPersonalizadosPage.clicarApagarCampoPersonalizado();
    }
    @Step("Gerenciar Campos Personalizados: clicar em Apagar Campo")
    public void clicarApagarCampo(){
        gerenciarCamposPersonalizadosPage.clicarApagarCampo();
    }

}
