package org.medioAmbiente.PPB007.CAP_F_046.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_046.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF046 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF046 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF046 - Visualizar camino migas$")
    public void Visualizar_Camino_Migas()throws InterruptedException {
        myStep.visualizarCaminoMigas();
    }

    @Y("^PPB007-CAPF046 - Posicionar puntero$")
    public void Posicionar_Puntero()throws InterruptedException {
        myStep.posicionarPuntero();
    }

    @Y("^PPB007-CAPF046 - Clickar elemento padre$")
    public void Clickar_Elemento_Padre()throws InterruptedException {
        myStep.clickarElementoPadre();
    }

    @Y("^PPB007-CAPF046 - Clickar miga actual$")
    public void Clickar_Miga_Actual()throws InterruptedException {
        myStep.clickarMigaActual();
    }

}

