package org.medioAmbiente.PPB006.CAP_FN_091.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_091.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN091 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN091 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN091 - Clickar submenu Iniciativas y proyectos$")
    public void Clickar_Submenu_Iniciativas_Y_Proyectos()throws InterruptedException {
        myStep.clickarIniciativas();
    }

    @Y("^PPB006-CAPFN091 - Visualizar pagina Iniciativas y proyectos$")
    public void Visualizar_Pagina_Iniciativas_Y_Proyectos()throws InterruptedException {
        myStep.visualizarIniciativas();
    }

}

