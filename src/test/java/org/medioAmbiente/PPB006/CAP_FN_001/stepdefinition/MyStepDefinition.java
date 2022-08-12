package org.medioAmbiente.PPB006.CAP_FN_001.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_001.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN001 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException{

    }

    @Y("^PPB006-CAPFN001 - Accedo al Portal de Referencia$")
    public void Accedo_Al_Portal_De_Referencia() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB006-CAPFN001 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

}

