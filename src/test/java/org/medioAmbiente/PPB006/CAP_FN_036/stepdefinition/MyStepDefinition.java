package org.medioAmbiente.PPB006.CAP_FN_036.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_036.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN036 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN036 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN036 - Clickar submenu Emisiones Industriales$")
    public void Clickar_Submenu_Emisiones_Industriales()throws InterruptedException {
        myStep.clickarEmisiones();
    }

    @Y("^PPB006-CAPFN036 - Visualizar pagina Emisiones Industriales$")
    public void Visualizar_Pagina_Emisiones_Industriales()throws InterruptedException {
        myStep.visualizarEmisiones();
    }

}

