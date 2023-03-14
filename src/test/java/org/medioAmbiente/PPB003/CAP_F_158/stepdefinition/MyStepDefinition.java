package org.medioAmbiente.PPB003.CAP_F_158.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_158.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF158 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF158 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF158 - Seleccionar tipo de espacio MONUMENTO NATURAL$")
    public void Seleccionar_Tipo_De_Espacio_MONUMENTO_NATURAL() throws InterruptedException {
        myStep.seleccionarTipoEspacio();
    }

    @Y("^PPB003-CAPF158 - Seleccionar provincia ALMERÍA$")
    public void Seleccionar_Provincia_ALMERÍA() throws InterruptedException {
        myStep.seleccionarProvincia();
    }

    @Y("^PPB003-CAPF158 - Seleccionar categoria GUÍAS$")
    public void Seleccionar_Categoria_GUÍAS() throws InterruptedException {
        myStep.seleccionarCategoria();
    }

    @Y("^PPB003-CAPF158 - Seleccionar tipo de archivo PDF$")
    public void Seleccionar_Tipo_De_Archivo_PDF() throws InterruptedException {
        myStep.seleccionarArchivo();
    }

    @Y("^PPB003-CAPF158 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB003-CAPF158 - Validar Busqueda$")
    public void Validar_Busqueda() throws InterruptedException {
        myStep.validarBusqueda();
    }
}

