package org.medioAmbiente.PPB005.CAP_F_001_05.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_05.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00105 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00105 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00105 - Autenticar usuario$")
    public void Autenticar_Usuario() throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB005-CAPF00105 - Acceder al portal$")
    public void Acceder_Al_Portal() throws InterruptedException, URISyntaxException {
        myStep.accederAlPortal();
    }

    @Y("^PPB005-CAPF00105 - Clickar menu lateral$")
    public void Clickar_Menu_Lateral() throws InterruptedException {
        myStep.clickarMenuLateral();
    }

}

