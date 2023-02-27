package org.medioAmbiente.PPB006.CAP_F_020.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_020.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF020 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF020 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF020 - Clickar submenu Actua$")
    public void Clickar_Submenu_Actua()throws InterruptedException {
        myStep.clickarActua();
    }

    @Y("^PPB006-CAPF020 - Visualizar pagina Actua$")
    public void Visualizar_Pagina_Actua()throws InterruptedException {
        myStep.visualizarActua();
    }

}

