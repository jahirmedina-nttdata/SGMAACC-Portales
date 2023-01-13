package org.medioAmbiente.PPB005.CAP_F_001_07.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_07.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00107 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00107 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00107 - Comprobar informacion$")
    public void Comprobar_Informacion() throws InterruptedException, URISyntaxException {
        myStep.comprobarInformacion();
    }

}

