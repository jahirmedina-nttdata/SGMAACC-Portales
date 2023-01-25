package org.medioAmbiente.PPB003.CAP_F_204.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_204.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF204 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF204 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF204 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA")
    public void Seleccionar_Tipo_De_Espacio_LUGAR_DE_IMPORTANCIA_COMUNITARIA() throws InterruptedException {
        myStep.seleccionarTipoDeEspacio();
    }

    @Y("^PPB003-CAPF204 - Seleccionar nombre de espacio ACEBUCHAL DE ALPIZAR$")
    public void Seleccionar_Nombre_De_Espacio_ACEBUCHAL_DE_ALPIZAR() throws InterruptedException {
        myStep.seleccionarNombreDeEspacio();
    }

    @Y("^PPB003-CAPF204 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }
}

