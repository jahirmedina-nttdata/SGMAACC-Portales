package org.medioAmbiente.PPB004.CAP_F_057.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_057.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF057 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF057 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF057 - Mostrar carrusel anuncio$")
    public void Mostrar_Carrusel_Anuncio()throws InterruptedException {
        myStep.mostrarCarrusel();
    }

    @Y("^PPB004-CAPF057 - Clickar en bullets$")
    public void Clickar_En_Bullets()throws InterruptedException {
        myStep.clickarBullets();
    }
    @Y("^PPB004-CAPF057 - Puntear card$")
    public void Puntear_Card()throws InterruptedException {
        myStep.puntearCard();
    }
    @Y("^PPB004-CAPF057 - Mover a la izquierda$")
    public void Mover_A_La_Izquierda()throws InterruptedException {
        myStep.moverIzquierda();
    }
    @Y("^PPB004-CAPF057 - Mover a la derecha$")
    public void Mover_A_La_Derecha()throws InterruptedException {
        myStep.moverDerecha();
    }


    @Y("^PPB004-CAPF057 - Clickar titulo anuncio$")
    public void Clickar_Titulo_Anuncio() throws InterruptedException{
        myStep.clickarAnuncio();
    }

    @Y("^PPB004-CAPF057 - Puntear Ver Todo$")
    public void Puntear_Ver_Todo() throws InterruptedException {
        myStep.puntearVertodo();
    }

    @Y("^PPB004-CAPF057 - Clickar Ver Todo$")
    public void Clickar_Ver_Todo()throws InterruptedException {
        myStep.clickarVertodo();
    }


}

