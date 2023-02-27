package org.medioAmbiente.PPB004.CAP_F_064.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_F_064.page.MyPage;
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
    public void mostrarContenido() throws InterruptedException {
        page.mostrarContenido();
    }

    @net.thucydides.core.annotations.Step
    public void navegarContenido()throws InterruptedException {
        page.navegarContenido();
    }

    @net.thucydides.core.annotations.Step
    public void validarTextFlotante()throws InterruptedException {
        page.validarTextFlotante();
    }
}