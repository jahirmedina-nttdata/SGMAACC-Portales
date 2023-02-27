package org.medioAmbiente.PPB006.CAP_F_115.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_115.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF115 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF115 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF115 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB006-CAPF115 - Mostrar animacion$")
    public void Mostrar_Animacion()throws InterruptedException {
        myStep.mostrarAnimacion();
    }


    @Y("^PPB006-CAPF115 - Acceder contenido$")
    public void Acceder_Contenido()throws InterruptedException {
        myStep.accederContenido();
    }

    @Y("^PPB006-CAPF115 - Validar Texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.validarFlotante();
    }


}

