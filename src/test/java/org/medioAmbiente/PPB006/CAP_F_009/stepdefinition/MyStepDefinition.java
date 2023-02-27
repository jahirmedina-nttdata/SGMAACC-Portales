package org.medioAmbiente.PPB006.CAP_F_009.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_009.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF009 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF009 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF009 - Visualizar titulo CAPF106$")
    public void Visualizar_Titulo_CAPF106()throws InterruptedException {
        myStep.visualizarCAPF106();
    }

    @Y("^PPB006-CAPF009 - Visualizar carrusel CAPF111$")
    public void Visualizar_Carrusel_CAPF111()throws InterruptedException {
        myStep.visualizarCAPF111();
    }

}

