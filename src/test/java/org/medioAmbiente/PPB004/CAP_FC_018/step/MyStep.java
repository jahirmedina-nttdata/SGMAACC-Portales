package org.medioAmbiente.PPB004.CAP_FC_018.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FC_018.page.MyPage;
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
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
       Thread.sleep(3000);

    }


    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        page.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPortexto() throws InterruptedException{
        page.buscarPortexto();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorCateg() throws InterruptedException {
        page.buscarPorCateg();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorPlazo() throws InterruptedException {
        page.buscarPorPlazo();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTramitacion() throws InterruptedException {
        page.buscarPorTramitacion();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTextoPlazo() throws InterruptedException {
        page.buscarPorTextoPlazo();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void accederContenido() throws InterruptedException {
        page.accederContenido();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void validarTextFlotante()throws InterruptedException {
        Thread.sleep(3000);
        page.validarTextFlotante();
        Thread.sleep(3000);
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarcaso() throws InterruptedException{
        page.ejecutarcaso();
    }
}