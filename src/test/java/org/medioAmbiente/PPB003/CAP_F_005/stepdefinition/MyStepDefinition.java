package org.medioAmbiente.PPB003.CAP_F_005.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_005.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF005 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF005 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF005 - Buscar por texto$")
    public void Buscar_Por_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB003-CAPF005 - Acceder ficha$")
    public void Acceder_Ficha() throws InterruptedException{
        myStep.accederFicha();
    }

    @Y("^PPB003-CAPF005 - Visualizar ficha$")
    public void Visualizar_Ficha()throws InterruptedException {
        myStep.visualizarFicha();
    }

}

