package org.medioAmbiente.PPB003.CAP_F_007.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_007.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF007 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF007 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF007 - Compartir en Facebook$")
    public void Compartir_En_Facebook()throws InterruptedException {
        myStep.compartirFacebook();
    }

    @Y("^PPB003-CAPF007 - Compartir en Twitter$")
    public void Compartir_En_Twitter() throws InterruptedException{
        myStep.compartirTwitter();
    }

    @Y("^PPB003-CAPF007 - Compartir en Pinterest$")
    public void Compartir_En_Pinterest() throws InterruptedException{
        myStep.compartirPinterest();
    }

    @Y("^PPB003-CAPF007 - Compartir en WhatsApp$")
    public void Compartir_En_WhatsApp() throws InterruptedException{

    }

    @Y("^PPB003-CAPF007 - Compartir por Correo$")
    public void Compartir_Por_Correo() throws InterruptedException{
        myStep.compartirCorreo();
    }


}

