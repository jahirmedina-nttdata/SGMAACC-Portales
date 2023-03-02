package org.medioAmbiente.PPB004.CAP_F_004.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_004.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPF004 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPF004 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF004 - Mostrar buscador general$")
    public void Mostrar_Buscador_General() throws InterruptedException {
        myStep.mostrarBuscador();
    }

    @Y("^PPB004-CAPF004 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException {
        myStep.buscarPortexto();
    }

    @Entonces("^PPB004-CAPF004 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException{
        myStep.clickarEnlace();

    }
    @Y("^PPB004-CAPF004 - Visualizar Buscador Avanzado CAP_F_005$")
    public void Visualizar_Buscador_Avanzado_CAP_F_005() throws InterruptedException, URISyntaxException {
        myStep.visualizarCAPF05();
    }

    @Y("PPB004-CAPF004 - Visualizar Paginador CAP_F_067")
    public void Visualizar_Paginador_CAP_F_067()throws InterruptedException {
        myStep.visualizarCAPF067();
    }
}

