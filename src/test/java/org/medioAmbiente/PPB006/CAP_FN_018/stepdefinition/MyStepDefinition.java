package org.medioAmbiente.PPB006.CAP_FN_018.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_018.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN018 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN018 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN018 - Clickar submenu efectos$")
    public void Clickar_Submenu_Efectos()throws InterruptedException {
        myStep.clickarEfectos();
    }

    @Y("^PPB006-CAPFN018 - Visualizar pagina efectos$")
    public void Visualizar_Pagina_Efectos()throws InterruptedException {
        myStep.visualizarEfectos();
    }

}

