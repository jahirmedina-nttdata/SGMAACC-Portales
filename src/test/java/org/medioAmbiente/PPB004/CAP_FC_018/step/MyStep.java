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
    public void mostrarNumeracion() throws InterruptedException {
        page.mostrarNumeracion();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPagina() throws InterruptedException{
        page.clickarPagina();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSiguiente() throws InterruptedException{
        page.clickarSiguiente();
    }

    @net.thucydides.core.annotations.Step
    public void clickarUltimaPag() throws InterruptedException{
        page.clickarUltimaPag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAtras() throws InterruptedException {
        page.clickarAtras();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPrimeraPg() throws InterruptedException{
        page.clickarPrimeraPg();
    }
}