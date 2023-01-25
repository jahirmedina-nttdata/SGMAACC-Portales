package org.medioAmbiente.PPB006.CAP_FC_011.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_011.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC011 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFC011 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFC011 - Posicionarme en menu$")
    public void Posicionarme_En_Menu()throws InterruptedException {
        myStep.posicionarMenu();
    }


    @Y("^PPB006-CAPFC011 - Clickar submenu$")
    public void Clickar_Submenu()throws InterruptedException {
        myStep.clickarSubmenu();
    }




}

