package org.medioAmbiente.PPB006.CAP_FN_089.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_089.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN089 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN089 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN089 - Clickar submenu Plan Andaluz$")
    public void Clickar_Submenu_Plan_Andaluz()throws InterruptedException {
        myStep.clickarPlanAndaluz();
    }

    @Y("^PPB006-CAPFN089 - Visualizar pagina Plan Andaluz$")
    public void Visualizar_Pagina_Plan_Andaluz()throws InterruptedException {
        myStep.visualizarPlanAndaluz();
    }

}

