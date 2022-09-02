package org.medioAmbiente.PPB001.CAP_F_113.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_113.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF113 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB001-CAPF113 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF113 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB001-CAPF113 - Clickar boton lupa$")
    public void Clickar_Boton_Lupa()throws InterruptedException {
        myStep.clickarLupa();
    }

    @Y("^PPB001-CAPF113 - Escribir Borrador en el cuadro de texto estado$")
    public void Escribir_Borrador_En_El_Cuadro_De_Texto_Estado()throws InterruptedException {
    }

    @Y("^PPB001-CAPF113 - Clickar search$")
    public void Clickar_Search()throws InterruptedException {

    }
}

