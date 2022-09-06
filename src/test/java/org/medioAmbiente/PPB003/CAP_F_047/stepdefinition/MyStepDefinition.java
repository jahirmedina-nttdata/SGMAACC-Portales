package org.medioAmbiente.PPB003.CAP_F_047.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_047.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF047 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF047 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF047 - Clickar valor 3$")
    public void Clickar_Valor_3()throws InterruptedException {
        myStep.clickarValor3();
    }

    @Y("^PPB003-CAPF047 - Clickar valor 5$")
    public void Clickar_Valor_5()throws InterruptedException {
        myStep.clickarValor5();
    }

    @Y("^PPB003-CAPF047 - Clickar mejor valoradas$")
    public void Clickar_Mejor_Valoradas()throws InterruptedException {
        myStep.clickarValoradas();
    }
}

