package org.medioAmbiente.PPB003.CAP_F_156.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_156.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF156 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF156 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF156 - Seleccionar el paginador 5")
    public void Seleccionar_El_Paginador_5() throws InterruptedException {
        myStep.seleccionarPaginador5();
    }

    @Y("^PPB003-CAPF156 - Clickar siguiente pagina$")
    public void Clickar_Siguiente_Pagina() throws InterruptedException {
        myStep.clickarSiguientePag();
    }

    @Y("^PPB003-CAPF156 - Clickar siguiente en la ultima pagina$")
    public void Clickar_Siguiente_En_La_Ultima_Pagina() throws InterruptedException {
        myStep.clickarSiguienteUltimaPag();
    }

    @Y("^PPB003-CAPF156 - Clickar anterior$")
    public void Clickar_Anterior() throws InterruptedException {
        myStep.clickarAnterior();
    }

    @Y("^PPB003-CAPF156 - Clickar anterior en la primera pagina$")
    public void Clickar_Anterior_En_La_Primera_Pagina() throws InterruptedException {
        myStep.clickarAnteriorPrimeraPag();
    }

}

