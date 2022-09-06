package org.medioAmbiente.PPB001.CAP_F_008.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_008.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF008 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF008 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF008 - Cambio Idioma")
    public void Cambio_Idioma() throws InterruptedException {
        myStep.cambiarIdioma();
    }

    @Entonces("^PPB001-CAPF008 - Valido traduccion$")
    public void Valido_Traduccion() throws InterruptedException {
        myStep.validarTraduccion();
    }

}

