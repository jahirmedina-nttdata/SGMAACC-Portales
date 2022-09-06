package org.medioAmbiente.PPB006.CAP_FC_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFC002 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFC002 - Visualizar buscador general$")
    public void Visualizar_Buscador_General()throws InterruptedException {
        myStep.visualizarBuscador();
    }

    @Y("^PPB006-CAPFC002 - Acceder a buscador avanzado$")
    public void Acceder_A_Buscador_Avanzado() throws InterruptedException{
        myStep.accederBuscador();
    }

    @Y("^PPB006-CAPFC002 - Visualizar CAP_FC_002_1$")
    public void Visualizar_CAP_FC_002_1()throws InterruptedException {
        myStep.visualizarCAPFC0201();
    }


}

