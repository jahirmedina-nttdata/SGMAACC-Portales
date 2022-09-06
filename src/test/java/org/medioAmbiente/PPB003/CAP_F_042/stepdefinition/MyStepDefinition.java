package org.medioAmbiente.PPB003.CAP_F_042.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_042.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF042 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF042 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF042 - Buscar por texto$")
    public void Buscar_Por_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB003-CAPF042 - Acceder ficha el Pinsapar$")
    public void Acceder_Ficha_El_Pinsapar() throws InterruptedException{
        myStep.accederFicha();
    }

    @Y("^PPB003-CAPF042 - Visualizar ficha el Pinsapar$")
    public void Visualizar_Ficha_El_Pinsapar()throws InterruptedException {
        myStep.visualizarFicha();
    }

}

