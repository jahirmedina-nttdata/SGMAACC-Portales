package org.medioAmbiente.PPB007.CAP_F_003.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_003.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF003 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF003 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB007-CAPF003 - Visualizar Header$")
    public void Visualizar_Header()throws InterruptedException {
        myStep.visualizarHeader();
    }

    @Y("^PPB007-CAPF003 - Visualizar Menu navegacion$")
    public void Visualizar_Menu_Navegacion()throws InterruptedException {
        myStep.visualizarMenuNavegacion();
    }

    @Y("^PPB007-CAPF003 - Visualizar Camino migas$")
    public void Visualizar_Camino_Migas()throws InterruptedException {
        myStep.visualizarCaminoMigas();
    }

    @Y("^PPB007-CAPF003 - Visualizar Footer$")
    public void Visualizar_Footer()throws InterruptedException {
        myStep.visualizarFooter();
    }
}

