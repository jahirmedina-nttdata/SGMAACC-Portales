package org.medioAmbiente.PPB006.CAP_FN_082.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_082.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN082 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN082 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN082 - Clickar submenu Pacto Verde$")
    public void Clickar_Submenu_Pacto_Verde()throws InterruptedException {
        myStep.clickarPacto();
    }

    @Y("^PPB006-CAPFN082 - Visualizar pagina Pacto Verde$")
    public void Visualizar_Pagina_Pacto_Verde()throws InterruptedException {
        myStep.visualizarPacto();
    }

}

