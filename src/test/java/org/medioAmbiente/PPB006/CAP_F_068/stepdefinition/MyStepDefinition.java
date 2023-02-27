package org.medioAmbiente.PPB006.CAP_F_068.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_068.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF068 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF068 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF068 - Clickar submenu Documentacion y recursos$")
    public void Clickar_Submenu_Documentacion_Y_Recursos()throws InterruptedException {
        myStep.clickarDocumentacion();
    }

    @Y("^PPB006-CAPF068 - Visualizar pagina Documentacion y recursos$")
    public void Visualizar_Pagina_Documentacion_Y_Recursos()throws InterruptedException {
        myStep.visualizarDocumentacion();
    }

}

