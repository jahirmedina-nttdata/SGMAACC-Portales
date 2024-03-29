package org.medioAmbiente.PPB002.CAP_F_016_01.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_016_01.step.MyStep;

import java.awt.*;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF01601 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws AWTException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF01601 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF01601 - Visualizar detalle de tiempo$")
    public void Visualizar_Detalle_De_Tiempo() throws InterruptedException{
        myStep.visualizarTiempo();
    }

    @Y("^PPB002-CAPF01601 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException {
        myStep.clickarEnlace();
    }
}

