package org.medioAmbiente.PPB006.CAP_F_003.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_003.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF003 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF003 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF003 - Visualizar cabecera CAPF103$")
    public void Visualizar_Cabecera_CAPF103()throws InterruptedException {
        myStep.visualizarCAPF103();
    }

    @Y("^PPB006-CAPF003 - Visualizar menu CAPF113$")
    public void Visualizar_Menu_CAPF113()throws InterruptedException {
        myStep.visualizarCAPF113();
    }

    @Y("^PPB006-CAPF003 - Visualizar migas CAPF112$")
    public void Visualizar_Migas_CAPF112()throws InterruptedException {
        myStep.visualizarCAPF112();
    }

    @Y("^PPB006-CAPF003 - Visualizar footer CAPF114$")
    public void Visualizar_Footer_CAPF114()throws InterruptedException {
        myStep.visualizarCAPF114();
    }

}

