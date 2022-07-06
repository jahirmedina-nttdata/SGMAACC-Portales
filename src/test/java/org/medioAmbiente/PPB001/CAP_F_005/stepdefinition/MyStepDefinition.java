package org.medioAmbiente.PPB001.CAP_F_005.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import org.medioAmbiente.PPB001.CAP_F_005.step.MyStep;

import net.thucydides.core.annotations.Steps;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^CAPF005 - Cargando el Navegador$")
    public void Cargando_El_Post() {

    }

    @Cuando("^CAPF005 - Se haya cargado la pagina$")
    public void Se_Haya_Cargado_El_Blog() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^CAPF005 - Aceptar las cookies")
    public void Aceptar_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^CAPF005 - Clickar en Twitter$")
    public void Clickar_En_Twitter() throws InterruptedException {
        myStep.clickBtnTwitter();
    }
    @Y("^CAPF005 - Clickar en Facebook$")
    public void Clickar_En_Facebook() throws InterruptedException {
        myStep.clickBtnFacebook();
    }
    @Y("^CAPF005 - Clickar en Instagram$")
    public void Clickar_En_Instagram() throws InterruptedException {
        myStep.clickBtnInstagram();
    }

}

