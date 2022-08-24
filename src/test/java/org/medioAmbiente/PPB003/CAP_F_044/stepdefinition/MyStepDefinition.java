package org.medioAmbiente.PPB003.CAP_F_044.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_044.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF044 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF044 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF044 - Visualizar el tiempo$")
    public void Visualizar_El_Tiempo()throws InterruptedException {
        myStep.visualizarTiempo();
    }

    @Y("^PPB003-CAPF044 - Clickar ampliar informacion$")
    public void Clickar_Ampliar_Informacion()throws InterruptedException {
        myStep.clickarAmpliarInformacion();
    }
}

