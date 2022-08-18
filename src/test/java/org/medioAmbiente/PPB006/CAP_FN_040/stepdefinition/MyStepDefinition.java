package org.medioAmbiente.PPB006.CAP_FN_040.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_040.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN040 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN040 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN040 - Clickar submenu Emisiones Difusas$")
    public void Clickar_Submenu_Emisiones_Difusas()throws InterruptedException {
        myStep.clickarDifusas();
    }

    @Y("^PPB006-CAPFN040 - Visualizar pagina Emisiones Difusas$")
    public void Visualizar_Pagina_Emisiones_Difusas()throws InterruptedException {
        myStep.visualizarDifusas();
    }

}

