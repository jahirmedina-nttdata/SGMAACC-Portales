package org.medioAmbiente.PPB003.CAP_F_122.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_122.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF122 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF122 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF122 - Seleccionar menu QUE PUEDES HACER")
    public void Seleccionar_Menu_QUE_PUEDES_HACER() throws InterruptedException {
        myStep.seleccionarMenu();
    }

    @Y("^PPB003-CAPF122 - Seleccionar submenu BUSCADOR DE ESPACIOS NATURALES$")
    public void Seleccionar_Submenu_BUSCADOR_DE_ESPACIOS_NATURALES() throws InterruptedException {
        myStep.seleccionarSubmenu();
    }

    @Y("^PPB003-CAPF122 - Seleccionar provincia Almeria$")
    public void Seleccionar_Provincia_Almeria() throws InterruptedException {
        myStep.seleccionarProvinciaAlmeria();
    }

    @Y("^PPB003-CAPF122 - Seleccionar tipo equipamiento Sendero señalizado$")
    public void Seleccionar_Tipo_Equipamiento_Sendero_Señalizado() throws InterruptedException {
        myStep.seleccionarTipoEquipamientoSenderoSeñalizado();
    }

    @Y("^PPB003-CAPF122 - Pulsar el boton Buscar$")
    public void Pulsar_El_Boton_Buscar() throws InterruptedException {
        myStep.pulsarBuscar();
    }

    @Entonces("^PPB003-CAPF122 - Validar busqueda$")
    public void Validar_Busqueda() throws InterruptedException {
        myStep.validarBusqueda();
    }


    @Y("^PPB003-CAPF122 - Pulsar el boton Limpiar$")
    public void Pulsar_El_Boton_Limpiar() throws InterruptedException {
        myStep.pulsarLimpiar();
    }

}

