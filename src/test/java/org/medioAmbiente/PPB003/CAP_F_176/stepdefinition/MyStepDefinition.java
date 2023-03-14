package org.medioAmbiente.PPB003.CAP_F_176.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_176.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF176 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF176 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF176 - Seleccionar equipamiento AREA RECREATIVA")
    public void Seleccionar_Equipamiento_AREA_RECREATIVA() throws InterruptedException {
        myStep.seleccionarAreaRecreativa();
    }

    @Y("^PPB003-CAPF176 - Seleccionar provincia CÁDIZ$")
    public void Seleccionar_Provincia_CÁDIZ() throws InterruptedException {
        myStep.seleccionarCadiz();
    }

    @Y("^PPB003-CAPF176 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB003-CAPF176 - Validar resultado$")
    public void Validar_Resultado() throws InterruptedException {
        myStep.validarResultado();
    }

}

