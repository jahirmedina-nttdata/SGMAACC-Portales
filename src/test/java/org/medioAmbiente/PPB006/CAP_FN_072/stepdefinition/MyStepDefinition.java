package org.medioAmbiente.PPB006.CAP_FN_072.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_072.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN072 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN072 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN072 - Clickar submenu Organizmo de referencia$")
    public void Clickar_Submenu_Organizmo_De_Referencia()throws InterruptedException {
        myStep.clickarOrganizmo();
    }

    @Y("^PPB006-CAPFN072 - Visualizar pagina Organizmo de referencia$")
    public void Visualizar_Pagina_Organizmo_De_Referencia()throws InterruptedException {
        myStep.visualizarOrganizmo();
    }

}

