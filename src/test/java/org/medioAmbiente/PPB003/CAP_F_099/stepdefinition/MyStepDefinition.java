package org.medioAmbiente.PPB003.CAP_F_099.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_099.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF099 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF099 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF099 - Visualizar paginador$")
    public void Visualizar_Paginador()throws InterruptedException {
        myStep.visualizarPaginador();
    }

    @Y("^PPB003-CAPF099 - Seleccionar paginador$")
    public void Seleccionar_Paginador()throws InterruptedException {
    }
}

