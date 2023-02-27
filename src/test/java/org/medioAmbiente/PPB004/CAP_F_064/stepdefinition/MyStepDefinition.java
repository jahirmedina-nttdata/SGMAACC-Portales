package org.medioAmbiente.PPB004.CAP_F_064.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_064.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF064 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF064 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPF064 - Mostrar contenido$")
    public void Mostrar_Contenido()throws InterruptedException {
        myStep.mostrarContenido();
    }

    @Y("^PPB004-CAPF064 - Acceder al contenido$")
    public void Acceder_Al_Contenido() throws InterruptedException{
        myStep.navegarContenido();
    }

    @Y("^PPB004-CAPF064 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException  {
        myStep.validarTextFlotante();
    }


}

