package org.medioAmbiente.PPB005.CAP_F_001_10.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_10.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00110 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00110 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00110 - Ubicarse en la seccion Noticias$")
    public void Ubicarse_En_La_Seccion_Noticias() throws InterruptedException{
        myStep.ubicarseEnSeccionNoticias();
    }

    @Y("^PPB005-CAPF00110 - Pulsar en Noticia$")
    public void Pulsar_En_Noticia() throws InterruptedException {
        myStep.pulsarEnNoticias();
    }

}

