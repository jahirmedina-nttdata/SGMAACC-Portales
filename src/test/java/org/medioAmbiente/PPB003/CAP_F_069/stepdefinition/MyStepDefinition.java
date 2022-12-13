package org.medioAmbiente.PPB003.CAP_F_069.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_069.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF069 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF069 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF069 - Clickar aqui$")
    public void Clickar_Aqui()throws InterruptedException {
        myStep.clickarAqui();
    }

    @Y("^PPB003-CAPF069 - Rellenar formulario$")
    public void Rellenar_Formulario()throws InterruptedException {
        myStep.rellenarFormulario();
    }

    @Y("^PPB003-CAPF069 - Rellenar campos invalidos$")
    public void Rellenar_Campos_Invalidos()throws InterruptedException, URISyntaxException {
        myStep.rellenarCamposInvalidos();
    }
}

