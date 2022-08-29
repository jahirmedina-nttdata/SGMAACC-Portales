package org.medioAmbiente.PPB007.CAP_FN_006.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FN_006.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFN006 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFN006 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFN006 - Visualizar CAPFC002$")
    public void Visualizar_CAPFC002() throws InterruptedException{
        myStep.visualizarCAPFC002();
    }

    @Y("^PPB007-CAPFN006 - Visualizar CAPFC005$")
    public void Visualizar_CAPFC005() throws InterruptedException{
        myStep.visualizarCAPFC005();
    }
}

