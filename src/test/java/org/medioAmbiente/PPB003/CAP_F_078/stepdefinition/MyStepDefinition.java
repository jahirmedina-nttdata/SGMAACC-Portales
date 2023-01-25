package org.medioAmbiente.PPB003.CAP_F_078.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_078.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF078 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF078 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF078 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF078 - Clickar eliminar visita$")
    public void Clickar_Eliminar_Visita()throws InterruptedException {
        myStep.clikarEliminarVisita();
    }

    @Y("^PPB003-CAPF078 - Clickar cancelar eliminacion$")
    public void Clickar_Cancelar_Eliminacion() throws InterruptedException{
        myStep.clickarCancelar();
    }

    @Y("^PPB003-CAPF078 - Clickar aceptar eliminacion$")
    public void Clickar_Aceptar_Eliminacion()throws InterruptedException {
        myStep.clickarAceptar();
    }

}

