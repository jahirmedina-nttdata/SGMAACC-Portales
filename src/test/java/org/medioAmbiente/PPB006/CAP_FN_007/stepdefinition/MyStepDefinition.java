package org.medioAmbiente.PPB006.CAP_FN_007.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_007.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN007 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN007 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN007 - Visualizar titulo CAPFC004$")
    public void Visualizar_Titulo_CAPFC004()throws InterruptedException {
        myStep.visualizarCAPFC004();
    }

    @Y("^PPB006-CAPFN007 - Visualizar actualidad CAPFC005$")
    public void Visualizar_Actualidad_CAPFC005()throws InterruptedException {
        myStep.visualizarCAPFC005();
    }

}

