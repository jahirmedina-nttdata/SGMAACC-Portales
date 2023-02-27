package org.medioAmbiente.PPB007.CAP_F_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_002.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF002 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF002 - Autentica usuario$")
    public void Autentica_Usuario()throws InterruptedException {
        myStep.autenticaUsuario();
    }

    @Y("^PPB007-CAPF002 - Acceder al Canal de Administración Electronica$")
    public void Acceder_Al_Canal_De_Administración_Electronica()throws InterruptedException, URISyntaxException {
        myStep.accederCAE();
    }

    @Y("^PPB007-CAPF002 - Validar autenticacion y acceso$")
    public void Validar_Autenticacion_Y_Acceso()throws InterruptedException {
        myStep.validarAutenticacion();
    }
}

