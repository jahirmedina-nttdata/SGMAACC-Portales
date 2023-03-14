package org.medioAmbiente.PPB003.CAP_F_116.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_116.step.MyStep;

import java.sql.SQLException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF116 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF116 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF116 - Seleccionar Area Recreativa")
    public void Seleccionar_Area_Recreativa() throws InterruptedException {
        myStep.seleccionarAreaRecreativa();
    }

    @Y("^PPB003-CAPF116 - Seleccionar provincia Almeria$")
    public void Seleccionar_Provincia_Almeria() throws InterruptedException {
        myStep.seleccionarAlmeria();
    }

    @Y("^PPB003-CAPF116 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB003-CAPF116 - Validar resultado$")
    public void Validar_Resultado() throws InterruptedException, SQLException {
        myStep.validarResultado();
    }

}

