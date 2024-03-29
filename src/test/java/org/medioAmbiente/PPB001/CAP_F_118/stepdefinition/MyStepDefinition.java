package org.medioAmbiente.PPB001.CAP_F_118.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_118.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF118 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF118 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF118 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF118 - Elegir contenido$")
    public void Elegir_Contenido()throws InterruptedException {
        myStep.elegirContenido();
    }

    @Y("^PPB001-CAPF118 - Previsualizar contenido$")
    public void Previsualizar_Contenido()throws InterruptedException {
    }

    @Y("^PPB001-CAPF118 - Clickar Previsualizar$")
    public void Clickar_Previsualizar()throws InterruptedException {
    }

}

