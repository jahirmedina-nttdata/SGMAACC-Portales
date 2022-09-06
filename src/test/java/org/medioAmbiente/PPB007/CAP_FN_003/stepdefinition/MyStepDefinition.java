package org.medioAmbiente.PPB007.CAP_FN_003.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FN_003.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFN003 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFN003 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB007-CAPFN003 - Visualizar Header CAPFC001$")
    public void Visualizar_Header_CAPFC001()throws InterruptedException {
        myStep.visualizarCAPFC001();
    }

    @Y("^PPB007-CAPFN003 - Visualizar Menu navegacion CAPFC015$")
    public void Visualizar_Menu_Navegacion_CAPFC015()throws InterruptedException {
        myStep.visualizarCAPFC015();
    }

    @Y("^PPB007-CAPFN003 - Visualizar Camino migas CAPFC014$")
    public void Visualizar_Camino_Migas_CAPFC014()throws InterruptedException {
        myStep.visualizarCAPFC014();
    }

    @Y("^PPB007-CAPFN003 - Visualizar Footer CAPFC016$")
    public void Visualizar_Footer_CAPFC016()throws InterruptedException {
        myStep.visualizarCAPFC016();
    }
}

