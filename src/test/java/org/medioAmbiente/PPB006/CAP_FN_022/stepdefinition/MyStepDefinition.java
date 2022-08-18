package org.medioAmbiente.PPB006.CAP_FN_022.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_022.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN022 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN022 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB006-CAPFN022 - Visualizar titulo CAP_FC_004$")
    public void Visualizar_Titulo_CAP_FC_004()throws InterruptedException {
        myStep.visualizarCAPFC004();
    }

    @Y("^PPB006-CAPFN022 - Visualizar areas CAP_FC_009$")
    public void Visualizar_Areas_CAP_FC_009()throws InterruptedException {
        myStep.visualizarCAPFC009();
    }

}

