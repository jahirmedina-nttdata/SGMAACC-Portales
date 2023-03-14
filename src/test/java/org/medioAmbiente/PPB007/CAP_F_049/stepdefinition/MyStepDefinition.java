package org.medioAmbiente.PPB007.CAP_F_049.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_049.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB007-CAPF049 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB007-CAPF049 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF049 - Clickar paginador$")
    public void Clickar_Paginador()throws InterruptedException {
        myStep.clickarPaginador();
    }

    @Y("^PPB007-CAPF049 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

    @Y("^PPB007-CAPF049 - Retroceder pagina$")
    public void Retroceder_Pagina()throws InterruptedException {
        myStep.retrocederPagina();
    }

    @Entonces("^PPB007-CAPF049 - Validar cacheo de paginador$")
    public void Validar_Cacheo_De_Paginador()throws InterruptedException {
        myStep.validarCacheoDePaginador();
    }
}

