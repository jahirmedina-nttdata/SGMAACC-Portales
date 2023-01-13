package org.medioAmbiente.PPB004.CAP_FN_005.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FN_005.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPFN005 - Accedo al portal$")
    public void Accedo_al_portal() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB004-CAPFN005 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPFN005 - Clickar en buscar$")
    public void Clickar_En_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Y("^PPB004-CAPFN005 - Buscar por Texto$")
    public void Buscar_Por_Texto() throws InterruptedException{
        myStep.buscarPorTexto();
    }

    @Y("^PPB004-CAPFN005 - Buscar por Tema$")
    public void Buscar_Por_Tema()throws InterruptedException {
        myStep.buscarPorTema();
    }

    @Y("^PPB004-CAPFN005 - Buscar por Texto y Tema$")
    public void Buscar_Por_Texto_Y_Tema() throws InterruptedException{
        myStep.buscarPorTextoYTema();
    }

    @Y("^PPB004-CAPFN005 - Ordenar por Fecha de publicacion ascendentemente$")
    public void Ordenar_Por_Fecha_De_Publicacion_Ascendentemente() throws InterruptedException{
        myStep.buscarPorFechaDePublicacionAscendentemente();
    }

    @Y("^PPB004-CAPFN005 - Ordenar por Titulo ascendentemente$")
    public void Ordenar_Por_Titulo_Ascendentemente() throws InterruptedException{
        myStep.buscarPorTituloAscendente();
    }

    @Y("^PPB004-CAPFN005 - Ordenar por Titulo descendentemente$")
    public void Ordenar_Por_Titulo_Descendentemente() throws InterruptedException{
        myStep.buscarPorTituloDescendente();
    }

    @Y("^PPB004-CAPFN005 - Validar funcionamiento de paginador$")
    public void Validar_Funcionamiento_De_Paginador() throws InterruptedException{
        myStep.validarFuncionamientoDePaginador();
    }
}

