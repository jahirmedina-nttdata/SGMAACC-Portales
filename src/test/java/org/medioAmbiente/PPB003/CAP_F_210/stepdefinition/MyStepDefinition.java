package org.medioAmbiente.PPB003.CAP_F_210.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_210.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF210 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF210 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF210 - Escribir Andalucia en el cuadro de texto$")
    public void Escribir_Andalucia_En_El_Cuadro_De_Texto() throws InterruptedException {
        myStep.escribirTextoBusqueda();
    }

    @Y("^PPB003-CAPF210 - Seleccionar tipo de equipamiento CENTRO DE VISITANTES$")
    public void Seleccionar_Tipo_De_Equipamiento_CENTRO_DE_VISITANTES() throws InterruptedException {
        myStep.seleccionarTipoEquipamiento();
    }

    @Y("^PPB003-CAPF210 - Seleccionar provincia CÁDIZ$")
    public void Seleccionar_Provincia_CÁDIZ() throws InterruptedException {
        myStep.seleccionarProvincia();
    }

    @Y("^PPB003-CAPF210 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }
}

