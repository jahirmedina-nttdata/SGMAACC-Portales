package org.medioAmbiente.PPB003.CAP_F_087.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_087.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF087 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF087 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF087 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF087 - Seleccionar idioma$")
    public void Seleccionar_Idioma()throws InterruptedException {
        myStep.seleccionarIdioma();
    }

    @Y("^PPB003-CAPF087 - Clickar ficha añadida$")
    public void Clickar_Ficha_Añadida()throws InterruptedException {
        myStep.clickarFicha();
    }

    @Entonces("^PPB003-CAPF087 - Validar Traduccion$")
    public void Validar_Traduccion()throws InterruptedException {
        myStep.validarTraduccion();
    }

}

