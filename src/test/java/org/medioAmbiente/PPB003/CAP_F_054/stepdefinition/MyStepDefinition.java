package org.medioAmbiente.PPB003.CAP_F_054.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_054.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF054 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF054 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF054 - Visualizar sugerencia del mes$")
    public void Visualizar_Sugerencia_Del_Mes()throws InterruptedException {
        myStep.visualizarSugerencia();
    }

    @Y("^PPB003-CAPF054 - Clickar Ver Mas$")
    public void Clickar_Ver_Mas()throws InterruptedException {
        myStep.clickarVerMas();
    }

}

