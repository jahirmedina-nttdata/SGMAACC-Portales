package org.medioAmbiente.PPB003.CAP_F_088.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_088.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF088 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF088 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF088 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF088 - Clickar Pasaporte Ecoturista$")
    public void Clickar_Pasaporte_Ecoturista()throws InterruptedException {
        myStep.clikarPasaporte();
    }

    @Entonces("^PPB003-CAPF088 - Valido permisos$")
    public void Valido_Permisos()throws InterruptedException {
        myStep.validarPermiso();
    }

    @Y("^PPB003-CAPF088 - Valido lista de Pasaportes$")
    public void Valido_Lista_De_Pasaportes()throws InterruptedException {
        myStep.validarPasaportes();
    }
}

