package org.medioAmbiente.PPB002.CAP_F_042.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_042.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF042 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF042 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF042 - Aceptar las cookies$")
    public void Aceptar_LasCookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF042 - Visualizar tarjetas$")
    public void Visualizar_Tarjetas() throws InterruptedException{
        myStep.visualizarTarjetas();
    }

    @Y("^PPB002-CAPF042 - Comprobar funcionamiento de flechas$")
    public void Comprobar_Funcionamiento_De_Flechas() throws InterruptedException{
        myStep.comprobarFuncionamientoDeFlechas();
    }

    @Y("^PPB002-CAPF042 - Clickar enlace$")
    public void Clickar_Enlace() throws InterruptedException{
        myStep.clickarEnlace();
    }
}

