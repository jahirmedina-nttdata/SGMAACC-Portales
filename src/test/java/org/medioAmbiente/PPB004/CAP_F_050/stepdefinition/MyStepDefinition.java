package org.medioAmbiente.PPB004.CAP_F_050.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_050.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF050 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF050 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPF050 - Clickar en Junta de Andalucia$")
    public void Clickar_En_Junta_De_Andalucia()throws InterruptedException {
        myStep.clickarLogoJunta();
    }

    @Y("^PPB004-CAPF050 - Clickar en Portal de la Caza y Pesca$")
    public void Clickar_En_Portal_De_La_Caza_Y_Pesca()throws InterruptedException {
        myStep.clickarLogoCasaPesca();
    }

    @Y("^PPB004-CAPF050 - Validar texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.visualizarTextFlotante();
    }
}

