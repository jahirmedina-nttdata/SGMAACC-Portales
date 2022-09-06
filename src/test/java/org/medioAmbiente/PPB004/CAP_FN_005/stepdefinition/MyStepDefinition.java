package org.medioAmbiente.PPB004.CAP_FN_005.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FN_005.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPFN005 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPFN005 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPFN005 - Clickar en buscar$")
    public void Clickar_En_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Y("^PPB004-CAPFN005 - Clickar en buscar con texto$")
    public void Clickar_En_Buscar_Con_Texto() throws InterruptedException{
        myStep.clickarconTexto();
    }

    @Y("^PPB004-CAPFN005 - Seleccionar tema$")
    public void Seleccionar_Tema()throws InterruptedException {
        myStep.seleccionarTema();
    }

    @Y("^PPB004-CAPFN005 - Navegar en diferentes vistas$")
    public void Navegar_En_Diferentes_Vistas() throws InterruptedException{
        myStep.navegarVistas();
    }
}

