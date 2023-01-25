package org.medioAmbiente.PPB007.CAP_FN_029.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FN_029.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFN029 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFN029 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFN029 - Visualizar paginador$")
    public void Visualizar_Paginador() throws InterruptedException{
        myStep.visualizarPaginador();
    }

    @Y("^PPB007-CAPFN029 - Clickar paginador$")
    public void Clickar_Paginador() throws InterruptedException{
        myStep.clickarPaginador();
    }

    @Y("^PPB007-CAPFN029 - Clickar siguiente$")
    public void Clickar_Siguiente() throws InterruptedException{
        myStep.clickarSiguiente();
    }

    @Y("^PPB007-CAPFN029 - Clickar ultima pagina$")
    public void Clickar_Ultima_Pagina() throws InterruptedException{
        myStep.clickarUltimaPagina();
    }

    @Y("^PPB007-CAPFN029 - Clickar anterior$")
    public void Clickar_Anterior() throws InterruptedException{
        myStep.clickarAnterior();
    }

    @Y("^PPB007-CAPFN029 - Clickar primera pagina$")
    public void Clickar_Primera_Pagina() throws InterruptedException{
        myStep.clickarPrimeraPagina();
    }
}

