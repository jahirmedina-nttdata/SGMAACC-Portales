package org.medioAmbiente.PPB006.CAP_FC_007.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_007.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC007 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFC007 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFC007 - Clickar en el componente destacado$")
    public void Clickar_En_El_Componente_Destacado()throws InterruptedException {
        myStep.clickarComponenteDestacado();
    }

    @Y("^PPB006-CAPFC007 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB006-CAPFC007 - Mostrar apartado$")
    public void Mostrar_Apartado()throws InterruptedException {
        myStep.mostrarApartado();
    }

    @Y("^PPB006-CAPFC007 - Ocultar apartado$")
    public void Ocultar_Apartado()throws InterruptedException {
        myStep.ocultarApartado();
    }

    @Y("^PPB006-CAPFC007 - Descargar archivo$")
    public void Descargar_Archivo()throws InterruptedException {
        myStep.descargarArchivo();
    }

    @Y("^PPB006-CAPFC007 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

}

