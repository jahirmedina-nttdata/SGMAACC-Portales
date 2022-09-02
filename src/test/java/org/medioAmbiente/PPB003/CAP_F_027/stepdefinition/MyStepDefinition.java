package org.medioAmbiente.PPB003.CAP_F_027.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_027.step.MyStep;

import java.awt.*;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF027 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF027 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF027 - Acceder Facebook Espacio Natural de Doñana$")
    public void Acceder_Facebook_Espacio_Natural_De_Doñana() throws InterruptedException{
        myStep.accederPagina();
    }

    @Y("^PPB003-CAPF027 - Clickar Me gusta$")
    public void Clickar_Me_Gusta()throws InterruptedException {
        myStep.clickarMeGusta();
    }

    @Y("^PPB003-CAPF027 - Mover scroll$")
    public void Mover_Scroll() throws InterruptedException  {
        myStep.moverScroll();
    }
}

