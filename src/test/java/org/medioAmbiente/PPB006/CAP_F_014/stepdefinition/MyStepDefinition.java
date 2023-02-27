package org.medioAmbiente.PPB006.CAP_F_014.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_014.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF014 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF014 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF014 - Clickar submenu evidencias$")
    public void Clickar_Submenu_Evidencias()throws InterruptedException {
        myStep.clickarEvidencias();
    }

    @Y("^PPB006-CAPF014 - Visualizar pagina evidencias$")
    public void Visualizar_Pagina_Evidencias()throws InterruptedException {
        myStep.visualizarEvidencias();
    }

}

