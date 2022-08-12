package org.medioAmbiente.PPB004.CAP_FC_003.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_003.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC003 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC003 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPFC003 - Seleccionar enlace$")
    public void Seleccionar_Enlace()throws InterruptedException {
        myStep.seleccionarEnlace();
    }


    @Y("^PPB004-CAPFC003 - Posicionar puntero$")
    public void Posicionar_Puntero() throws InterruptedException{
        myStep.posicionarPuntero();
    }

    @Y("^PPB004-CAPFC003 - Clickar pagina padre$")
    public void Clickar_Pagina_Padre() throws InterruptedException {
        myStep.clickarPagPadre();
    }

    @Y("^PPB004-CAPFC003 - Clickar miga$")
    public void Clickar_Miga() throws InterruptedException {
        myStep.clickarMiga();
    }
}

