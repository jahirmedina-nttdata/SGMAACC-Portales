package org.medioAmbiente.PPB003.CAP_F_082.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_082.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF082 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF082 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF082 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticoUsuario();
    }

    @Y("^PPB003-CAPF082 - Cambiar Idioma$")
    public void Cambiar_Idioma()throws InterruptedException {
        myStep.cambiarIdioma();
    }

    @Y("^PPB003-CAPF082 - Acceder a espacio natural$")
    public void Acceder_A_Espacio_Natural()throws InterruptedException, URISyntaxException {
        myStep.accederAEspacioNatural();
    }

    @Entonces("^PPB003-CAPF082 - Validar traduccion$")
    public void Validar_Traduccion()throws InterruptedException {
        myStep.validarTraduccion();
    }

}

