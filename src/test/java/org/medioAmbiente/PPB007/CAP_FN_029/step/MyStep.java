package org.medioAmbiente.PPB007.CAP_FN_029.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_FN_029.page.MyPage;
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
    public void visualizarPaginador() throws InterruptedException {
        page.visualizarPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPaginador() throws InterruptedException {
        page.clickarPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSiguiente() throws InterruptedException {
        page.clickarSiguiente();
    }

    @net.thucydides.core.annotations.Step
    public void clickarUltimaPagina() throws InterruptedException {
        page.clickarUltimaPagina();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnterior() throws InterruptedException {
        page.clickarAnterior();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPrimeraPagina() throws InterruptedException {
        page.clickarPrimeraPagina();
    }
}