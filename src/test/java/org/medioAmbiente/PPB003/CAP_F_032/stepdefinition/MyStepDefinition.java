package org.medioAmbiente.PPB003.CAP_F_032.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_032.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF032 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF032 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF032 - Clickar pausar$")
    public void Clickar_Pausar()throws InterruptedException {
        myStep.clickarPausar();
    }

    @Y("^PPB003-CAPF032 - Clickar reanudar$")
    public void Clickar_Reanudar()throws InterruptedException {
        myStep.clickarReanudar();
    }

    @Y("^PPB003-CAPF032 - Clickar anterior$")
    public void Clickar_Anterior()throws InterruptedException {
        myStep.clickarAnterior();
    }

    @Y("^PPB003-CAPF032 - Mover a la derecha$")
    public void Mover_A_La_Derecha()throws InterruptedException {
        myStep.moverDerecha();
    }

    @Y("^PPB003-CAPF032 - Clickar siguiente$")
    public void Clickar_Siguiente()throws InterruptedException {
        myStep.clickarSiguiente();
    }

    @Y("^PPB003-CAPF032 - Mover a la izquierda$")
    public void Mover_A_La_Izquierda()throws InterruptedException {
        myStep.moverIzquierda();
    }

    @Y("^PPB003-CAPF032 - Clickar primera pagina$")
    public void Clickar_Primera_Pagina()throws InterruptedException {
        myStep.clickarPrimerapag();
    }

    @Y("^PPB003-CAPF032 - Clickar ultima pagina$")
    public void Clickar_Ultima_Pagina()throws InterruptedException {
        myStep.clickarUltimapag();
    }

}

