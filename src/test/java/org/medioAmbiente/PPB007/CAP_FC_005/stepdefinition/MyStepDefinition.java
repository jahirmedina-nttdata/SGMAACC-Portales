package org.medioAmbiente.PPB007.CAP_FC_005.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_005.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC005 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC005 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFC005 - Visualizar elementos$")
    public void Visualizar_Elementos()throws InterruptedException {
        myStep.visualizarElementos();
    }

    @Y("^PPB007-CAPFC005 - Posicionar puntero en elemento$")
    public void Posicionar_Puntero_En_Elemento()throws InterruptedException {
        myStep.posicionarPunteroEnElemento();
    }

    @Y("^PPB007-CAPFC005 - Clickar enlace$")
    public void Clickar_Enlace()throws InterruptedException {
        myStep.clickarEnlace();
    }

    @Y("^PPB007-CAPFC005 - Mostrar texto flotante$")
    public void Mostrar_Texto_Flotante()throws InterruptedException {
        myStep.mostrarTextoFlotante();
    }

    @Y("^PPB007-CAPFC005 - Posicionar puntero en boton Carpeta Ciudadana$")
    public void Posicionar_Puntero_En_Boton_Carpeta_Ciudadana()throws InterruptedException {
        myStep.posicionarPunteroEnBotonCarpetaCiudadana();
    }

    @Y("^PPB007-CAPFC005 - Clickar boton Carpeta Ciudadana$")
    public void Clickar_Boton_Carpeta_Ciudadana()throws InterruptedException {
        myStep.clickarBotonCarpetaCiudadana();
    }
}

