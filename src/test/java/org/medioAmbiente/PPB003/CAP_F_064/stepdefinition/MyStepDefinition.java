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

    @Y("^PPB003-CAPF064 - Visualizar Header CAPF048$")
    public void Visualizar_Header_CAPF048()throws InterruptedException {
        myStep.visualizarCAPF048();
    }

    @Y("^PPB003-CAPF064 - Visualizar Menu CAPF049$")
    public void Visualizar_Menu_CAPF049()throws InterruptedException {
        myStep.visualizarCAPF049();
    }

    @Y("^PPB003-CAPF064 - Visualizar Footer CAPF057$")
    public void Visualizar_Footer_CAPF057()throws InterruptedException {
        myStep.visualizarCAPF057();
    }

}

