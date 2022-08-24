package org.medioAmbiente.PPB003.CAP_F_048.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_048.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF048 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF048 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF048 - Clickar header Junta$")
    public void Clickar_Header_Junta()throws InterruptedException {
        myStep.clickarJunta();
    }

    @Y("^PPB003-CAPF048 - Clickar header Ventana visitante$")
    public void Clickar_Header_Ventana_Visitante()throws InterruptedException {
        myStep.clickarVentanaVisitante();
    }
}

