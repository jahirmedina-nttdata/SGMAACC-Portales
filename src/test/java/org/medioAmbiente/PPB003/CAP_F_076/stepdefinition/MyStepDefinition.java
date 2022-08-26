package org.medioAmbiente.PPB003.CAP_F_076.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_076.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF076 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF076 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF076 - Autentico usuario$")
    public void Autentico_Usuario()throws InterruptedException {
        myStep.autenticarUsuario();
    }

    @Y("^PPB003-CAPF076 - Clickar editar visita$")
    public void Clickar_Editar_Visita()throws InterruptedException {
        myStep.clikarEditarVisita();
    }

    @Y("^PPB003-CAPF076 - Modificar visita$")
    public void Modificar_Visita()throws InterruptedException {
        myStep.modificarVisita();
    }

    @Entonces("^PPB003-CAPF076 - Validar visita modificada$")
    public void Validar_Visita_Modificada()throws InterruptedException {
        myStep.validarModificacion();
    }
}

