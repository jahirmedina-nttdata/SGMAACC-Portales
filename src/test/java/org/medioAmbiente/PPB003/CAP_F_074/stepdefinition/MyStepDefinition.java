package org.medioAmbiente.PPB003.CAP_F_074.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_074.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF074 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF074 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF074 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF074 - Clickar Planifica tu visita$")
    public void Clickar_Planifica_Tu_Visita()throws InterruptedException {
        myStep.clikarPlanificaVisita();
    }

    @Entonces("^PPB003-CAPF074 - Valido permisos$")
    public void Valido_Permisos()throws InterruptedException {
        myStep.validarPermiso();
    }

    @Y("^PPB003-CAPF074 - Valido lista de visitas$")
    public void Valido_Lista_De_Visitas()throws InterruptedException {
        myStep.validarListado();
    }
}

