package org.medioAmbiente.PPB002.CAP_F_081.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_081.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException {
        page.visualizarSinSub();
    }


    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException {
        page.visualizarSinTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTextoMinuatura() throws InterruptedException {
        page.visualizarSinTextoMinuatura();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinrequisitos() throws InterruptedException {
        page.visualizarSinrequisitos();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinafectados() throws InterruptedException {
        page.visualizarSinafectados();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinorganos() throws InterruptedException {
        page.visualizarSinorganos();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinlugar() throws InterruptedException {
        page.visualizarSinlugar();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinobservaciones() throws InterruptedException {
        page.visualizarSinobservaciones();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinfechaplazo() throws InterruptedException {
        page.visualizarSinfechaplazo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinperiodo() throws InterruptedException {
        page.visualizarSinperiodo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinplazonotificacion() throws InterruptedException {
        page.visualizarSinplazonotificacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinsilencioadministrativo() throws InterruptedException {
        page.visualizarSinsilencioadministrativo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinmodelo() throws InterruptedException {
        page.visualizarSinmodelo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinseguimiento() throws InterruptedException {
        page.visualizarSinseguimiento();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSindocumentacion() throws InterruptedException {
        page.visualizarSindocumentacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinenlace() throws InterruptedException {
        page.visualizarSinenlace();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinenlacetramitacion() throws InterruptedException {
        page.visualizarSinenlacetramitacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinpresentaciontelematica() throws InterruptedException {
        page.visualizarSinpresentaciontelematica();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinjustificantetelematico() throws InterruptedException {
        page.visualizarSinjustificantetelematico();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinnotificaciontelematica() throws InterruptedException {
        page.visualizarSinnotificaciontelematica();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinseguimientoexpediente() throws InterruptedException {
        page.visualizarSinseguimientoexpediente();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinpago() throws InterruptedException {
        page.visualizarSinpago();
    }
}