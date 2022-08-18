package org.medioAmbiente.PPB006.CAP_FN_044.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_044.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN044 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN044 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN044 - Clickar submenu Sumideros$")
    public void Clickar_Submenu_Sumideros()throws InterruptedException {
        myStep.clickarSumideros();
    }

    @Y("^PPB006-CAPFN044 - Visualizar pagina Sumideros$")
    public void Visualizar_Pagina_Sumideros()throws InterruptedException {
        myStep.visualizarSumideros();
    }

}

