package org.medioAmbiente.PPB003.CAP_F_013.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF013 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF013 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF013 - Clickar Zona de Especial Conservacion$")
    public void Clickar_Zona_De_Especial_Conservacion()throws InterruptedException {
        myStep.clickarZonaConservacion();
    }
    @Y("^PPB003-CAPF013 - Clickar Instrumento de Planificacion$")
    public void Clickar_Instrumento_De_Planificacion()throws InterruptedException {
        myStep.clickarInstrumento();
    }
}

