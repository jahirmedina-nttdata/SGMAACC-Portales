package org.medioAmbiente.PPB004.CAP_FN_004.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FN_004.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPFN004 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPFN004 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFN004 - Mostrar buscador general$")
    public void Mostrar_Buscador_General() throws InterruptedException {
        myStep.mostrarBuscador();
    }

    @Y("^PPB004-CAPFN004 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException {
        myStep.buscarPortexto();
    }

    @Entonces("^PPB004-CAPFN004 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException{
        myStep.clickarEnlace();

    }
    @Y("^PPB004-CAPFN004 - Visualizar CAP_FN_005$")
    public void Visualizar_CAP_FN_005() throws InterruptedException {
        myStep.visualizarCAPFN05();
    }

    @Y("PPB004-CAPFN004 - Visualizar CAP_FC_020")
    public void VisualizarCAP_FC_020()throws InterruptedException {
        myStep.visualizarCAPFC020();
    }
}

