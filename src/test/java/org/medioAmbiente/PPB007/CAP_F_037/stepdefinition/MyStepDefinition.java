package org.medioAmbiente.PPB007.CAP_F_037.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_037.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF037 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF037 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB007-CAPF037 - Clickar en Junta de Andalucia$")
    public void Clickar_En_Junta_De_Andalucia()throws InterruptedException {
        myStep.clickarLogoJunta();
    }

    @Y("^PPB007-CAPF037 - Clickar en Canal de Administración Electrónica$")
    public void Clickar_En_Canal_De_Administración_Electrónica()throws InterruptedException {
        myStep.clickarLogoCAE();
    }

    @Y("^PPB007-CAPF037 - Validar texto flotante de Junta de Andalucia$")
    public void Validar_Texto_Flotante_De_Junta_De_Andalucia()throws InterruptedException {
        myStep.validarTextFlotante();
    }
}

