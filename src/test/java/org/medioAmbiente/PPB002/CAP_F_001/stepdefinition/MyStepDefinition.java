package org.medioAmbiente.PPB002.CAP_F_001.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_003.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB002-CAPF001 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @Cuando("^PPB002-CAPF001 - Se haya cargado el blog$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        myStep.cargarPagina();
    }


    @Y("^PPB002-CAPF001 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Entonces("^PPB002-CAPF001 - Valorar el Post con : \"([^\"]*)\"$$")
    public void Valorar_El_Post(String xValoracion) throws InterruptedException {
        myStep.valorarContenido(xValoracion);
    }

}

