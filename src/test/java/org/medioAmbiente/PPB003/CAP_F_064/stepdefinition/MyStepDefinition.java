package org.medioAmbiente.PPB003.CAP_F_064.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_064.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF064 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF064 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF064 - Visualizar lista de videos$")
    public void Visualizar_Lista_De_Videos()throws InterruptedException {
        myStep.visualizarVideos();
    }

    @Y("^PPB003-CAPF064 - Clickar elemento$")
    public void Clickar_Elemento()throws InterruptedException {
        myStep.clickarElemento();
    }

}

