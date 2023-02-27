package org.medioAmbiente.PPB006.CAP_F_110.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_110.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF110 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF110 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF110 - Visualizar diseño$")
    public void Visualizar_Diseño()throws InterruptedException {
        myStep.visualizarDiseño();
    }

    @Y("^PPB006-CAPF110 - Validar Texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.validarTextoflotante();
    }
    @Y("^PPB006-CAPF110 - Acceder contenido$")
    public void Acceder_Contenido()throws InterruptedException {
        myStep.accederContenido();
    }


}

