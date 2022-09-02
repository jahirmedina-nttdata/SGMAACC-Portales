package org.medioAmbiente.PPB001.CAP_F_080.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_080.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF080 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF080 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF080 - Seleccionar equipamiento AREA RECREATIVA")
    public void Seleccionar_Equipamiento_AREA_RECREATIVA() throws InterruptedException {
        myStep.seleccionarAreaRecreativa();
    }

    @Y("^PPB001-CAPF080 - Seleccionar provincia ALMERIA$")
    public void Seleccionar_Provincia_ALMERIA() throws InterruptedException {
        myStep.seleccionarAlmeria();
    }

    @Y("^PPB001-CAPF080 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }
}

