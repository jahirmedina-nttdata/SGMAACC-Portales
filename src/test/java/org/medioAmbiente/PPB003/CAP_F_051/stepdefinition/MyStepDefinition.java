package org.medioAmbiente.PPB003.CAP_F_051.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_051.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF051 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF051 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF051 - Comprobar elementos$")
    public void Comprobar_Elementos()throws InterruptedException {
        myStep.comprobarElementos();
    }

    @Y("^PPB003-CAPF051 - Clickar en Espacios Naturales$")
    public void Clickar_En_Espacios_Naturales()throws InterruptedException {
        myStep.clickarEspaciosNaturales();
    }

    @Y("^PPB003-CAPF051 - Clickar en Equipamientos$")
    public void Clickar_En_Equipamientos()throws InterruptedException {
        myStep.clickarEquipamientos();
    }

    @Y("^PPB003-CAPF051 - Clickar en Actividades$")
    public void Clickar_En_Actividades()throws InterruptedException {
        myStep.clickarActividades();
    }


}

