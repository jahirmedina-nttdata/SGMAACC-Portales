package org.medioAmbiente.PPB007.CAP_FN_005.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FN_005.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFN005 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFN005 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB007-CAPFN005 - Visualizar Titulo ULTIMOS DIAS PARA$")
    public void Visualizar_Titulo_ULTIMOS_DIAS_PARA()throws InterruptedException {
        myStep.visualizarTituloUltimosDiasPara();
    }

    @Y("^PPB007-CAPFN005 - Visualizar contenido$")
    public void Visualizar_Contenido()throws InterruptedException {

    }
}

