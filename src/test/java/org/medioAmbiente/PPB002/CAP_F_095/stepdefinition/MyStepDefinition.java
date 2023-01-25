package org.medioAmbiente.PPB002.CAP_F_095.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_095.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF095 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF095 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF095 - Clickar el enlace SERVICIO DE ATENCIÓN A LA CIUDADANÍA")
    public void Clickar_El_Enlace_SERVICIO_DE_ATENCIÓN_A_LA_CIUDADANÍA() throws InterruptedException {
        myStep.clickarServiciodeAtencionaCiudadania();
    }
    @Entonces("^PPB002-CAPF095 - Validar el acceso correcto")
    public void Validar_El_Acceso_Correcto() throws InterruptedException {

    }

}

