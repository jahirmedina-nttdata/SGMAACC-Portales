package org.medioAmbiente.PPB005.CAP_F_001_03.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB005.CAP_F_001_03.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB005-CAPF00103 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB005-CAPF00103 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB005-CAPF00103 - Mostrar menu$")
    public void Mostrar_Menu() throws InterruptedException {
        myStep.mostrarMenu();
    }

    @Y("^PPB005-CAPF00103 - Posicionar puntero en menu$")
    public void Posicionar_Puntero_En_Menu() throws InterruptedException {
        myStep.posicionarPunteroEnMenu();
    }

    @Entonces("^PPB005-CAPF00103 - Accedo al submenu$")
    public void Accedo_Al_Submenu() throws InterruptedException {
        myStep.accedoAlSubmenu();
    }


}

