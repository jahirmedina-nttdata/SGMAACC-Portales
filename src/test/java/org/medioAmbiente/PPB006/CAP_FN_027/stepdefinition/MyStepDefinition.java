package org.medioAmbiente.PPB006.CAP_FN_027.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_027.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN027 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN027 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN027 - Clickar submenu funciones$")
    public void Clickar_Submenu_Funciones()throws InterruptedException {
        myStep.clickarFunciones();
    }

    @Y("^PPB006-CAPFN027 - Visualizar pagina funciones$")
    public void Visualizar_Pagina_Funciones()throws InterruptedException {
        myStep.visualizarFunciones();
    }

}

