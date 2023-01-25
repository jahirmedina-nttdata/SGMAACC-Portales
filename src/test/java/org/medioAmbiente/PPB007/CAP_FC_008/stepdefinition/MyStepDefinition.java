package org.medioAmbiente.PPB007.CAP_FC_008.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_008.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC008 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC008 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFC008 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB007-CAPFC008 - Buscar sin filtros$")
    public void Buscar_Sin_Filtros()throws InterruptedException {
        myStep.buscarSinFiltros();
    }

    @Y("^PPB007-CAPFC008 - Buscar por texto$")
    public void Buscar_Por_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB007-CAPFC008 - Buscar por tipo$")
    public void Buscar_Por_Tipo()throws InterruptedException {
        myStep.buscarPorTipo();
    }

    @Y("^PPB007-CAPFC008 - Buscar por tematica$")
    public void Buscar_Por_Tematica()throws InterruptedException {
        myStep.buscarPorTematica();
    }

    @Y("^PPB007-CAPFC008 - Buscar por plazo abierto$")
    public void Buscar_Por_Plazo_Abierto()throws InterruptedException {
        myStep.buscarPorPlazoAbierto();
    }

    @Y("^PPB007-CAPFC008 - Buscar por tramitacion electronica$")
    public void Buscar_Por_Tramitacion_Electronica()throws InterruptedException {
        myStep.buscarPorTramitacionElectronica();
    }

    @Y("^PPB007-CAPFC008 - Buscar por texto y plazo abierto$")
    public void Buscar_Por_Texto_Y_Plazo_Abierto()throws InterruptedException {
        myStep.buscarPorTextoYPlazoAbierto();
    }

    @Y("^PPB007-CAPFC008 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

    @Y("^PPB007-CAPFC008 - Ejecutar CAPFN029$")
    public void Ejecutar_CAPFN029()throws InterruptedException {
        myStep.ejecutarCAPFN029();
    }

}

