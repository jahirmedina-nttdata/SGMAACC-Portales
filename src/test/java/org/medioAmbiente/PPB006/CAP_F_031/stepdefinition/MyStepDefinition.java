package org.medioAmbiente.PPB006.CAP_F_031.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_031.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF031 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF031 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF031 - Clickar submenu contacta$")
    public void Clickar_Submenu_Contacta()throws InterruptedException {
        myStep.clickarContacta();
    }

    @Y("^PPB006-CAPF031 - Visualizar pagina contacta$")
    public void Visualizar_Pagina_Contacta()throws InterruptedException {
        myStep.visualizarContacta();
    }

}

