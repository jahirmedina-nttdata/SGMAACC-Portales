package org.medioAmbiente.PPB003.CAP_F_034.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_034.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF034 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF034 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF034 - Clickar pestaña Datos de Interes$")
    public void Clickar_Pestaña_Datos_De_Interes()throws InterruptedException {
        myStep.clickarPestaña();
    }
    @Y("^PPB003-CAPF034 - Clickar espacios naturales$")
    public void Clickar_Espacios_Naturales()throws InterruptedException {
        myStep.clickarEspaciosNaturales();
    }

    @Y("^PPB003-CAPF034 - Visualizar datos de contacto$")
    public void Visualizar_Datos_De_Contacto()throws InterruptedException {
        myStep.visualizarDatos();
    }
}

