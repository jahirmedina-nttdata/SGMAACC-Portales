package org.medioAmbiente.PPB003.CAP_F_089.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_089.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF089 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF089 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF089 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF089 - Clickar añadir Pasaporte Ecoturista$")
    public void Clickar_Añadir_Pasaporte_Ecoturista()throws InterruptedException, URISyntaxException {
        myStep.clikarAñadirPasaporte();
    }

    @Entonces("^PPB003-CAPF089 - Validar Pasaporte añadido$")
    public void Validar_Pasaporte_Añadido()throws InterruptedException {
        myStep.validarPasaporte();
    }

    @Y("^PPB003-CAPF089 - Clickar eliminar Pasaporte$")
    public void Clickar_Eliminar_Pasaporte()throws InterruptedException {
        myStep.clickarEliminarPasaporte();
    }
}

