package org.medioAmbiente.PPB005.CAP_F_001_09.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_09.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00109 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00109 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00109 - Visualizar menu lateral izquierdo$")
    public void Visualizar_Menu_Lateral_Izquierdo() throws InterruptedException{
        myStep.visualizarMenuLateralIzquierdo();
    }

    @Y("^PPB005-CAPF00109 - Pulsar menu lateral izquierdo$")
    public void Pulsar_Menu_Lateral_Izquierdo() throws InterruptedException {
        myStep.pulsarMenuLateralIzquierdo();
    }

    @Y("^PPB005-CAPF00109 - Pulsar submenu lateral$")
    public void Pulsar_Submenu_Lateral() throws InterruptedException {
        myStep.pulsarSubmenuLateral();
    }

}

