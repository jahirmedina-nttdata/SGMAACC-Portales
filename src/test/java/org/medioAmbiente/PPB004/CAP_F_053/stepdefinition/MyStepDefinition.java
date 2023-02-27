package org.medioAmbiente.PPB004.CAP_F_053.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB004.CAP_F_053.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB004-CAPF053 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB004-CAPF053 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB004-CAPF053 - Clickar Portal Ambiental$")
    public void Clickar_Portal_Ambiental() throws InterruptedException{
        myStep.clickarportalAmbiental();
    }

    @Y("^PPB004-CAPF053 - Clickar Portal Andaluz$")
    public void Clickar_Portal_Andaluz()throws InterruptedException {
        myStep.clickarportalAndaluz();
    }

    @Y("^PPB004-CAPF053 - Clickar Ventana de visitante$")
    public void Clickar_Ventana_De_Visitante()throws InterruptedException {
        myStep.clickarVentanVisitante();
    }

    @Y("^PPB004-CAPF053 - Clickar Canal de Administracion$")
    public void Clickar_Canal_De_Administracion()throws InterruptedException {
        myStep. clickarCanalAdministracion();
    }

    @Y("^PPB004-CAPF053 - Clickar Periodos habiles$")
    public void Clickar_Periodos_Habiles() throws InterruptedException{
        myStep.clickarPeriodosHabiles();
    }

    @Y("^PPB004-CAPF053 - Clickar Buzon ciudadano$")
    public void Clickar_Buzon_Ciudadano() throws InterruptedException{
        myStep.clickarBuzon();
    }

    @Y("^PPB004-CAPF053 - Clickar icono Twitter$")
    public void Clickar_Icono_Twitter() throws InterruptedException{
        myStep.clickarTwitter();
    }

    @Y("^PPB004-CAPF053 - Clickar icono Facebook$")
    public void Clickar_Icono_Facebook() throws InterruptedException{
        myStep.clickarFacebook();
    }

    @Y("^PPB004-CAPF053 - Clickar icono Instagram$")
    public void Clickar_Icono_Instagram() throws InterruptedException{
        myStep.clickarInstagram();
    }

    @Y("^PPB004-CAPF053 - Clickar logo Junta de Andalucia$")
    public void Clickar_Logo_Junta_De_Andalucia() throws InterruptedException{
        myStep.clikarlogoJunta();
    }

    @Y("^PPB004-CAPF053 - Clickar logo Union Europea$")
    public void Clickar_Logo_UnionEuropea() throws InterruptedException{
        myStep.clickarlogoUnion();
    }

    @Y("^PPB004-CAPF053 - Clickar Mapa web$")
    public void Clickar_Mapa_Web() throws InterruptedException{
        myStep.clickarMapa();
    }

    @Y("^PPB004-CAPF053 - Clickar Proteccion de datos$")
    public void Clickar_Proteccion_De_Datos() throws InterruptedException{
        myStep.clickarProteccionDatos();
    }

    @Y("^PPB004-CAPF053 - Clickar Accesibilidad$")
    public void Clickar_Accesibilidad() throws InterruptedException{
        myStep.clickarAccesibilidad();
    }

    @Y("^PPB004-CAPF053 - Clickar Condiciones de uso$")
    public void Clickar_Condiciones_De_Uso() throws InterruptedException{
        myStep.clickarCondicionesUso();
    }

}

