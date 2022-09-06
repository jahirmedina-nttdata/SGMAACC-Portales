package org.medioAmbiente.PPB003.CAP_F_080.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_080.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF080 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF080 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF080 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF080 - Clickar ficha Planifica tu Visita$")
    public void Clickar_Ficha_Planifica_Tu_Visita()throws InterruptedException {
        myStep.clickarFicha();
    }

    @Y("^PPB003-CAPF080 - Visualizar acceso a ficha$")
    public void Visualizar_Acceso_A_ficha() throws InterruptedException{

    }
}

