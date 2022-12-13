package org.medioAmbiente.PPB003.CAP_F_131.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_131.Step.MyStep;


public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF131 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF131 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF131 - Clickar pestaña PUBLICACIONES$")
    public void Clickar_Pestaña_PUBLICACIONES() throws InterruptedException {
        myStep.clickarPublicaciones();
    }

    @Entonces("^PPB003-CAPF131 - Validar Tarjetas$")
    public void Validar_Tarjetas() throws InterruptedException {
        myStep.validarTarjetas();
    }

}

