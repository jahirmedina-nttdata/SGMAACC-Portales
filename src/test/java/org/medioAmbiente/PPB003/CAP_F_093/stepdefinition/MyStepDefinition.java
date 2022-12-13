package org.medioAmbiente.PPB003.CAP_F_093.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_093.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF093 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF093 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF093 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF093 - Acceder al Contenido Web$")
    public void Acceder_Al_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Y("^PPB003-CAPF093 - Cambiar numero de entradas$")
    public void Cambiar_Numero_De_Entradas()throws InterruptedException {
        myStep.camiarNroEntradas();
    }
}

