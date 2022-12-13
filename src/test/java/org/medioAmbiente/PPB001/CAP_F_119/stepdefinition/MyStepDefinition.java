package org.medioAmbiente.PPB001.CAP_F_119.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_119.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF119 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF119 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF119 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF119 - Acceder al Contenido Web$")
    public void Acceder_Al_Contenido_Web()throws InterruptedException {
        myStep.accederContenidoWeb();
    }

    @Y("^PPB001-CAPF119 - Validar listado$")
    public void Validar_Listado()throws InterruptedException {
        myStep.validarListado();
    }
}

