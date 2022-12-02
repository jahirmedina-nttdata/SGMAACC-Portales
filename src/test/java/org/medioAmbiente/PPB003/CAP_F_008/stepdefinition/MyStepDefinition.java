package org.medioAmbiente.PPB003.CAP_F_008.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_008.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF008 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF008 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF008 - Autenticarse$")
    public void Autenticarse() throws InterruptedException, URISyntaxException {
        myStep.Autenticarse();
    }

    @Y("^PPB003-CAPF008 - Clickar Añadir Pasaporte$")
    public void Clickar_Añadir_Pasaporte()throws InterruptedException, URISyntaxException {
        myStep.clickarPasaporte();
    }

    @Entonces("^PPB003-CAPF008 - Verifica cambio de color del icono$")
    public void Verifica_Cambio_De_Color_Del_Icono()throws InterruptedException{
        myStep.verificarIcono();
    }
}

