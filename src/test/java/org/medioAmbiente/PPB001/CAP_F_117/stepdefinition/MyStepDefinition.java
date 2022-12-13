package org.medioAmbiente.PPB001.CAP_F_117.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_117.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF117 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF117 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF117 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF117 - Acceder al Preview Contenidos Web$")
    public void Acceder_Al_Preview_Contenidos_Web()throws InterruptedException {
        myStep.accederPreviewContenidosWeb();
    }

    @Y("^PPB001-CAPF117 - Cambiar numero de entradas$")
    public void Cambiar_Numero_De_Entradas()throws InterruptedException {
        myStep.cambiarNroEntradas();
    }

}

