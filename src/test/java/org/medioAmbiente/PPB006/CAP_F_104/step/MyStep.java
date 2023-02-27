package org.medioAmbiente.PPB006.CAP_F_104.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_F_104.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.net.URISyntaxException;


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
    public void visualizarBuscador() throws InterruptedException {
        page.visualizarBuscador();
    }

    @net.thucydides.core.annotations.Step
    public void accederBuscador() throws InterruptedException, URISyntaxException {
        page.accederBuscador();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTexto() throws InterruptedException {
        page.buscarPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorColectivo() throws InterruptedException {
        page.buscarPorColectivo();
    }

    @net.thucydides.core.annotations.Step
    public void ordenarPorFechaDePublicacionAscendente() throws InterruptedException {
        page.ordenarPorFechaDePublicacionAscendente();
    }

    @net.thucydides.core.annotations.Step
    public void ordenarPorTituloAscendente() throws InterruptedException {
        page.ordenarPorTituloAscendente();
    }

    @net.thucydides.core.annotations.Step
    public void ordenarPorTituloDescendente() throws InterruptedException {
        page.ordenarPorTituloDescendente();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTextoYColectivo() throws InterruptedException {
        page.buscarPorTextoYColectivo();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPunteroEnTexto() throws InterruptedException {
        page.posicionarPunteroEnTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarPaginacion() throws InterruptedException {
        page.visualizarPaginacion();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarPaginador() throws InterruptedException {
        page.pulsarPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarSiguiente() throws InterruptedException {
        page.pulsarSiguiente();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarUltimaPagina() throws InterruptedException {
        page.pulsarUltimaPagina();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarAnterior() throws InterruptedException {
        page.pulsarAnterior();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarPrimeraPagina() throws InterruptedException {
        page.pulsarPrimeraPagina();
    }

    @net.thucydides.core.annotations.Step
    public void validarCantidadDeResultados() throws InterruptedException {
        page.validarCantidadDeResultados();
    }
}