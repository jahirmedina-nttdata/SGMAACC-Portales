package org.medioAmbiente.PPB001.CAP_F_075.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_075.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF075 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF075 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF075 - Seleccionar el paginador$")
    public void Seleccionar_El_Paginador() throws InterruptedException {

    }

    @Y("^PPB001-CAPF075 - Clickar siguiente pagina$")
    public void Clickar_Siguiente_Pagina() throws InterruptedException {

    }

    @Y("^PPB001-CAPF075 - Clickar siguiente en la ultima pagina$")
    public void Clickar_Siguiente_En_La_Ultima_Pagina() throws InterruptedException {

    }

    @Y("^PPB001-CAPF075 - Clickar anterior$")
    public void Clickar_Anterior() throws InterruptedException {

    }

    @Y("^PPB001-CAPF075 - Clickar anterior en la primera pagina$")
    public void Clickar_Anterior_En_La_Primera_Pagina() throws InterruptedException {

    }

}

