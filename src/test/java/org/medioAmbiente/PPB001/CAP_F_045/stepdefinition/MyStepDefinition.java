package org.medioAmbiente.PPB001.CAP_F_045.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_045.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF045 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF045 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF045 - Seleccionar tipo de espacio LUGAR DE IMPORTANCIA COMUNITARIA")
    public void Seleccionar_Tipo_De_Espacio_LUGAR_DE_IMPORTANCIA_COMUNITARIA() throws InterruptedException {
        myStep.seleccionarTipoDeEspacio();
    }

    @Y("^PPB001-CAPF045 - Seleccionar nombre de espacio MARIASMAS DEL ODIEL$")
    public void Seleccionar_Nombre_De_Espacio_MARIASMAS_DEL_ODIEL() throws InterruptedException {
        myStep.seleccionarNombreDeEspacio();
    }

    @Y("^PPB001-CAPF045 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB001-CAPF045 - Validar resultado$")
    public void Validar_Resultado() throws InterruptedException {
    }

}

