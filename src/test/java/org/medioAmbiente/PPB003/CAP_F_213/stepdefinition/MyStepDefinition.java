package org.medioAmbiente.PPB003.CAP_F_213.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_213.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF213 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Cuando("^PPB003-CAPF213 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF213 - Compartir en Facebook$")
    public void Compartir_En_Facebook() throws InterruptedException {
        myStep.compartirEnFacebook();
    }

    @Y("^PPB003-CAPF213 - Compartir en Twitter$")
    public void Compartir_En_Twitter() throws InterruptedException {
        myStep.compartirEnTwitter();
    }

    @Y("^PPB003-CAPF213 - Compartir en Pinterest$")
    public void Compartir_En_Pinterest() throws InterruptedException {
        myStep.compartirEnPinterest();
    }


    @Y("^PPB003-CAPF213 - Compartir por Correo$")
    public void Compartir_Por_Correo() throws InterruptedException {
        myStep.compartirPorCorreo();
    }

}

