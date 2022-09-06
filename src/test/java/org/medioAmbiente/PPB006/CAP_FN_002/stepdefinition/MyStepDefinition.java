package org.medioAmbiente.PPB006.CAP_FN_002.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_002.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN002 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN002 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN002 - Autentica usuario$")
    public void Autentica_Usuario()throws InterruptedException {
        myStep.autenticaUsuario();
    }

    @Y("^PPB006-CAPFN002 - Validar usuario autenticado$")
    public void Validar_Usuario_Autenticado() throws InterruptedException{
        myStep.validarUsuario();
    }
}

