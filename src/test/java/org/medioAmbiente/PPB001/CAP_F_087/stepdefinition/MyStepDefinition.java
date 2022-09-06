package org.medioAmbiente.PPB001.CAP_F_087.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB001.CAP_F_087.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB001-CAPF087 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB001-CAPF087 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB001-CAPF087 - Seleccionar ficha ANDALUCIA TIERRA DE ACOGIDA DE QUEBRANTAHUESOS")
    public void Seleccionar_Ficha_ANDALUCIA_TIERRA_DE_ACOGIDA_DE_QUEBRANTAHUESOS() throws InterruptedException {
        myStep.seleccionarFicha();
    }

    @Entonces("^PPB001-CAPF087 - Validar Noticia$")
    public void Validar_Noticia() throws InterruptedException {
        myStep.validarNoticia();
    }

}

