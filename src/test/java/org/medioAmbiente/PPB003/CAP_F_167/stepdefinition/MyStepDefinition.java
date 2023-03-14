package org.medioAmbiente.PPB003.CAP_F_167.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_167.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF167 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF167 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF167 - Seleccionar tipo de espacio MONUMENTO NATURAL$")
    public void Seleccionar_Tipo_De_Espacio_MONUMENTO_NATURAL() throws InterruptedException {
        myStep.seleccionarTipoDeEspacio();
    }

    @Y("^PPB003-CAPF167 - Seleccionar nombre de espacio ENCINA DE LA PEANA$")
    public void Seleccionar_Nombre_De_Espacio_ENCINA_DE_LA_PEANA() throws InterruptedException {
        myStep.seleccionarNombreDeEspacio();
    }

    @Y("^PPB003-CAPF167 - Clickar buscar$")
    public void Clickar_Buscar() throws InterruptedException {
        myStep.clickarBuscar();
    }

    @Entonces("^PPB003-CAPF167 - Validar resultado$")
    public void Validar_Resultado() throws InterruptedException {
    }

}

