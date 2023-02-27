package org.medioAmbiente.PPB004.CAP_F_052.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_F_052.page.MyPage;
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
    public void seleccionarEnlace() throws InterruptedException {
        page.seleccionarEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPuntero() throws InterruptedException{
        page.posicionarPuntero();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPagPadre() throws InterruptedException {
        page.clickarPagPadre();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMiga() throws InterruptedException {
        page.clickarMiga();
    }
}


