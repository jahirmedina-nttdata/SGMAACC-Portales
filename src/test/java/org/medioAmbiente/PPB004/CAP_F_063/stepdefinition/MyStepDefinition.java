package org.medioAmbiente.PPB004.CAP_F_063.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_063.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF063 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF063 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF063 - Visualizar carrusel$")
    public void Visualizar_Carrusel()throws InterruptedException {
        myStep.visualizarCarrusel();
    }

    @Y("^PPB004-CAPF063 - Acceder al contenido$")
    public void Acceder_Al_Contenido() throws InterruptedException{
        myStep.navegarContenido();
    }

    @Y("^PPB004-CAPF063 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException  {
        myStep.validarTextFlotante();
    }


    @Y("^PPB004-CAPF063 - Clickar bullet$")
    public void Clickar_Bullet() throws InterruptedException{
        myStep.clickarBullet();
    }

    @Y("^PPB004-CAPF063 - Deslizar a la izquierda$")
    public void Deslizar_A_La_Izquierda()throws InterruptedException {
        myStep.deslizarIzquierda();
    }

    @Y("^PPB004-CAPF063 - Deslizar a la derecha$")
    public void Deslizar_A_La_Derecha()throws InterruptedException {
        myStep.deslizarDerecha();
    }

    @Y("^PPB004-CAPF063 - Clickar flecha derecha$")
    public void Clickar_Flecha_Derecha() throws InterruptedException {
        myStep.clickarFDerecha();
    }
    @Y("^PPB004-CAPF063 - Clickar flecha izquierda$")
    public void Clickar_Flecha_Izquierda() throws InterruptedException {
        myStep.clickarFIzquierda();
    }
}

