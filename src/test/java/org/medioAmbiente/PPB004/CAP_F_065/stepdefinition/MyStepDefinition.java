package org.medioAmbiente.PPB004.CAP_F_065.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_065.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF065 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF065 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF065 - Mostrar buscador$")
    public void Mostrar_Buscador()throws InterruptedException {
        myStep.mostrarBuscador();
    }

    @Y("^PPB004-CAPF065 - Clickar en buscar$")
    public void Clickar_En_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Y("^PPB004-CAPF065 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException {
        myStep.buscarPortexto();
    }

    @Y("^PPB004-CAPF065 - Buscar por categoria$")
    public void Buscar_Por_Categoria() throws InterruptedException  {
        myStep.buscarPorCateg();
    }

    @Y("^PPB004-CAPF065 - Buscar por plazo abierto$")
    public void Buscar_Por_Plazo_Abierto() throws InterruptedException {
        myStep.buscarPorPlazo();
    }

    @Y("^PPB004-CAPF065 - Buscar por tramitacion electronica$")
    public void Buscar_Por_Tramitacion_Electronica() throws InterruptedException {
        myStep.buscarPorTramitacion();
    }

    @Y("^PPB004-CAPF065 - Buscar por texto y plazo abierto$")
    public void Buscar_Por_Texto_Y_Plazo_Abierto() throws InterruptedException {
        myStep.buscarPorTextoPlazo();
    }

    @Y("^PPB004-CAPF065 - Acceder al contenido$")
    public void Acceder_Al_Contenido() throws InterruptedException {
        myStep.accederContenido();
    }


    @Y("^PPB004-CAPF065 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException  {
        myStep.validarTextFlotante();
    }


    @Y("^PPB004-CAPF065 - Navegar en paginador CAP_F_067$")
    public void Navegar_En_Paginador_CAP_F_067()throws InterruptedException {
        myStep.navegarPaginadorCAPF067();
    }
}

