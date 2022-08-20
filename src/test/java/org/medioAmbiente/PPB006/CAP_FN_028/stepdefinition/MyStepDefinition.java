package org.medioAmbiente.PPB006.CAP_FN_028.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_025.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN028 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN028 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN028 - Visualizar informacion CAP_FC_007$")
    public void Visualizar_Informacion_CAP_FC_007()throws InterruptedException {
        myStep.visualizarCAPFN007();
    }

}
