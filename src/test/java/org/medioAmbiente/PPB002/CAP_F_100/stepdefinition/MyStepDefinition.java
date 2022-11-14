package org.medioAmbiente.PPB002.CAP_F_100.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_100.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF100 - Cargando el Navegador$")
    public void Cargando_El_Navegador() throws InterruptedException {
        myStep.cargandoNavegador();
    }
    @Cuando("^PPB002-CAPF100 - Acepta las Cookies")
    public void Acepta_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Portal de la Caza y la Pesca Continental")
    public void Pulsar_Sobre_El_Enlace_Portal_De_La_Caza_Y_La_Pesca_Continental() throws InterruptedException {
        myStep.pulsarPortalCazaPescaContinental();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Portal Andaluz del Cambio Climático")
    public void Pulsar_Sobre_El_Enlace_Portal_Andaluz_Del_Cambio_Climático() throws InterruptedException {
        myStep.pulsarPortalAndaluzCambioClimatico();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Ventana del visitante")
    public void Pulsar_Sobre_El_Enlace_Ventana_Del_Visitante() throws InterruptedException {
        myStep.pulsarVentanaVisitante();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Canal de Administración Electrónica")
    public void Pulsar_Sobre_El_Enlace_Canal_De_Administración_Electrónica() throws InterruptedException {
        myStep.pulsarCanalAdministracionElectronica();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Plan Infoca")
    public void Pulsar_Sobre_El_Enlace_Plan_Infoca() throws InterruptedException {
        myStep.pulsarPlanInfoca();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Embalses y precipitaciones")
    public void Pulsar_Sobre_El_Enlace_Embalses_Y_Precipitaciones() throws InterruptedException {
        myStep.pulsarEmbalsesPrecipitaciones();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Calidad del aire en Andalucía")
    public void Pulsar_Sobre_El_Enlace_Calidad_Del_Aire_En_Andalucía() throws InterruptedException {
        myStep.pulsarCalidadDelAire();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Catálogo de información")
    public void Pulsar_Sobre_El_Enlace_Catálogo_De_Información() throws InterruptedException {
        myStep.pulsarCatalogoInformacion();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Estadisticas")
    public void Pulsar_Sobre_El_Enlace_Estadisticas() throws InterruptedException {
        myStep.pulsarEstadisticas();
    }


    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Twitter")
    public void Pulsar_Sobre_El_Icono_Twitter() throws InterruptedException {
        myStep.pulsarTwitter();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Facebook")
    public void Pulsar_Sobre_El_Icono_Facebook() throws InterruptedException {
        myStep.pulsarFacebook();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Instagram")
    public void Pulsar_Sobre_El_Icono_Instagram() throws InterruptedException {
        myStep.pulsarInstagram();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Youtube")
    public void Pulsar_Sobre_El_Icono_Youtube() throws InterruptedException {
        myStep.pulsarYoutube();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Twitter REDIAM")
    public void Pulsar_Sobre_El_Icono_Twitter_REDIAM() throws InterruptedException {
        myStep.pulsarTwitterREDIAM();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Facebook REDIAM")
    public void Pulsar_Sobre_El_Icono_Facebook_REDIAM() throws InterruptedException {
        myStep.pulsarFacebookREDIAM();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Instagram REDIAM")
    public void Pulsar_Sobre_El_Icono_Instagram_REDIAM() throws InterruptedException {
        myStep.pulsarInstagramREDIAM();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Youtube REDIAM")
    public void Pulsar_Sobre_El_Icono_Youtube_REDIAM() throws InterruptedException {
        myStep.pulsarYoutubeREDIAM();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el icono Likedin REDIAM")
    public void Pulsar_Sobre_El_Icono_Likedin_REDIAM() throws InterruptedException {
        myStep.pulsarLikedinREDIAM();
    }

    @Y("^PPB002-CAPF100 - Pulsar en el logo CAGPDS")
    public void Pulsar_En_El_Logo_CAGPDS() throws InterruptedException {
        myStep.pulsarLogoCAGPDS();
    }

    @Y("^PPB002-CAPF100 - Pulsar en el logo Union Europea")
    public void Pulsar_En_El_Logo_Union_Europea() throws InterruptedException {
        myStep.pulsarLogoUnionEuropea();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Mapa Web")
    public void Pulsar_Sobre_El_Enlace_Mapa_Web() throws InterruptedException {
        myStep.pulsarMapaWeb();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Protección de datos")
    public void Pulsar_Sobre_El_Enlace_Protección_De_Datos() throws InterruptedException {
        myStep.pulsarProteccionDatos();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Accesibilidad")
    public void Pulsar_Sobre_El_Enlace_Accesibilidad() throws InterruptedException {
        myStep.pulsarAccesibilidad();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace Condiciones de uso")
    public void Pulsar_Sobre_El_Enlace_Condiciones_De_Uso() throws InterruptedException {
        myStep.pulsarCondicionesUso();
    }

    @Y("^PPB002-CAPF100 - Pulsar sobre el enlace RSS")
    public void Pulsar_Sobre_El_Enlace_RSS() throws InterruptedException {
        myStep.pulsarRSS();
    }

}

