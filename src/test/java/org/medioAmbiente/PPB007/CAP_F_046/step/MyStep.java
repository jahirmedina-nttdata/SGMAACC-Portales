package org.medioAmbiente.PPB007.CAP_F_046.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_046.page.MyPage;
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
    public void visualizarCaminoMigas() throws InterruptedException {
        page.visualizarCaminoMigas();
    }


    @net.thucydides.core.annotations.Step
    public void posicionarPuntero() throws InterruptedException {
        page.posicionarPuntero();
    }

    @net.thucydides.core.annotations.Step
    public void clickarElementoPadre() throws InterruptedException {
        page.clickarElementoPadre();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMigaActual() throws InterruptedException {
        page.clickarMigaActual();
    }

}