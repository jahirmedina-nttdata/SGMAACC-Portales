package org.medioAmbiente.PPB001.CAP_F_013.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB001-CAPF013 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF013 - Acepto Cookies")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF013 - Buscar por texto$")
    public void Buscar_Por_Texto() throws InterruptedException {
        myStep.buscarPorTexto();
    }


    @Y("^PPB001-CAPF013 - Buscar por Fecha Desde y Hasta$")
    public void Buscar_Por_Fecha_Desde_Y_Hasta() throws InterruptedException {
        myStep.buscarPorFechaDesdeYHasta();
    }

    @Y("^PPB001-CAPF013 - Buscar por Temática$")
    public void Buscar_Por_Temática() throws InterruptedException {
        myStep.buscarPorTematica();
    }

    @Y("^PPB001-CAPF013 - Ordenar por fecha de publicacion ascendentemente$")
    public void Ordenar_Por_Fecha_De_Publicacion_Ascendentemente() throws InterruptedException {
        myStep.ordenarFechaDePublicacionAscendentemente();
    }

    @Y("^PPB001-CAPF013 - Ordenar por Titulo ascendentemente$")
    public void Ordenar_Por_Titulo_Ascendentemente() throws InterruptedException {
        myStep.ordenarPorTituloAscendentemente();
    }

    @Y("^PPB001-CAPF013 - Ordenar por Titulo descendentemente$")
    public void Ordenar_Por_Titulo_Descendentemente() throws InterruptedException {
        myStep.ordenarPorTituloDescendentemente();
    }

    @Y("^PPB001-CAPF013 - Buscar por todos los filtros$")
    public void Buscar_Por_Todos_Los_Filtros() throws InterruptedException {
        myStep.buscarPorTodosLosFiltros();
    }
}
