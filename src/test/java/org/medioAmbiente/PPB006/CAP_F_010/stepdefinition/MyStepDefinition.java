package org.medioAmbiente.PPB006.CAP_F_010.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_010.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF010 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF010 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF010 - Accedo Cambio Climatico$")
    public void Accedo_Cambio_Climatico()throws InterruptedException {
        myStep.accederEnlace();
    }

    @Entonces("^PPB006-CAPF010 - Visualizo pagina$")
    public void Visualizo_Pagina()throws InterruptedException {
        myStep.visualizarPagina();
    }

}

