package org.medioAmbiente.PPB003.CAP_F_003.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_003.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF003 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF003 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF003 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF003 - Accedo al Espacio natural y equipamiento$")
    public void Accedo_Al_Espacio_Natural_Y_Equipamiento()throws InterruptedException, URISyntaxException {
        myStep.accederEspacioNatural();
    }

    @Y("^PPB003-CAPF003 - Clickar icono editar$")
    public void Clickar_Icono_Editar()throws InterruptedException {
        myStep.clikarIconoEditar();
    }

    @Entonces("^PPB003-CAPF003 - Visualiza codigo RENPA$")
    public void Visualiza_Codigo_RENPA()throws InterruptedException {
        myStep.visualizarCodigoRENPA();
    }
}

