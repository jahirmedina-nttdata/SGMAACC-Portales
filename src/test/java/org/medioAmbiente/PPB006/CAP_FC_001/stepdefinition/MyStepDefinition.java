package org.medioAmbiente.PPB006.CAP_FC_001.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_001.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC001 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB006-CAPFC001 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB006-CAPFC001 - Clickar imagen Junta Andalucia$")
    public void Clickar_Imagen_Junta_Andalucia()throws InterruptedException {
        myStep.clickarImageJunta();
    }

    @Y("^PPB006-CAPFC001 - Validar texto flotante Junta$")
    public void Validar_Texto_Flotante_Junta() throws InterruptedException{
        myStep.validarJuntaFlotante();
    }

    @Y("^PPB006-CAPFC001 - Clickar texto Portal de Caza$")
    public void Clickar_Texto_Portal_De_Caza()throws InterruptedException {
        myStep.clickarTextoPortal();
    }

    @Y("^PPB006-CAPFC001 - Validar texto flotante Portal$")
    public void Validar_Texto_Flotante_Portal() throws InterruptedException{
        myStep.validarPortalFlotante();
    }
}

