package org.medioAmbiente.PPB003.CAP_F_207.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_207.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF207 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF207 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF207 - Clickar pestaña BUENAS PRÁCTICAS$")
    public void Clickar_Pestaña_BUENAS_PRÁCTICAS() throws InterruptedException {
        myStep.clickarBuenasPracticas();
    }

    @Entonces("^PPB003-CAPF207 - Validar Tarjetas$")
    public void Validar_Tarjetas() throws InterruptedException {
        myStep.validarTarjetas();
    }

}

