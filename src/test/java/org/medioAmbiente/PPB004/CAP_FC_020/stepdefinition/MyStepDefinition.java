package org.medioAmbiente.PPB004.CAP_FC_020.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_020.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC020 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC020 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFC020 - Mostrar numeracion$")
    public void Mostrar_Numeracion()throws InterruptedException {
        myStep.mostrarNumeracion();
    }


    @Y("^PPB004-CAPFC020 - Clickar pagina2$")
    public void Clickar_Pagina() throws InterruptedException {
        myStep.clickarPagina();
    }

    @Y("^PPB004-CAPFC020 - Clickar Adelante$")
    public void Clickar_Adelante() throws InterruptedException{
        myStep.clickarSiguiente();
    }

    @Y("^PPB004-CAPFC020 - Clickar Ultima pagina$")
    public void Clickar_Ultima_Pagina()throws InterruptedException {
        myStep.clickarUltimaPag();
    }

    @Y("^PPB004-CAPFC020 - Clickar Atras$")
    public void Clickar_Atras() throws InterruptedException{
        myStep.clickarAtras();
    }

    @Y("^PPB004-CAPFC020 - Clickar Primera pagina$")
    public void Clickar_Primera_Pagina() throws InterruptedException{
        myStep.clickarPrimeraPg();
    }
}

