package org.medioAmbiente.PPB004.CAP_FC_009.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_009.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC009 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC009 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFC009 - Mostrar Listado$")
    public void Mostrar_Listado()throws InterruptedException {
        myStep.mostrarListado();
    }

    @Y("^PPB004-CAPFC009 - Mostrar animacion$")
    public void Mostrar_Animacion()throws InterruptedException {
        myStep.mostrarAnimacion();
    }

    @Y("^PPB004-CAPFC009 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

    @Y("^PPB004-CAPFC009 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.validarTextoFlotante();
    }
}

