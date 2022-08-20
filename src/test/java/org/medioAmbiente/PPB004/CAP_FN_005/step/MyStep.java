package org.medioAmbiente.PPB004.CAP_FN_005.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FN_005.page.MyPage;
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
    public void clickarBuscar() throws InterruptedException {
        page.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void clickarconTexto() throws InterruptedException {
        page.clickarconTexto();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarTema() throws InterruptedException{
        page.seleccionarTema();
    }

    @net.thucydides.core.annotations.Step
    public void navegarVistas()throws InterruptedException {
        page.navegarVistas();
    }
}