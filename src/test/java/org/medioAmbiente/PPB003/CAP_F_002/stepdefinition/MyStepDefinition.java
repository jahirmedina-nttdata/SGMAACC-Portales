package org.medioAmbiente.PPB003.CAP_F_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_002.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF002 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF002 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF002 - Acceder a Ventana Visitante$")
    public void Acceder_A_Ventana_Visitante()throws InterruptedException, URISyntaxException {
        myStep.accederVentanaVisitante();
    }

    @Entonces("^PPB003-CAPF002 - Valida acceso correcto$")
    public void Valida_Acceso_Correcto()throws InterruptedException {
        myStep.validaAcceso();
    }
}

