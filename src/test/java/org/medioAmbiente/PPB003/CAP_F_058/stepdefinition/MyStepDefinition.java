package org.medioAmbiente.PPB003.CAP_F_058.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB003.CAP_F_058.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB003-CAPF058 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB003-CAPF058 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB003-CAPF058 - Clickar Ventana de visitante$")
    public void Clickar_Ventana_De_Visitante()throws InterruptedException {
        myStep.clickarVentanVisitante();
    }

    @Y("^PPB003-CAPF058 - Clickar icono Twitter$")
    public void Clickar_Icono_Twitter() throws InterruptedException{
        myStep.clickarTwitter();
    }

    @Y("^PPB003-CAPF058 - Clickar icono Facebook$")
    public void Clickar_Icono_Facebook() throws InterruptedException{
        myStep.clickarFacebook();
    }

    @Y("^PPB003-CAPF058 - Clickar icono Instagram$")
    public void Clickar_Icono_Instagram() throws InterruptedException{
        myStep.clickarInstagram();
    }

    @Y("^PPB003-CAPF058 - Clickar icono Pinterest$")
    public void Clickar_Icono_Pinterest() throws InterruptedException{
        myStep.clickarPinterest();
    }

    @Y("^PPB003-CAPF058 - Clickar logo Junta de Andalucia$")
    public void Clickar_Logo_Junta_De_Andalucia() throws InterruptedException{
        myStep.clikarlogoJunta();
    }

    @Y("^PPB003-CAPF058 - Clickar logo Union Europea$")
    public void Clickar_Logo_UnionEuropea() throws InterruptedException{
        myStep.clickarlogoUnion();
    }

    @Y("^PPB003-CAPF058 - Clickar Conocenos$")
    public void Clickar_Conocenos() throws InterruptedException{
        myStep.clickarConocenos();
    }

    @Y("^PPB003-CAPF058 - Clickar Contacto$")
    public void Clickar_Contacto() throws InterruptedException{
        myStep.clickarContacto();
    }

    @Y("^PPB003-CAPF058 - Clickar Enlaces de interes$")
    public void Clickar_Enlaces_De_Interes() throws InterruptedException{
        myStep.clickarEnlacesInteres();
    }

    @Y("^PPB003-CAPF058 - Clickar Mapa web$")
    public void Clickar_Mapa_Web() throws InterruptedException{
        myStep.clickarMapa();
    }

    @Y("^PPB003-CAPF058 - Clickar Manuales$")
    public void Clickar_Manuales() throws InterruptedException{
        myStep.clickarManuales();
    }

    @Y("^PPB003-CAPF058 - Clickar Accesibilidad$")
    public void Clickar_Accesibilidad() throws InterruptedException{
        myStep.clickarAccesibilidad();
    }

    @Y("^PPB003-CAPF058 - Clickar Condiciones de uso$")
    public void Clickar_Condiciones_De_Uso() throws InterruptedException{
        myStep.clickarCondicionesUso();
    }

}

