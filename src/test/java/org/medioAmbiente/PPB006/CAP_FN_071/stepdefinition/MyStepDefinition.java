package org.medioAmbiente.PPB006.CAP_FN_071.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FN_071.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFN071 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFN071 - Acepto Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFN071 - Visualizar titulo CAP_FC_004$")
    public void Visualizar_Titulo_CAP_FC_004()throws InterruptedException {
        myStep.visualizarCAPFC004();
    }

    @Y("^PPB006-CAPFN071 - Visualizar contenido CAP_FC_006$")
    public void Visualizar_Contenido_CAP_FC_006()throws InterruptedException {
        myStep.visualizarCAPFC006();
    }

}

