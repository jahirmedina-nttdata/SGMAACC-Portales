package org.medioAmbiente.PPB007.CAP_F_045.stepdefinition;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB007.CAP_F_045.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB007-CAPF045 - Accedo al Navegador$")
    public void Accedo_Al_Navegador() throws InterruptedException{
        myStep.cargarPagina();
    }

    @Y("^PPB007-CAPF045 - Acepto Cookies$")
    public void Acepto_Cookies() throws InterruptedException{
        myStep.aceptarCookies();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin fecha manual$")
    public void Visualiza_Sin_Fecha_Manual()throws InterruptedException {
        myStep.visualizarSinFechaManual();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin subtitulo$")
    public void Visualiza_Sin_Subtitulo()throws InterruptedException {
        myStep.visualizarSinSubtitulo();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin texto$")
    public void Visualiza_Sin_Texto()throws InterruptedException {
        myStep.visualizarSinTexto();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin texto alternativo$")
    public void Visualiza_Sin_Texto_Alternativo()throws InterruptedException {
        myStep.visualizarSinTextoAlternativo();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin requisitos$")
    public void Visualiza_Sin_Requisitos()throws InterruptedException {
        myStep.visualizarSinRequisitos();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin afectados$")
    public void Visualiza_Sin_Afectados()throws InterruptedException {
        myStep.visualizarSinAfectados();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin organo tramitador$")
    public void Visualiza_Sin_Organo_Tramitador()throws InterruptedException {
        myStep.visualizarSinOrganoTramitador();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin lugar de presentacion$")
    public void Visualiza_Sin_Lugar_De_Presentacion()throws InterruptedException {
        myStep.visualizarSinLugarDePresentacion();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin observacion$")
    public void Visualiza_Sin_Observacion()throws InterruptedException {
        myStep.visualizarSinObservacion();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin fecha de plazo abierto$")
    public void Visualiza_Sin_Fecha_De_Plazo_Abierto()throws InterruptedException {
        myStep.visualizarSinFechaDePlazoAbierto();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin periodo$")
    public void Visualiza_Sin_Periodo()throws InterruptedException {
        myStep.visualizarSinPeriodo();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin plazo de notificacion$")
    public void Visualiza_Sin_Plazo_De_Notificacion()throws InterruptedException {
        myStep.visualizarSinPlazoDeNotificacion();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin silencio administrativo$")
    public void Visualiza_Sin_Silencio_Administrativo()throws InterruptedException {
        myStep.visualizarSinSilencioAdministrativo();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin modelo$")
    public void Visualiza_Sin_Modelo()throws InterruptedException {
        myStep.visualizarSinModelo();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin seguimiento de tramite$")
    public void Visualiza_Sin_Seguimiento_De_Tramite()throws InterruptedException {
        myStep.visualizarSinSeguimientoDeTramite();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin documentacion$")
    public void Visualiza_Sin_Documentacion()throws InterruptedException {
        myStep.visualizarSinDocumentacion();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin direccion de enlace boja$")
    public void Visualiza_Sin_Direccion_De_Enlace_Boja()throws InterruptedException {
        myStep.visualizarSinDireccionDeEnlaceBoja();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin direccion de enlace al proceso de tramitacion$")
    public void Visualiza_Sin_Direccion_De_Enlace_Al_Proceso_De_Tramitacion()throws InterruptedException {
        myStep.visualizarSinDireccionDeEnlaceAlProcesoDeTramitacion();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin presentacion telematica$")
    public void Visualiza_Sin_Presentacion_Telematica()throws InterruptedException {
        myStep.visualizarSinPresentacionTelematica();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin justificacion telematica$")
    public void Visualiza_Sin_Justificacion_Telematica()throws InterruptedException {
        myStep.visualizarSinJustificacionTelematica();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin notificacion telematica$")
    public void Visualiza_Sin_Notificacion_Telematica()throws InterruptedException {
        myStep.visualizarSinNotificacionTelematica();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin seguimiento de expediente$")
    public void Visualiza_Sin_Seguimiento_De_Expediente()throws InterruptedException {
        myStep.visualizarSinSeguimientoDeExpediente();
    }

    @Y("^PPB007-CAPF045 - Visualizar sin pago telematico$")
    public void Visualiza_Sin_Pago_Telematico()throws InterruptedException {
        myStep.visualizarSinPagoTelematico();
    }


}

