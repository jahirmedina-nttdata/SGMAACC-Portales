package org.medioAmbiente.PPB003.CAP_F_077.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_077.step.MyStep;
import org.openqa.selenium.NoAlertPresentException;

import java.awt.*;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF077 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF077 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF077 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF077 - Clickar eliminar visita$")
    public void Clickar_Eliminar_Visita()throws InterruptedException {
        myStep.clikarEliminarVisita();
    }

    @Y("^PPB003-CAPF077 - Clickar cancelar eliminacion$")
    public void Clickar_Cancelar_Eliminacion() throws InterruptedException{
        myStep.clickarCancelar();
    }

    @Y("^PPB003-CAPF077 - Clickar aceptar eliminacion$")
    public void Clickar_Aceptar_Eliminacion()throws InterruptedException {
        myStep.clickarAceptar();
    }

    @Entonces("^PPB003-CAPF077 - Validar visita eliminada$")
    public void Validar_Visita_Eliminada()throws InterruptedException {
        myStep.validarEliminacion();
    }
}

