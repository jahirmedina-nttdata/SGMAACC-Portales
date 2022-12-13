package org.medioAmbiente.PPB001.CAP_F_118.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
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

    @Y("^PPB001-CAPF118 - Acceder al Preview Contenidos Web$")
    public void Acceder_Al_Preview_Contenidos_Web()throws InterruptedException {
        myStep.accederPreviewContenidosWeb();
    }

    @Y("^PPB001-CAPF118 - Previsualizar contenido sin seleccionar sitio$")
    public void Previsualizar_Contenido_Sin_Seleccionar_Sitio()throws InterruptedException {
        myStep.previsualizarSinSitio();
    }

    @Y("^PPB001-CAPF118 - Previsualizar contenido$")
    public void Previsualizar_Contenido()throws InterruptedException {
        myStep.previsualizarContenido();
    }

}

