package org.medioAmbiente.PPB006.CAP_FN_084.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_084.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN084 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN084 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN084 - Clickar submenu Ley del cambio$")
    public void Clickar_Submenu_Ley_Del_Cambio()throws InterruptedException {
        myStep.clickarLeyCambio();
    }

    @Y("^PPB006-CAPFN084 - Visualizar pagina Ley del cambio$")
    public void Visualizar_Pagina_Ley_Del_Cambio()throws InterruptedException {
        myStep.visualizarLeyCambio();
    }

}

