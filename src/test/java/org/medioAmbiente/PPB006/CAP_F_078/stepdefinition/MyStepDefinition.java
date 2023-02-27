package org.medioAmbiente.PPB006.CAP_F_078.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_078.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF078 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF078 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF078 - Clickar submenu Antecedentes en Andalucia$")
    public void Clickar_Submenu_Antecedentes_En_Andalucia()throws InterruptedException {
        myStep.clickarAntecedentes();
    }

    @Y("^PPB006-CAPF078 - Visualizar pagina Antecedentes en Andalucia$")
    public void Visualizar_Pagina_Antecedentes_En_Andalucia()throws InterruptedException {
        myStep.visualizarAntecedentes();
    }

}

