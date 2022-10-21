package org.medioAmbiente.PPB002.CAP_F_089.stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;
import org.medioAmbiente.PPB002.CAP_F_089.step.MyStep;

public class MyStepDefinition {

    @Steps
    private MyStep myStep;


    @Dado("^PPB002-CAPF089 - Cargando el Navegador$")
    public void Cargando_El_Navegador() {

    }

    @Cuando("^PPB002-CAPF089 - Se haya cargado la web$")
    public void Se_Haya_Cargado_LaWeb() throws InterruptedException {
        myStep.cargarPagina();
    }

    @Y("^PPB002-CAPF089 - Aceptar las cookies$")
    public void Aceptar_Las_Cookies() throws InterruptedException {
        myStep.aceptarCookies();
    }


    @Y("^PPB002-CAPF089 - Mostrar sin fecha$")
    public void Mostrar_SinFecha() throws InterruptedException {
        myStep.visualizarSinFecha();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin subtitulo$")
    public void Mostrar_SinSubtitulo() throws InterruptedException {
        myStep.visualizarSinSub();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin texto$")
    public void Mostrar_SinTexto() throws InterruptedException {
        myStep.visualizarSinTexto();
    }


    @Y("^PPB002-CAPF089 - Mostrar sin texto miniatura$")
    public void Mostrar_Sin_Texto_Miniatura() throws InterruptedException {
        myStep.visualizarSinTextoMinuatura();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin requisitos$")
    public void Mostrar_Sin_Requisitos() throws InterruptedException {
        myStep.visualizarSinrequisitos();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin afectados$")
    public void Mostrar_Sin_Afectados() throws InterruptedException {
        myStep.visualizarSinafectados();
    }
    @Y("^PPB002-CAPF089 - Mostrar sin organos$")
    public void Mostrar_Sin_Organos() throws InterruptedException {
        myStep.visualizarSinorganos();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin lugar$")
    public void Mostrar_Sin_Lugar() throws InterruptedException {
        myStep.visualizarSinlugar();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin observaciones$")
    public void Mostrar_Sin_Observaciones() throws InterruptedException {
        myStep.visualizarSinobservaciones();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin fecha de plazo$")
    public void Mostrar_Sin_fecha_De_Plazo() throws InterruptedException {
        myStep.visualizarSinfechaplazo();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin periodo$")
    public void Mostrar_Sin_Periodo() throws InterruptedException {
        myStep.visualizarSinperiodo();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin plazo de notificacion$")
    public void Mostrar_Sin_Plazo_De_Notificacion() throws InterruptedException {
        myStep.visualizarSinplazonotificacion();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin silencio administrativo$")
    public void Mostrar_Sin_Silencio_Administrativo() throws InterruptedException {
        myStep.visualizarSinsilencioadministrativo();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin modelo$")
    public void Mostrar_Sin_Modeloo() throws InterruptedException {
        myStep.visualizarSinmodelo();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin seguimiento$")
    public void Mostrar_Sin_Seguimiento() throws InterruptedException {
        myStep.visualizarSinseguimiento();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin documentacion$")
    public void Mostrar_Sin_Documentacion() throws InterruptedException {
        myStep.visualizarSindocumentacion();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin enlace$")
    public void Mostrar_Sin_Enlace() throws InterruptedException {
        myStep.visualizarSinenlace();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin enlace de tramitacion$")
    public void Mostrar_Sin_Enlace_De_Tramitacion() throws InterruptedException {
        myStep.visualizarSinenlacetramitacion();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin presentacion telematica$")
    public void Mostrar_Sin_Presentacion_Telematica() throws InterruptedException {
        myStep.visualizarSinpresentaciontelematica();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin justificante telematico$")
    public void Mostrar_Sin_Justificante_Telematico() throws InterruptedException {
        myStep.visualizarSinjustificantetelematico();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin notificacion telematica$")
    public void Mostrar_Sin_Notificacion_Telematica() throws InterruptedException {
        myStep.visualizarSinnotificaciontelematica();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin seguimiento de expediente$")
    public void Mostrar_Sin_Seguimiento_De_Expediente() throws InterruptedException {
        myStep.visualizarSinseguimientoexpediente();
    }

    @Y("^PPB002-CAPF089 - Mostrar sin pago$")
    public void Mostrar_Sin_Pago() throws InterruptedException {
        myStep.visualizarSinpago();
    }
}

