package org.medioAmbiente.PPB003.CAP_F_117.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_117.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF117 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF117 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF117 - Clickar paginador$")
    public void Clickar_Paginador()throws InterruptedException {
        myStep.clickarPaginador();
    }

    @Y("^PPB003-CAPF117 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

    @Y("^PPB003-CAPF117 - Retroceder pagina$")
    public void Retroceder_Pagina()throws InterruptedException {
        myStep.retrocederPagina();
    }

    @Entonces("^PPB003-CAPF117 - Validar cacheo de paginador$")
    public void Validar_Cacheo_De_Paginador()throws InterruptedException {
        myStep.validarCacheoDePaginador();
    }
}

