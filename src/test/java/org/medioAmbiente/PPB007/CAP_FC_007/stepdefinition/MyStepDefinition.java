package org.medioAmbiente.PPB007.CAP_FC_007.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_007.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC007 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC007 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFC007 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB007-CAPFC007 - Buscar sin filtros$")
    public void Buscar_Sin_Filtros()throws InterruptedException {
        myStep.buscarSinFiltros();
    }

    @Y("^PPB007-CAPFC007 - Buscar por texto$")
    public void Buscar_Por_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB007-CAPFC007 - Buscar por provincia$")
    public void Buscar_Por_Provincia()throws InterruptedException {
        myStep.buscarPorProvincia();
    }

    @Y("^PPB007-CAPFC007 - Buscar por fecha inicio$")
    public void Buscar_Por_Fecha_Inicio()throws InterruptedException {
        myStep.buscarPorFechaInicio();
    }

    @Y("^PPB007-CAPFC007 - Buscar por fecha fin$")
    public void Buscar_Por_Fecha_Fin()throws InterruptedException {
        myStep.buscarPorFechaFin();
    }

    @Y("^PPB007-CAPFC007 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

    @Y("^PPB007-CAPFC007 - Ejecutar CAPFN029$")
    public void Ejecutar_CAPFN029()throws InterruptedException {
        myStep.ejecutarCAPFN029();
    }

}

