package org.medioAmbiente.PPB006.CAP_F_111.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_111.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF111 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF111 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF111 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }
    @Y("^PPB006-CAPF111 - Acceder enlace$")
    public void Acceder_Enlace()throws InterruptedException {
        myStep.accederEnlace();
    }

    @Y("^PPB006-CAPF111 - Posicionar puntero$")
    public void Posicionar_Puntero()throws InterruptedException {
        myStep.posicionarPuntero();
    }

}
