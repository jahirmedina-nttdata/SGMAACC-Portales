package org.medioAmbiente.PPB001.CAP_F_084.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_084.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF084 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF084 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF084 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA")
    public void Seleccionar_Tipo_De_Espacio_LUGAR_DE_IMPORTANCIA_COMUNITARIA() throws InterruptedException {
        myStep.seleccionarTipoDeEspacio();
    }

    @Y("^PPB001-CAPF084 - Seleccionar nombre de espacio ACEBUCHAL DE ALPIZAR$")
    public void Seleccionar_Nombre_De_Espacio_ACEBUCHAL_DE_ALPIZAR() throws InterruptedException {
        myStep.seleccionarNombreDeEspacio();
    }

    @Y("^PPB001-CAPF084 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }
}

