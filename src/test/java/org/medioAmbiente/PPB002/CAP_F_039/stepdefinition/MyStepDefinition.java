package org.medioAmbiente.PPB002.CAP_F_039.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_039.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF039 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF039 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF039 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF039 - Visualizar carrusel$")
    public void Visualizar_Carrusel() throws InterruptedException{
        myStep.visualizarCarrusel();
    }

    @Y("^PPB002-CAPF039 - Comprobar funcionamiento de flechas$")
    public void Comprobar_Funcionamiento_De_Flechas() throws InterruptedException{
        myStep.comprobarFuncionamientoDeFlechas();
    }

    @Y("^PPB002-CAPF039 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException{
        myStep.clickarEnlace();
    }
}

