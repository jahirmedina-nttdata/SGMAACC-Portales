package org.medioAmbiente.PPB003.CAP_F_121.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_121.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF121 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF121 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF121 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA")
    public void Seleccionar_Tipo_De_Espacio_LUGAR_DE_IMPORTANCIA_COMUNITARIA() throws InterruptedException {
        myStep.seleccionarImportanciaComunitaria();
    }

    @Y("^PPB003-CAPF121 - Seleccionar nombre de espacio DUNAS DEL ODIEL$")
    public void Seleccionar_Nombre_De_Espacio_DUNAS_DEL_ODIEL() throws InterruptedException {
        myStep.seleccionarDunasOdiel();
    }

    @Y("^PPB003-CAPF121 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB003-CAPF121 - Validar resultado$")
    public void Validar_Resultado() throws InterruptedException {
        myStep.validarResultado();
    }

}
