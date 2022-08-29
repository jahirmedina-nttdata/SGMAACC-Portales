package org.medioAmbiente.PPB007.CAP_FC_016.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_FC_016.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPFC016 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPFC016 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPFC016 - Clickar Portal Ambiental$")
    public void Clickar_Portal_Ambiental() throws InterruptedException{
        myStep.clickarportalAmbiental();
    }

    @Y("^PPB007-CAPFC016 - Clickar Portal Caza y Pesca$")
    public void Clickar_Portal_Caza_Y_Pesca()throws InterruptedException {
        myStep.clickarPortalCaza();
    }

    @Y("^PPB007-CAPFC016 - Clickar Portal Cambio Climatico$")
    public void Clickar_Portal_Cambio_Climatico()throws InterruptedException {
        myStep.clickarCambioClimatico();
    }

    @Y("^PPB007-CAPFC016 - Clickar Ventana de visitante$")
    public void Clickar_Ventana_De_Visitante()throws InterruptedException {
        myStep.clickarVentanVisitante();
    }

    @Y("^PPB007-CAPFC016 - Clickar Atencion a la ciudadania$")
    public void Clickar_Atencion_A_La_Ciudadania()throws InterruptedException {
        myStep.clickarAtencionCiudadania();
    }

    @Y("^PPB007-CAPFC016 - Clickar Tramites de medio ambiente$")
    public void Clickar_Tramites_De_Medio_Ambiente()throws InterruptedException {
        myStep.clickarTramites();
    }

    @Y("^PPB007-CAPFC016 - Clickar Herramienta centralizada$")
    public void Clickar_Herramienta_Centralizada()throws InterruptedException {
        myStep. clickarHerramientas();
    }

    @Y("^PPB007-CAPFC016 - Clickar Carpeta ciudadana$")
    public void Clickar_Carpeta_Ciudadana()throws InterruptedException {
        myStep. clickarCarpetaCiudadana();
    }

    @Y("^PPB007-CAPFC016 - Clickar icono Twitter$")
    public void Clickar_Icono_Twitter() throws InterruptedException{
        myStep.clickarTwitter();
    }

    @Y("^PPB007-CAPFC016 - Clickar icono Facebook$")
    public void Clickar_Icono_Facebook() throws InterruptedException{
        myStep.clickarFacebook();
    }

    @Y("^PPB007-CAPFC016 - Clickar icono Instagram$")
    public void Clickar_Icono_Instagram() throws InterruptedException{
        myStep.clickarInstagram();
    }

    @Y("^PPB007-CAPFC016 - Clickar logo Junta de Andalucia$")
    public void Clickar_Logo_Junta_De_Andalucia() throws InterruptedException{
        myStep.clikarlogoJunta();
    }

    @Y("^PPB007-CAPFC016 - Clickar logo Union Europea$")
    public void Clickar_Logo_UnionEuropea() throws InterruptedException{
        myStep.clickarlogoUnion();
    }

    @Y("^PPB007-CAPFC016 - Clickar Mapa web$")
    public void Clickar_Mapa_Web() throws InterruptedException{
        myStep.clickarMapa();
    }

    @Y("^PPB007-CAPFC016 - Clickar Accesibilidad$")
    public void Clickar_Accesibilidad() throws InterruptedException{
        myStep.clickarAccesibilidad();
    }

    @Y("^PPB007-CAPFC016 - Clickar Proteccion de Datos$")
    public void Clickar_Proteccion_De_Datos() throws InterruptedException{
        myStep.clickarProteccionDatos();
    }

    @Y("^PPB007-CAPFC016 - Clickar Condiciones de uso$")
    public void Clickar_Condiciones_De_Uso() throws InterruptedException{
        myStep.clickarCondicionesUso();
    }

}

