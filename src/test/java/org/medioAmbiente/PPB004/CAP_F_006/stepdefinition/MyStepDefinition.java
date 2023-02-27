package org.medioAmbiente.PPB004.CAP_F_006.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_006.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPF006 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPF006 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPF006 - Clickar 10 de Agosto$")
    public void Clickar_10_De_Agosto()throws InterruptedException {
        myStep.clickarDia();
    }

    @Y("^PPB004-CAPF006 - Clickar siguiente$")
    public void Clickar_Siguiente()throws InterruptedException {
        myStep.clickarSiguiente();
    }

    @Y("^PPB004-CAPF006 - Clickar anterior$")
    public void Clickar_Anterior()throws InterruptedException {
        myStep.clickarAnterior();
    }

    @Y("^PPB004-CAPF006 - Clickar Mas informacion$")
    public void Clickar_Mas_Informacion()throws InterruptedException {
        myStep.clickarMasInfo();
    }

    @Y("^PPB004-CAPF006 - Clickar Pesca$")
    public void Clickar_Pesca()throws InterruptedException {
        myStep.clickarPesca();
    }

    @Y("^PPB004-CAPF006 - Visualizar dia sin evento$")
    public void Visualizar_Dia_Sin_Evento()throws InterruptedException {
        myStep.visualizarSinEvento();
    }

}

