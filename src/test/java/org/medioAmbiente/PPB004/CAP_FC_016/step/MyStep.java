package org.medioAmbiente.PPB004.CAP_FC_016.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FC_016.page.MyPage;
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
    public void mostrarBuscador() throws InterruptedException {
        page.mostrarBuscador();
    }


    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        page.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPortexto() throws InterruptedException{
        page.buscarPortexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorCateg() throws InterruptedException {
        page.buscarPorCateg();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorPlazo() throws InterruptedException {
        page.buscarPorPlazo();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTramitacion() throws InterruptedException {
        page.buscarPorTramitacion();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTextoPlazo() throws InterruptedException {
        page.buscarPorTextoPlazo();
    }

    @net.thucydides.core.annotations.Step
    public void accederContenido() throws InterruptedException {
        page.accederContenido();
    }

    @net.thucydides.core.annotations.Step
    public void validarTextFlotante()throws InterruptedException {
        page.validarTextFlotante();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarcaso() throws InterruptedException{
        page.ejecutarcaso();
    }
}