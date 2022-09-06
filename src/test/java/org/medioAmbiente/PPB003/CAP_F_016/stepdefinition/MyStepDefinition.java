package org.medioAmbiente.PPB003.CAP_F_016.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_016.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF016 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF016 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF016 - Clickar pestaña Mapa$")
    public void Clickar_Pestaña_Mapa()throws InterruptedException {
        myStep.clickarMapa();
    }
    @Y("^PPB003-CAPF016 - Clickar icono Observatorio y ver ficha$")
    public void Clickar_Icono_Observatorio_Y_Ver_Ficha()throws InterruptedException {
        myStep.clickarIconoObservatorio();
    }
}

