package org.medioAmbiente.PPB004.CAP_F_054.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_054.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF054 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF054 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPF054 - Mostrar buscador general$")
    public void Mostrar_Buscador_General()throws InterruptedException {
        myStep.buscadorGeneral();
    }

    @Y("^PPB004-CAPF054 - Acceder buscador avanzado$")
    public void Acceder_Buscador_Avanzado()throws InterruptedException, URISyntaxException {
        myStep.buscadorAvanzado();
    }

    @Entonces("^PPB004-CAPF054 - Validar numero de busqueda$")
    public void Validar_Numero_De_Busqueda()throws InterruptedException {
        myStep.validarNumeroDeBusqueda();
    }

}

