package org.medioAmbiente.PPB003.CAP_F_057.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_057.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;

    @Dado("^PPB003-CAPF057 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }


    @Y("^PPB003-CAPF057 - Aceptar Cookies$")
    public void Aceptar_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF057 - Visualizar apartado Redes Sociales$")
    public void Visualizar_Apartado_Redes_Sociales()throws InterruptedException {
        myStep.visualizarRedesSociales();
    }

    @Y("^PPB003-CAPF057 - Clickar Seguir en Ventana Visitante de Twitter$")
    public void Clickar_Seguir_En_Ventana_Visitante_De_Twitter()throws InterruptedException {
        myStep.clickarSeguirVentanaVisitanteTwitter();
    }

    @Y("^PPB003-CAPF057 - Clickar Seguir pagina en Ventana Visitante de Facebook$")
    public void Clickar_Seguir_Pagina_En_Ventana_Visitante_De_Facebook()throws InterruptedException {
        myStep.clickarSeguirVentanaVisitanteFacebook();
    }

    @Y("^PPB003-CAPF057 - Clickar Seguir en Infoca de Twitter$")
    public void Clickar_Seguir_En_Infoca_De_Twitter()throws InterruptedException {
        myStep.clickarSeguirInfocaTwitter();
    }

}

