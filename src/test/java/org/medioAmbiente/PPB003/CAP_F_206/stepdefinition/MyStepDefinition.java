package org.medioAmbiente.PPB003.CAP_F_206.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_206.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF206 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF206 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF206 - Clickar pestaña ESPACIOS NATURALES$")
    public void Clickar_Pestaña_ESPACIOS_NATURALES() throws InterruptedException {
        myStep.clickarEspaciosNaturales();
    }

    @Y("^PPB003-CAPF206 - Clickar en ficha$")
    public void Clickar_En_Ficha() throws InterruptedException {
        myStep.clickarFicha();
    }

    @Entonces("^PPB003-CAPF206 - Validar Ficha$")
    public void Validar_Ficha() throws InterruptedException {
        myStep.validarFicha();
    }

}
