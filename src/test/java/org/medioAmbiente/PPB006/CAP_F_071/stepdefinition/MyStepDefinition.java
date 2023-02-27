package org.medioAmbiente.PPB006.CAP_F_071.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_071.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF071 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF071 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF071 - Visualizar titulo CAP_F_106$")
    public void Visualizar_Titulo_CAP_F_106()throws InterruptedException {
        myStep.visualizarCAPF106();
    }

    @Y("^PPB006-CAPF071 - Visualizar contenido CAP_F_108$")
    public void Visualizar_Contenido_CAP_F_108()throws InterruptedException {
        myStep.visualizarCAPF108();
    }

}

