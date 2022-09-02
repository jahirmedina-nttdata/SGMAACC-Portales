package org.medioAmbiente.PPB001.CAP_F_107.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_107.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF107 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF107 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF107 - Seleccionar el paginador")
    public void Seleccionar_El_Paginador() throws InterruptedException {
        myStep.seleccionarPaginador();
    }

    @Y("^PPB001-CAPF107 - Clickar siguiente pagina$")
    public void Clickar_Siguiente_Pagina() throws InterruptedException {
        myStep.clickarSiguientePag();
    }

    @Y("^PPB001-CAPF107 - Clickar siguiente en la ultima pagina$")
    public void Clickar_Siguiente_En_La_Ultima_Pagina() throws InterruptedException {
        myStep.clickarSiguienteUltimaPag();
    }

    @Y("^PPB001-CAPF107 - Clickar anterior$")
    public void Clickar_Anterior() throws InterruptedException {
        myStep.clickarAnterior();
    }

    @Y("^PPB001-CAPF107 - Clickar anterior en la primera pagina$")
    public void Clickar_Anterior_En_La_Primera_Pagina() throws InterruptedException {
        myStep.clickarAnteriorPrimeraPag();
    }

}

