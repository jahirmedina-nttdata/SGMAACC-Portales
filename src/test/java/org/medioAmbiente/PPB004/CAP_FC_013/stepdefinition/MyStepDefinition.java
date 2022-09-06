package org.medioAmbiente.PPB004.CAP_FC_013.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_FC_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPFC013 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPFC013 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB004-CAPFC013 - Mostrar menu$")
    public void Mostrar_Menu()throws InterruptedException {
        myStep.mostrarMenu();
    }


    @Y("^PPB004-CAPFC013 - Posicionar puntero$")
    public void Posicionar_Puntero()throws InterruptedException  {
        myStep.posicionarPuntero();
    }

    @Y("^PPB004-CAPFC013 - Acceder a pagina$")
    public void Acceder_A_Pagina() throws InterruptedException{
        myStep.accederPag();
    }
}

