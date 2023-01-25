package org.medioAmbiente.PPB003.CAP_F_066.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_066.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF066 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF066 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF066 - Visualiza fecha y categoria$")
    public void Visualiza_Fecha_Y_Categoria()throws InterruptedException {
        myStep.visualizaFechaYCategoria();
    }

    @Y("^PPB003-CAPF066 - Visualiza titulo del contenido$")
    public void Visualiza_Titulo_Del_Contenido()throws InterruptedException {
        myStep.visualizaTituloDeContenido();
    }

    @Y("^PPB003-CAPF066 - Visualiza texto de la noticia$")
    public void Visualiza_Texto_De_La_Noticia()throws InterruptedException {
        myStep.visualizaTextoDeNoticia();
    }

    @Y("^PPB003-CAPF066 - Visualiza imagen de la noticia$")
    public void Visualiza_Imagen_De_La_Noticia()throws InterruptedException {
        myStep.visualizaImagenDeNoticia();
    }

    @Y("^PPB003-CAPF066 - Visualiza video de la noticia$")
    public void Visualiza_Video_De_La_Noticia()throws InterruptedException {

    }

    @Y("^PPB003-CAPF066 - Pulsar play en video de noticia$")
    public void Pulsar_Play_En_Video_De_Noticia()throws InterruptedException {

    }

}

