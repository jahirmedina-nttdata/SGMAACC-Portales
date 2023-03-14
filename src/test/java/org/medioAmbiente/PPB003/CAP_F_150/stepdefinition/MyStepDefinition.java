package org.medioAmbiente.PPB003.CAP_F_150.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_150.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF150 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF150 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF150 - Seleccionar menu PUBLICACIONES")
    public void Seleccionar_Menu_PUBLICACIONES() throws InterruptedException {
        myStep.seleccionarMenuPublicaciones();
    }

    @Y("^PPB003-CAPF150 - Escribe Sierra de Aracena en el cuadro de busqueda$")
    public void Escribe_Sierra_De_Aracena_En_El_Cuadro_De_Busqueda() throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB003-CAPF150 - Seleccionar la categoria Mapas$")
    public void Seleccionar_La_Categoria_Mapas() throws InterruptedException {
        myStep.seleccionarCatMapas();
    }


    @Y("^PPB003-CAPF150 - Pulsar el boton Buscar$")
    public void Pulsar_El_Boton_Buscar() throws InterruptedException {
        myStep.pulsarBuscar();
    }

    @Entonces("^PPB003-CAPF150 - Validar busqueda$")
    public void Validar_Busqueda() throws InterruptedException {
        myStep.validarBusqueda();
    }


    @Y("^PPB003-CAPF150 - Pulsar en enlace Formato PDF$")
    public void Pulsar_En_Enlace_Formato_PDF() throws InterruptedException {
        myStep.pulsarFormatoPDF();
    }

}

