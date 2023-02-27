package org.medioAmbiente.PPB007.CAP_F_039.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_039.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF039 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF039 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF039 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {
        myStep.visualizarContenido();
    }

    @Y("^PPB007-CAPF039 - Posicionar puntero en Tarjtea$")
    public void Posicionar_Puntero_En_Tarjtea()throws InterruptedException {
        myStep.posicionarPunteroEnTarjeta();
    }

    @Y("^PPB007-CAPF039 - Clickar Tarjeta$")
    public void Clickar_Tarjeta()throws InterruptedException {
        myStep.clickarTarjeta();
    }

    @Y("^PPB007-CAPF039 - Mostrar texto flotante$")
    public void Mostrar_Texto_Flotante()throws InterruptedException {
        myStep.mostrarTextoFlotante();
    }

    @Y("^PPB007-CAPF039 - Clickar Ver mas$")
    public void Clickar_Ver_Mas()throws InterruptedException {
        myStep.clickarVerMas();
    }
}

