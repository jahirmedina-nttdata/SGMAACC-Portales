package org.medioAmbiente.PPB002.CAP_F_015.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_015.step.MyStep;

import java.awt.*;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF015 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF015 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws AWTException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF015 - Click permitir geolocalizar$")
    public void Click_Permitir_Geolocalizar() throws AWTException{
    }

    @Y("^PPB002-CAPF015 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF015 - Click no permitir geolocalizar$")
    public void Click_No_Permitir_Geolocalizar() throws AWTException{
        myStep.clickNopermitir();
    }

    @Y("^PPB002-CAPF015 - Seleccionar provincia$")
    public void Seleccionar_Provincia() throws InterruptedException {
        myStep.seleccionarProvin();
    }
}

