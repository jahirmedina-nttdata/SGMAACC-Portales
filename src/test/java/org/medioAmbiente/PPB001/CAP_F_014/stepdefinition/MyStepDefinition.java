package org.medioAmbiente.PPB001.CAP_F_014.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_014.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB001-CAPF014 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF014 - Acepto Cookies")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF014 - Buscar Audio por texto$")
    public void Buscar_Audio_Por_Texto() throws InterruptedException, URISyntaxException {
        myStep.buscarAudioPorTexto();
    }
    @Y("^PPB001-CAPF014 - Buscar Audio por tema$")
    public void Buscar_Audio_Por_Tema() throws InterruptedException {

    }

    @Y("^PPB001-CAPF014 - Buscar Audio por fecha$")
    public void Buscar_Audio_Por_Fecha() throws InterruptedException {

    }

    @Y("^PPB001-CAPF014 - Buscar Audio por filtros$")
    public void Buscar_Audio_Por_Filtros() throws InterruptedException {

    }

    @Y("^PPB001-CAPF014 - Buscar Imagenes por texto$")
    public void Buscar_Imagenes_Por_Texto() throws InterruptedException, URISyntaxException {
        myStep.buscarImagenPorTexto();
    }
    @Y("^PPB001-CAPF014 - Buscar Imagenes por tema$")
    public void Buscar_Imagenes_Por_Tema() throws InterruptedException {
        myStep.buscarImagenPorTema();
    }

    @Y("^PPB001-CAPF014 - Buscar Imagenes por fecha$")
    public void Buscar_Imagenes_Por_Fecha() throws InterruptedException {
        myStep.buscarImagenPorFecha();
    }

    @Y("^PPB001-CAPF014 - Buscar Imagenes por filtros$")
    public void Buscar_Imagenes_Por_Filtros() throws InterruptedException {
        myStep.buscarImagenPorFiltros();
    }

    @Y("^PPB001-CAPF014 - Buscar Video por texto$")
    public void Buscar_Video_Por_Texto() throws InterruptedException, URISyntaxException {
        myStep.buscarVideoPorTexto();
    }
    @Y("^PPB001-CAPF014 - Buscar Video por tema$")
    public void Buscar_Video_Por_Tema() throws InterruptedException {
        myStep.buscarVideoPorTema();
    }

    @Y("^PPB001-CAPF014 - Buscar Video por fecha$")
    public void Buscar_Video_Por_Fecha() throws InterruptedException {
        myStep.buscarVideoPorFecha();
    }

    @Y("^PPB001-CAPF014 - Buscar Video por filtros$")
    public void Buscar_Video_Por_Filtros() throws InterruptedException {
        myStep.buscarVideoPorFiltros();
    }
}

