package org.medioAmbiente.PPB006.CAP_F_112.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_112.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF112 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF112 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF112 - Visualizar camino de migas$")
    public void Visualizar_Camino_De_Migas()throws InterruptedException {
        myStep.visualizarCaminoMiga();
    }


    @Y("^PPB006-CAPF112 - Posicionar puntero$")
    public void Posicionar_Puntero()throws InterruptedException {
        myStep.posicionarPuntero();
    }

    @Y("^PPB006-CAPF112 - Clickar pagina padre$")
    public void Clickar_Pagina_Padre()throws InterruptedException {
        myStep.clickarPadre();
    }

    @Y("^PPB006-CAPF112 - Clickar pagina actual$")
    public void Clickar_Pagina_Actual()throws InterruptedException {
        myStep.clickarActual();
    }


}

