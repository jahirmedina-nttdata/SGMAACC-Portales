package org.medioAmbiente.PPB006.CAP_FN_008.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_008.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN008 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN008 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN008 - Visualizar titulo CAPFC004$")
    public void Visualizar_Titulo_CAPFC004()throws InterruptedException {
        myStep.visualizarCAPFC004();
    }

    @Y("^PPB006-CAPFN008 - Visualizar directoA CAPFC014$")
    public void Visualizar_DirectoA_CAPFC014()throws InterruptedException {
        myStep.visualizarCAPFC014();
    }

}

