package org.medioAmbiente.PPB003.CAP_F_219.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_219.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF219 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF219 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF219 - Traducir a idioma Ingles")
    public void Traducir_A_Idioma_Ingles() throws InterruptedException {
        myStep.traducirAIngles();
    }

    @Entonces("^PPB003-CAPF219 - Validar traduccion$")
    public void Validar_Traduccion() throws InterruptedException {
        myStep.validarTraduccion();
    }

}

