package org.medioAmbiente.PPB004.CAP_FC_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC002 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPFC002 - Situar cursor en menu$")
    public void Situar_Cursor_En_Menu()throws InterruptedException {
        myStep.situarCursor();
    }

    @Y("^PPB004-CAPFC002 - Clickar en Submenu$")
    public void Clickar_En_Submenu()throws InterruptedException {
        myStep.clickarSubmenu();
    }

}

