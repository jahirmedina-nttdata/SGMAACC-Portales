package org.medioAmbiente.PPB006.CAP_FC_009.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_009.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC009 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFC009 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFC009 - Visualizar carrusel$")
    public void Visualizar_Carrusel()throws InterruptedException {
        myStep.visualizarCarrusel();
    }
    @Y("^PPB006-CAPFC009 - Acceder contenido$")
    public void Acceder_Contenido()throws InterruptedException {
        myStep.accederContenido();
    }

    @Y("^PPB006-CAPFC009 - Validar Texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.validarTextoflotante();
    }

    @Y("^PPB006-CAPFC009 - Clickar bullet$")
    public void Clickar_Bullet()throws InterruptedException {
        myStep.clickarBullet();
    }

    @Y("^PPB006-CAPFC009 - Deslizar izquierda$")
    public void Deslizar_Izquierda()throws InterruptedException {
        myStep.deslizarIzquierda();
    }

    @Y("^PPB006-CAPFC009 - Deslizar derecha$")
    public void Deslizar_Derecha()throws InterruptedException {
        myStep.deslizarDerecha();
    }



}

