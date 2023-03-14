package org.medioAmbiente.PPB004.CAP_F_075.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_075.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB004-CAPF075 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB004-CAPF075 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF075 - Clickar paginador$")
    public void Clickar_Paginador()throws InterruptedException {
        myStep.clickarPaginador();
    }

    @Y("^PPB004-CAPF075 - Seleccionar contenido$")
    public void Seleccionar_Contenido()throws InterruptedException {
        myStep.seleccionarContenido();
    }

    @Y("^PPB004-CAPF075 - Retroceder pagina$")
    public void Retroceder_Pagina()throws InterruptedException {
        myStep.retrocederPagina();
    }
}

