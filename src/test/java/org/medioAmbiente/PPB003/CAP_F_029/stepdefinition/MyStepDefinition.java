package org.medioAmbiente.PPB003.CAP_F_029.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_029.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF029 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF029 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF029 - Visualizar Apartado Descargas$")
    public void  Visualizar_Apartado_Descargas()throws InterruptedException {
        myStep.visualizarDescargas();
    }
    @Y("^PPB003-CAPF029 - Clickar Descarga$")
    public void Clickar_Descarga()throws InterruptedException {
        myStep.clickarDescarga();
    }
}

