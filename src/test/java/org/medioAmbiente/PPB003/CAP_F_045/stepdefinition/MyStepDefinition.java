package org.medioAmbiente.PPB003.CAP_F_045.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_045.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF045 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF045 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF045 - Acceder Facebook Centro de Visitantes$")
    public void Acceder_Facebook_Centro_De_Visitantes()throws InterruptedException {
        myStep.accederPagina();
    }

    @Y("^PPB003-CAPF045 - Clickar Me gusta$")
    public void Clickar_Me_Gusta()throws InterruptedException {
        myStep.clickarMeGusta();
    }

    @Y("^PPB003-CAPF045 - Mover scroll$")
    public void Mover_Scroll()throws InterruptedException {
        myStep.moverScroll();
    }
}

