package org.medioAmbiente.PPB007.CAP_F_044.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_044.page.MyPage;
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
    public void visualizarContenido() throws InterruptedException {
        page.visualizarContenido();
    }


    @net.thucydides.core.annotations.Step
    public void buscarSinFiltros() throws InterruptedException {
        page.buscarSinFiltros();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTexto() throws InterruptedException {
        page.buscarPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTipo() throws InterruptedException {
        page.buscarPorTipo();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTematica() throws InterruptedException {
        page.buscarPorTematica();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorPlazoAbierto() throws InterruptedException {
        page.buscarPorPlazoAbierto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTramitacionElectronica() throws InterruptedException {
        page.buscarPorTramitacionElectronica();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTextoYPlazoAbierto() throws InterruptedException {
        page.buscarPorTextoYPlazoAbierto();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException {
        page.clickarEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarCAPFN029() throws InterruptedException {
        page.ejecutarCAPFN029();
    }

}