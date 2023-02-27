package org.medioAmbiente.PPB004.CAP_F_066.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_066.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF066 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF066 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF066 - Mostrar apartado$")
    public void Mostrar_Apartado()throws InterruptedException {
        myStep.mostrarApartado();
    }

    @Y("^PPB004-CAPF066 - Ocultar apartado$")
    public void Ocultar_Apartado() throws InterruptedException {
        myStep.ocultarApartado();
    }

    @Y("^PPB004-CAPF066 - Descargar archivo$")
    public void Descargar_Archivo() throws InterruptedException {
        myStep.descargarArchivo();
    }

    @Y("^PPB004-CAPF066 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException  {
        myStep.clickarEnlace();
    }
}

