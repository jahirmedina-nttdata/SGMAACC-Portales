package org.medioAmbiente.PPB007.CAP_FC_011.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_011.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC011 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC011 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB007-CAPFC011 - Situar cursor en menu$")
    public void Situar_Cursor_En_Menu()throws InterruptedException {
        myStep.situarCursor();
    }

    @Y("^PPB007-CAPFC011 - Clickar en Submenu$")
    public void Clickar_En_Submenu()throws InterruptedException {
        myStep.clickarSubmenu();
    }

}

