package org.medioAmbiente.PPB004.CAP_FC_016.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_016.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC016 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC016 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFC016 - Mostrar buscador$")
    public void Mostrar_Buscador()throws InterruptedException {
        myStep.mostrarBuscador();
    }

    @Y("^PPB004-CAPFC016 - Clickar en buscar$")
    public void Clickar_En_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Y("^PPB004-CAPFC016 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException {
        myStep.buscarPortexto();
    }

    @Y("^PPB004-CAPFC016 - Buscar por categoria$")
    public void Buscar_Por_Categoria() throws InterruptedException  {
        myStep.buscarPorCateg();
    }

    @Y("^PPB004-CAPFC016 - Buscar por plazo abierto$")
    public void Buscar_Por_Plazo_Abierto() throws InterruptedException {
        myStep.buscarPorPlazo();
    }

    @Y("^PPB004-CAPFC016 - Buscar por tramitacion electronica$")
    public void Buscar_Por_Tramitacion_Electronica() throws InterruptedException {
        myStep.buscarPorTramitacion();
    }

    @Y("^PPB004-CAPFC016 - Buscar por texto y plazo abierto$")
    public void Buscar_Por_Texto_Y_Plazo_Abierto() throws InterruptedException {
        myStep.buscarPorTextoPlazo();
    }

    @Y("^PPB004-CAPFC016 - Acceder al contenido$")
    public void Acceder_Al_Contenido() throws InterruptedException {
        myStep.accederContenido();
    }


    @Y("^PPB004-CAPFC016 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException  {
        myStep.validarTextFlotante();
    }


    @Y("^PPB004-CAPFC016 - Realizar CAP_FC_020$")
    public void Realizar_CAP_FC_20()throws InterruptedException {
        myStep.ejecutarcaso();
    }
}

