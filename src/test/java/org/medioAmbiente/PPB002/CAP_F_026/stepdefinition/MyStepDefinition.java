package org.medioAmbiente.PPB002.CAP_F_026.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_026.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF026 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF026 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF026 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF026 - Comprobar funcionamiento de Carrusel$")
    public void Comprobar_Funcionamiento_De_Carrusel() throws InterruptedException{
        myStep.comprobarFuncionamientoCarrusel();
    }

    @Y("^PPB002-CAPF026 - Comprobar funcionamiento de listado$")
    public void Comprobar_Funcionamiento_De_Listado() throws InterruptedException{
        myStep.comprobarFuncionamientoListado();
    }

    @Y("^PPB002-CAPF026 - Comprobar funcionamiento de filtros$")
    public void Comprobar_Funcionamiento_De_Filtros() throws InterruptedException{
        myStep.comprobarFuncionamientoFiltros();
    }
}

