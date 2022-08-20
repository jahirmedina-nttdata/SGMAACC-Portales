package org.medioAmbiente.PPB003.CAP_F_031.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_031.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF031 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF031 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF031 - Buscar por texto$")
    public void Buscar_Por_Texto()throws InterruptedException {
        myStep.buscarPorTexto();
    }

    @Y("^PPB003-CAPF031 - Acceder ficha equipamiento$")
    public void Acceder_Ficha_Equipamiento() throws InterruptedException{
        myStep.accederFichaEquipamiento();
    }

    @Y("^PPB003-CAPF031 - Visualizar ficha equipamiento$")
    public void Visualizar_Ficha_Equipamiento()throws InterruptedException {
        myStep.visualizarFicha();
    }

}

