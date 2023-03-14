package org.medioAmbiente.PPB003.CAP_F_113.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_113.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF113 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF113 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF113 - Seleccionar menu QUE PUEDES HACER")
    public void Seleccionar_Menu_QUE_PUEDES_HACER() throws InterruptedException {
        myStep.seleccionarMenu();
    }

    @Y("^PPB003-CAPF113 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES$")
    public void Seleccionar_Submenu_BUSCADOR_DE_ESPACIOS_NATURALES() throws InterruptedException {
        myStep.seleccionarSubmenu();
    }

    @Y("^PPB003-CAPF113 - Escribe Sierra de Aracena en el cuadro de busqueda$")
    public void Escribe_Sierra_De_Aracena_En_El_Cuadro_De_Busqueda() throws InterruptedException {
        myStep.buscarPorTexto();
    }


    @Y("^PPB003-CAPF113 - Pulsar el boton Buscar$")
    public void Pulsar_El_Boton_Buscar() throws InterruptedException {
        myStep.pulsarBuscar();
    }

    @Entonces("^PPB003-CAPF113 - Validar busqueda$")
    public void Validar_Busqueda() throws InterruptedException {
        myStep.validarBusqueda();
    }


    @Y("^PPB003-CAPF113 - Pulsar el boton EXPORTAR RESULTADOS$")
    public void Pulsar_El_Boton_EXPORTAR_RESULTADOS() throws InterruptedException {
        myStep.pulsarExportarResultados();
    }

}

