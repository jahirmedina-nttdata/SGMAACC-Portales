package org.medioAmbiente.PPB006.CAP_FC_013.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC013 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFC013 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFC013 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB006-CAPFC013 - Mostrar animacion$")
    public void Mostrar_Animacion()throws InterruptedException {
        myStep.mostrarAnimacion();
    }


    @Y("^PPB006-CAPFC013 - Acceder contenido$")
    public void Acceder_Contenido()throws InterruptedException {
        myStep.accederContenido();
    }

    @Y("^PPB006-CAPFC013 - Validar Texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.validarFlotante();
    }


}

