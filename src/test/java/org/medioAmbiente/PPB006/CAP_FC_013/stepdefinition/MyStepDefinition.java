package org.medioAmbiente.PPB006.CAP_FC_013.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB006.CAP_FC_013.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB006-CAPFC013 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB006-CAPFC013 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }


    @Y("^PPB006-CAPFC013 - Clickar Portal Ambiental$")
    public void Clickar_Portal_Ambiental() throws InterruptedException{
        myStep.clickarportalAmbiental();
    }

    @Y("^PPB006-CAPFC013 - Clickar Portal Caza$")
    public void Clickar_Portal_Caza()throws InterruptedException {
        myStep.clickarportalCaza();
    }

    @Y("^PPB006-CAPFC013 - Clickar Ventana de visitante$")
    public void Clickar_Ventana_De_Visitante()throws InterruptedException {
        myStep.clickarVentanVisitante();
    }

    @Y("^PPB006-CAPFC013 - Clickar Canal de Administracion$")
    public void Clickar_Canal_De_Administracion()throws InterruptedException {
        myStep. clickarCanalAdministracion();
    }

    @Y("^PPB006-CAPFC013 - Clickar Plan Andaluz$")
    public void Plan_Andaluz() throws InterruptedException{
        myStep.planAndaluz();
    }

    @Y("^PPB006-CAPFC013 - Clickar Preguntas Frecuentes$")
    public void Clickar_Preguntas_Frecuentes() throws InterruptedException{
        myStep.clickarPreguntasFrecuente();
    }

    @Y("^PPB006-CAPFC013 - Clickar icono Twitter$")
    public void Clickar_Icono_Twitter() throws InterruptedException{
        myStep.clickarTwitter();
    }

    @Y("^PPB006-CAPFC013 - Clickar icono Facebook$")
    public void Clickar_Icono_Facebook() throws InterruptedException{
        myStep.clickarFacebook();
    }

    @Y("^PPB006-CAPFC013 - Clickar icono Instagram$")
    public void Clickar_Icono_Instagram() throws InterruptedException{
        myStep.clickarInstagram();
    }

    @Y("^PPB006-CAPFC013 - Clickar logo Junta de Andalucia$")
    public void Clickar_Logo_Junta_De_Andalucia() throws InterruptedException{
        myStep.clikarlogoJunta();
    }

    @Y("^PPB006-CAPFC013 - Clickar logo Union Europea$")
    public void Clickar_Logo_UnionEuropea() throws InterruptedException{
        myStep.clickarlogoUnion();
    }

    @Y("^PPB006-CAPFC013 - Clickar Mapa web$")
    public void Clickar_Mapa_Web() throws InterruptedException{
        myStep.clickarMapa();
    }

    @Y("^PPB006-CAPFC013 - Clickar Proteccion de datos$")
    public void Clickar_Proteccion_De_Datos() throws InterruptedException{
        myStep.clickarProteccionDeDatos();
    }


    @Y("^PPB006-CAPFC013 - Clickar Accesibilidad$")
    public void Clickar_Accesibilidad() throws InterruptedException{
        myStep.clickarAccesibilidad();
    }

    @Y("^PPB006-CAPFC013 - Clickar Condiciones de uso$")
    public void Clickar_Condiciones_De_Uso() throws InterruptedException{
        myStep.clickarCondicionesUso();
    }

}

