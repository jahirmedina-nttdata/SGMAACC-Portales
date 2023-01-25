package org.medioAmbiente.PPB004.CAP_FC_014.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FC_014.page.MyPage;
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
    public void visualizarCarrusel() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
    }

    @net.thucydides.core.annotations.Step
    public void navegarContenido()throws InterruptedException {
        page.navegarContenido();
    }

    @net.thucydides.core.annotations.Step
    public void validarTextFlotante()throws InterruptedException {
        page.validarTextFlotante();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBullet() throws InterruptedException{
        page.clickarBullet();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarIzquierda() throws InterruptedException {
        page.deslizarIzquierda();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarDerecha() throws InterruptedException {
        page.deslizarDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void clickarFDerecha() throws InterruptedException{
        page.clickarFDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void clickarFIzquierda() throws InterruptedException{
        page.clickarFIzquierda();
    }
}