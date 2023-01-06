package org.medioAmbiente.PPB007.CAP_FC_004.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_004.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC004 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC004 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFC004 - Visualizar fecha y texto$")
    public void Visualizar_Fecha_Y_Texto()throws InterruptedException {
    }

    @Y("^PPB007-CAPFC004 - Clickar titulo$")
    public void Clickar_Titulo()throws InterruptedException {

    }

    @Y("^PPB007-CAPFC004 - Mostrar texto flotante$")
    public void Mostrar_Texto_Flotante()throws InterruptedException {

    }
}

