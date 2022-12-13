package org.medioAmbiente.PPB003.CAP_F_128.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_128.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF128 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF128 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF128 - Clickar pestaña EQUIPAMIENTOS RELACIONADOS$")
    public void Clickar_Pestaña_EQUIPAMIENTOS_RELACIONADOS() throws InterruptedException {
        myStep.clickarEquipamientosRelacionados();
    }

    @Y("^PPB003-CAPF128 - Clickar en ficha$")
    public void Clickar_En_Ficha() throws InterruptedException {
        myStep.clickarFicha();
    }

    @Entonces("^PPB003-CAPF128 - Validar Ficha$")
    public void Validar_Ficha() throws InterruptedException {
        myStep.validarFicha();
    }

}

