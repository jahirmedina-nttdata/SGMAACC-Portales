package org.medioAmbiente.PPB003.CAP_F_106.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_106.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF106 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF106 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF106 - Acceder buscador de espacios naturales$")
    public void Acceder_Buscador_De_Espacios_Naturales()throws InterruptedException {
        myStep.accederEspaciosNaturales();
    }

    @Y("^PPB003-CAPF106 - Visualizar paginador$")
    public void Visualizar_Paginador()throws InterruptedException {
        myStep.Visualizar_Paginador();
    }

    @Y("^PPB003-CAPF106 - Seleccionar paginador$")
    public void Seleccionar_Paginador()throws InterruptedException {
    }
}

