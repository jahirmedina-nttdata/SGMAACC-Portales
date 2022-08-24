package org.medioAmbiente.PPB003.CAP_F_050.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_050.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF050 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF050 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF050 - Visualizar carrusel$")
    public void Visualizar_Carrusel()throws InterruptedException {
        myStep.visualizarCarrusel();
    }

    @Y("^PPB003-CAPF050 - Deslizar a la izquierda$")
    public void Deslizar_A_La_Izquierda()throws InterruptedException {
        myStep.deslizarIzquierda();
    }

    @Y("^PPB003-CAPF050 - Deslizar a la derecha$")
    public void Deslizar_A_La_Derecha()throws InterruptedException {
        myStep.deslizarDerecha();
    }


}

