package org.medioAmbiente.PPB003.CAP_F_127.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_127.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF127 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF127 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF127 - Clickar pestaña Datos de Interes$")
    public void Clickar_Pestaña_Datos_De_Interes() throws InterruptedException {
        myStep.clickarDatosDeInteres();
    }

    @Y("^PPB003-CAPF127 - Clickar en boton ENLACE A RESERVA TU VISITA$")
    public void Clickar_En_Boton_ENLACE_A_RESERVA_TU_VISITA() throws InterruptedException {
        myStep.clickarReservaTuVisita();
    }

}

