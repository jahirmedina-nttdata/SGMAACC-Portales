package org.medioAmbiente.PPB003.CAP_F_021.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_021.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF021 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF021 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF021 - Clickar pestaña Actividades$")
    public void Clickar_Pestaña_Actividades()throws InterruptedException {
        myStep.clickarActividades();
    }
    @Y("^PPB003-CAPF021 - Clickar Enlace a Reserva Tu Visita$")
    public void Clickar_Enlace_A_Reserva_Tu_Visita()throws InterruptedException {
        myStep.clickarReservaTuVisita();
    }
}

