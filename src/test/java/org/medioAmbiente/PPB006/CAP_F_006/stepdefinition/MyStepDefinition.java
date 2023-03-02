package org.medioAmbiente.PPB006.CAP_F_006.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_006.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF006 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF006 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF006 - Visualizar buscador CAPF104$")
    public void Visualizar_Buscador_CAPF104()throws InterruptedException, URISyntaxException {
        myStep.visualizarCAPF104();
    }

    @Y("^PPB006-CAPF006 - Visualizar fondo CAPF105$")
    public void Visualizar_Fondo_CAPF105()throws InterruptedException {
        myStep.visualizarCAPF105();
    }

    @Y("^PPB006-CAPF006 - Visualizar componente basico CAPF106$")
    public void Visualizar_Componente_Basico_CAPF106()throws InterruptedException {
        myStep.visualizarCAPF106();
    }
}

