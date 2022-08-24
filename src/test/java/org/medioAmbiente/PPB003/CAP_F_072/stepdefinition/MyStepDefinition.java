package org.medioAmbiente.PPB003.CAP_F_072.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_072.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF072 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF072 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF072 - Acceder usuario$")
    public void Acceder_Usuario()throws InterruptedException {
        myStep.accederUsuario();
    }

    @Y("^PPB003-CAPF072 - Seleccionar idioma$")
    public void Seleccionar_Idioma()throws InterruptedException {
        myStep.seleccionarIdioma();
    }

    @Y("^PPB003-CAPF072 - Validar idioma$")
    public void Validar_Idioma()throws InterruptedException {
        myStep.validarIdioma();
    }
}

