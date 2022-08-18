package org.medioAmbiente.PPB006.CAP_FN_029.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_029.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN029 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN029 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN029 - Clickar submenu objetivos$")
    public void Clickar_Submenu_Objetivos()throws InterruptedException {
        myStep.clickarObjetivos();
    }

    @Y("^PPB006-CAPFN029 - Visualizar pagina objetivos$")
    public void Visualizar_Pagina_Objetivos()throws InterruptedException {
        myStep.visualizarObjetivos();
    }

}

