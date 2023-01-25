package org.medioAmbiente.PPB004.CAP_FC_013.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC013 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC013 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFC013 - Mostrar columnas$")
    public void Mostrar_Columnas()throws InterruptedException {
        myStep.mostrarColumnas();
    }


    @Y("^PPB004-CAPFC013 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException  {
        myStep.validarTextFlotante();
    }

    @Y("^PPB004-CAPFC013 - Navegar en contenido$")
    public void Navegar_En_Contenido() throws InterruptedException{
        myStep.navegarContenido();
    }
}

