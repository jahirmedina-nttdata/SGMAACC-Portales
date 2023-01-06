package org.medioAmbiente.PPB007.CAP_FC_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC002 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB007-CAPFC002 - Visualizar titulo$")
    public void Visualizar_Titulo()throws InterruptedException {
        myStep.visualizarTitulo();
    }
}

