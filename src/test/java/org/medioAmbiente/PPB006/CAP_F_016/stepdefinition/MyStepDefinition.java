package org.medioAmbiente.PPB006.CAP_F_016.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_016.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF016 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF016 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF016 - Clickar submenu causas$")
    public void Clickar_Submenu_Causas()throws InterruptedException {
        myStep.clickarCausas();
    }

    @Y("^PPB006-CAPF016 - Visualizar pagina causas$")
    public void Visualizar_Pagina_Causas()throws InterruptedException {
        myStep.visualizarCausas();
    }

}

