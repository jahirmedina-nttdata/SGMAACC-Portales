package org.medioAmbiente.PPB005.CAP_F_001_06.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_06.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00106 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00106 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00106 - Autenticar usuario$")
    public void Autenticar_Usuario() throws InterruptedException, URISyntaxException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB005-CAPF00106 - Clickar submenu lateral$")
    public void Clickar_Submenu_Lateral() throws InterruptedException {
        myStep.clickarSubmenuLateral();
    }

    @Entonces("^PPB005-CAPF00106 - Validar que navegue al submenu$")
    public void Validar_Que_Navegue_Al_Submenu() throws InterruptedException {
        myStep.validarQueNavegueAlSubmenu();
    }

}

