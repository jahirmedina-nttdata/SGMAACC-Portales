package org.medioAmbiente.PPB006.CAP_FN_006.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_006.step.MyStep;

import java.net.URISyntaxException;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN006 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN006 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN006 - Visualizar buscador CAPFC002$")
    public void Visualizar_Buscador_CAPFC002()throws InterruptedException, URISyntaxException {
        myStep.visualizarCAPFC02();
    }

    @Y("^PPB006-CAPFN006 - Visualizar fondo CAPFC003$")
    public void Visualizar_Fondo_CAPFC003()throws InterruptedException {
        myStep.visualizarCAPFC03();
    }

    @Y("^PPB006-CAPFN006 - Visualizar componente CAPFC004$")
    public void Visualizar_Componente_CAPFC004()throws InterruptedException {
        myStep.visualizarCAPFC04();
    }
}

