package org.medioAmbiente.PPB007.CAP_FC_008.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_008.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC008 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC008 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFC008 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB007-CAPFC008 - Desplegar contenido$")
    public void Desplegar_Contenido()throws InterruptedException {
        myStep.desplegarContenido();
    }

    @Y("^PPB007-CAPFC008 - Ocultar contenido$")
    public void Ocultar_Contenido()throws InterruptedException {
        myStep.ocultarContenido();
    }

}

