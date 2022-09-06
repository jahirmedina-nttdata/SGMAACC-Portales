package org.medioAmbiente.PPB004.CAP_FN_007.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FN_007.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFN007 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFN007 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }
    @Y("^PPB004-CAPFN007 - Visualizo anuncios$")
    public void Visualizo_Anuncios() throws InterruptedException{
        myStep.visualizarAnuncio();
    }


}

