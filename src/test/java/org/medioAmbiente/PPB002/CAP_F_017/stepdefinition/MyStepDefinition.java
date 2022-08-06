package org.medioAmbiente.PPB002.CAP_F_017.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_017.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF017 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF017 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF017 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF017 - Click permitir geolocalizacion$")
    public void Click_Permitir_Geolocalizacion() throws InterruptedException {
        myStep.clickPermitir();
    }

    @Y("^PPB002-CAPF017 - Click no permitir geolocalizar$")
    public void Click_No_Permitir_Geolocalizar() throws InterruptedException {
        myStep.clickNopermitir();
    }

    @Entonces("^PPB002-CAPF017 - Seleccionar provincia Granada$")
    public void Seleccionar_Provincia_Granada() throws InterruptedException {
        myStep.seleccionarProvin();
    }
}

