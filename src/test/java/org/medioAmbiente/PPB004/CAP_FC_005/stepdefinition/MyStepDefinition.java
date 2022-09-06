package org.medioAmbiente.PPB004.CAP_FC_005.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_005.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC005 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC005 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPFC005 - Mostrar buscador general$")
    public void Mostrar_Buscador_General()throws InterruptedException {
        myStep.buscadorGeneral();
    }

    @Y("^PPB004-CAPFC005 - Acceder buscador avanzado$")
    public void Acceder_Buscador_Avanzado()throws InterruptedException {
        myStep.buscadorAvanzado();
    }

}

