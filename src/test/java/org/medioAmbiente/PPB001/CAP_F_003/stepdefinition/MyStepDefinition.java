package org.medioAmbiente.PPB001.CAP_F_003.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.medioAmbiente.PPB001.CAP_F_003.step.MyStep;

import net.thucydides.core.annotations.Steps;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^CAPF003 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @Cuando("^CAPF003 - Se haya cargado el blog$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        myStep.cargarPagina();
    }


    @Y("^CAPF003 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Entonces("^CAPF003 - Valorar el Post con : \"([^\"]*)\"$$")
    public void Valorar_El_Post(String xValoracion) throws InterruptedException {
        myStep.valorarContenido(xValoracion);
    }

}

