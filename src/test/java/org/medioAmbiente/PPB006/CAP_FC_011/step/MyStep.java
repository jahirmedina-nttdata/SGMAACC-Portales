package org.medioAmbiente.PPB006.CAP_FC_011.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_011.page.MyPage;
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
    public void visualizarCaminoMiga() throws InterruptedException {

        Thread.sleep(5000);
    }


    @net.thucydides.core.annotations.Step
    public void posicionarPuntero() throws InterruptedException {
        page.posicionarPuntero();
        Thread.sleep(3000);

    }

    public void clickarPadre() throws InterruptedException {
        page.clickarPadre();
        Thread.sleep(2000);

    }

    public void clickarActual() throws InterruptedException {
        page.clickarActual();
        Thread.sleep(2000);

    }


}