package org.medioAmbiente.PPB006.CAP_F_047.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_047.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF047 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF047 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF047 - Clickar menu Adaptacion$")
    public void Clickar_Menu_Adaptacion()throws InterruptedException {
        myStep.clickarAdaptacion();
    }

}
