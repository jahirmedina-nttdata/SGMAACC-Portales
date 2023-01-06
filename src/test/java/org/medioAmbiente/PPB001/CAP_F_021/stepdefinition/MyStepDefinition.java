package org.medioAmbiente.PPB001.CAP_F_021.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_021.step.MyStep;

import java.sql.SQLException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF021 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF021 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF021 - Seleccionar Area Recreativa")
    public void Seleccionar_Area_Recreativa() throws InterruptedException {
        myStep.seleccionarAreaRecreativa();
    }

    @Y("^PPB001-CAPF021 - Seleccionar provincia Almeria$")
    public void Seleccionar_Provincia_Almeria() throws InterruptedException {
        myStep.seleccionarAlmeria();
    }

    @Y("^PPB001-CAPF021 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB001-CAPF021 - Validar resultado$")
    public void Validar_Resultado() throws InterruptedException, SQLException {
        myStep.validarResultado();
    }

}

