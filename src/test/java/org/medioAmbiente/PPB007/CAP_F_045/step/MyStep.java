package org.medioAmbiente.PPB007.CAP_F_045.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_045.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage page;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFechaManual() throws InterruptedException {
        page.visualizarSinFechaManual();
    }


    @net.thucydides.core.annotations.Step
    public void visualizarSinSubtitulo() throws InterruptedException {
        page.visualizarSinSubtitulo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException {
        page.visualizarSinTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTextoAlternativo() throws InterruptedException {
        page.visualizarSinTextoAlternativo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinRequisitos() throws InterruptedException {
        page.visualizarSinRequisitos();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinAfectados() throws InterruptedException {
        page.visualizarSinAfectados();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinOrganoTramitador() throws InterruptedException {
        page.visualizarSinOrganoTramitador();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinLugarDePresentacion() throws InterruptedException {
        page.visualizarSinLugarDePresentacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinObservacion() throws InterruptedException {
        page.visualizarSinObservacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFechaDePlazoAbierto() throws InterruptedException {
        page.visualizarSinFechaDePlazoAbierto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPeriodo() throws InterruptedException {
        page.visualizarSinPeriodo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPlazoDeNotificacion() throws InterruptedException {
        page.visualizarSinPlazoDeNotificacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSilencioAdministrativo() throws InterruptedException {
        page.visualizarSinSilencioAdministrativo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinModelo() throws InterruptedException {
        page.visualizarSinModelo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSeguimientoDeTramite() throws InterruptedException {
        page.visualizarSinSeguimientoDeTramite();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDocumentacion() throws InterruptedException {
        page.visualizarSinDocumentacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDireccionDeEnlaceBoja() throws InterruptedException {
        page.visualizarSinDireccionDeEnlaceBoja();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDireccionDeEnlaceAlProcesoDeTramitacion() throws InterruptedException {
        page.visualizarSinDireccionDeEnlaceAlProcesoDeTramitacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPresentacionTelematica() throws InterruptedException {
        page.visualizarSinPresentacionTelematica();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinJustificacionTelematica() throws InterruptedException {
        page.visualizarSinJustificacionTelematica();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinNotificacionTelematica() throws InterruptedException {
        page.visualizarSinNotificacionTelematica();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSeguimientoDeExpediente() throws InterruptedException {
        page.visualizarSinSeguimientoDeExpediente();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPagoTelematico() throws InterruptedException {
        page.visualizarSinPagoTelematico();
    }

}