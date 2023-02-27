package org.medioAmbiente.PPB006.CAP_F_107.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_F_107.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPF107 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPF107 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPF107 - Visualizar Noticia$")
    public void Visualizar_Noticia()throws InterruptedException {
        myStep.visualizarNoticia();
    }
    @Y("^PPB006-CAPF107 - Acceder noticia$")
    public void Acceder_Noticia()throws InterruptedException {
        myStep.accederNoticia();
    }

    @Y("^PPB006-CAPF107 - Validar Texto flotante$")
    public void Validar_Texto_Flotante()throws InterruptedException {
        myStep.validarTextoflotante();
    }



}

