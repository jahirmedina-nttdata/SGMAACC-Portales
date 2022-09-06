package org.medioAmbiente.PPB007.CAP_FN_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FN_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFN002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFN002 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFN002 - Autentica usuario$")
    public void Autentica_Usuario()throws InterruptedException {
        myStep.autenticaUsuario();
    }

    @Y("^PPB007-CAPFN002 - Acceder al Canal de Administracion Electronica$")
    public void Acceder_Al_Canal_De_Administracion_Electronica()throws InterruptedException {
        myStep.accederCAE();
    }

    @Y("^PPB007-CAPFN002 - Validar menu vertical$")
    public void Validar_Menu_Vertical()throws InterruptedException {

    }
}

