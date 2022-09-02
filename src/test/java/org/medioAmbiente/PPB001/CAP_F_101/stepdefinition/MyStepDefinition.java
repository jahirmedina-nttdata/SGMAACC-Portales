package org.medioAmbiente.PPB001.CAP_F_101.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_101.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF101 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF101 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF101 - Seleccionar tipo de espacio MONUMENTO NATURAL$")
    public void Seleccionar_Tipo_De_Espacio_MONUMENTO_NATURAL() throws InterruptedException {
        myStep.seleccionarTipoEspacio();
    }

    @Y("^PPB001-CAPF101 - Seleccionar provincia ALMERÍA$")
    public void Seleccionar_Provincia_ALMERÍA() throws InterruptedException {
        myStep.seleccionarProvincia();
    }

    @Y("^PPB001-CAPF101 - Seleccionar categoria GUÍAS$")
    public void Seleccionar_Categoria_GUÍAS() throws InterruptedException {
        myStep.seleccionarCategoria();
    }

    @Y("^PPB001-CAPF101 - Seleccionar tipo de archivo PDF$")
    public void Seleccionar_Tipo_De_Archivo_PDF() throws InterruptedException {
        myStep.seleccionarArchivo();
    }

    @Y("^PPB001-CAPF101 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB001-CAPF101 - Validar Busqueda$")
    public void Validar_Busqueda() throws InterruptedException {
        myStep.validarBusqueda();
    }
}

