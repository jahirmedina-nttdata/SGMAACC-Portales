package org.medioAmbiente.PPB003.CAP_F_108.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_108.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF108 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF108 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF108 - Seleccionar espacio natural$")
    public void Seleccionar_Espacio_Natural()throws InterruptedException {
        myStep.seleccionarEspacioNatural();
    }

    @Y("^PPB003-CAPF108 - Check ocultar actividades especificas$")
    public void Check_Ocultar_Actividades_Especificas()throws InterruptedException {
        myStep.ocultarActividadesEspecificas();
    }
}

