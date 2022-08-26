package org.medioAmbiente.PPB003.CAP_F_081.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_081.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF081 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF081 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF081 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticoUsuario();
    }

    @Y("^PPB003-CAPF081 - Cambiar Idioma$")
    public void Cambiar_Idioma()throws InterruptedException {
        myStep.cambiarIdioma();
    }

    @Entonces("^PPB003-CAPF081 - Validar traduccion$")
    public void Validar_Traduccion()throws InterruptedException {
        myStep.validarTraduccion();
    }

    @Y("^PPB003-CAPF081 - Seleccionar tarjeta visita$")
    public void Seleccionar_Tarjeta_Visita()throws InterruptedException {
    }
}

