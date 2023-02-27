package org.medioAmbiente.PPB006.CAP_F_086.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_086.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF086 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF086 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF086 - Clickar submenu Inclusion del cambio$")
    public void Clickar_Submenu_Inclusion_Del_Cambio()throws InterruptedException {
        myStep.clickarInclusion();
    }

    @Y("^PPB006-CAPF086 - Visualizar pagina Inclusion del cambio$")
    public void Visualizar_Pagina_Inclusion_Del_Cambio()throws InterruptedException {
        myStep.visualizarInclusion();
    }

}

