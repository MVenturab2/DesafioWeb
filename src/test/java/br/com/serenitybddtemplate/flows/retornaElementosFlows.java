package br.com.serenitybddtemplate.flows;

import br.com.serenitybddtemplate.steps.GerenciarSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class retornaElementosFlows {

    @Steps
    MainSteps mainSteps;

    @Steps
    GerenciarSteps gerenciarSteps;

    //Abas principais
    public void retornaElementosMinhaVisao( ){
        String cabecalhoTela = "Atribuídos a Mim (não resolvidos)";
        Assert.assertEquals(cabecalhoTela, mainSteps.retornaatribuidosAMim());
    }
    public void retornaElementosFiltro( ){
        String cabecalhoTela = "Filtros";
        Assert.assertEquals(cabecalhoTela, mainSteps.retornaFiltros());

    }
    public void retornaElementosCriarTarefa( ){
        String cabecalhoTela = "Digite os Detalhes do Relatório";
        Assert.assertEquals(cabecalhoTela, mainSteps.retornaDetalhesFormularioTarefa());

    }
    public void retornaElementosRegistroMudancas( ){
        String cabecalhoTela = "Nenhum registro de mudança disponível. Apenas tarefas que indiquem a versão na qual foi resolvida aparecerão nos registros de mudança.";
        Assert.assertEquals(cabecalhoTela, mainSteps.retornaRegistroMudancas());

    }
    public void retornaElementosPlanejamento( ){
        String cabecalhoTela = "Nenhum planejamento disponível. Apenas tarefas com a versão indicada aparecerão no planejamento.";
        Assert.assertEquals(cabecalhoTela, mainSteps.retornaPlanejamento());

    }
    public void retornaElementosResumo( ){
        String cabecalhoTela = "Resumo";
        Assert.assertEquals(cabecalhoTela, mainSteps.retornaResumo());

    }
    public void retornaElementosGerenciar( ){
        String cabecalhoTela = "Informação do Site";
        Assert.assertEquals(cabecalhoTela, gerenciarSteps.retornaVisaoGeral());

    }




    /// Abas do menu gerenciar

    public void retornaElementosGerenciarInfoSite( ){
        String cabecalhoTelaGerenciar = "Informação do Site";
        Assert.assertTrue(gerenciarSteps.retornaVisaoGeral().contains(cabecalhoTelaGerenciar));
    }
    public void retornaElementosGerenciarUsuarios( ){
        String cabecalhoTelaGerenciar = "Gerenciar Contas";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarUsuarios().contains(cabecalhoTelaGerenciar) );
    }
    public void retornaElementosGerenciarProjetos( ){
        String cabecalhoTelaGerenciar = "Projetos";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarProjetos().contains(cabecalhoTelaGerenciar));
    }
    public void retornaElementosGerenciarMarcadores( ){
        String cabecalhoTelaGerenciar = "Gerenciar Marcadores";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarMarcadores().contains( cabecalhoTelaGerenciar));
    }
    public void retornaElementosGerenciarCamposPersonalizados( ){
        String cabecalhoTelaGerenciar = "Campos Personalizados";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarcamposPersonalizados().contains( cabecalhoTelaGerenciar) );
    }
    public void retornaElementosGerenciarPerfisGlobais( ){
        String cabecalhoTelaGerenciar = "Adicionar Perfil";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarperfisGlobais().contains(cabecalhoTelaGerenciar) );
    }
    public void retornaElementosGerenciarPlugins( ){
        String cabecalhoTelaGerenciar = "Plugins Instalados";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarplugins().contains( cabecalhoTelaGerenciar) );
    }

    public void retornaElementosGerenciarConfiguracao( ){
        String cabecalhoTelaGerenciar = "ANEXO(S)";
        Assert.assertTrue(gerenciarSteps.retornaGerenciarconfiguracao().contains(cabecalhoTelaGerenciar) );
    }


}
