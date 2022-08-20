package org.medioAmbiente.PPB003.CAP_F_032.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_032.page.MyPage;
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
    public void clickarPausar() throws InterruptedException {
        page.clickarPausar();
    }

    @net.thucydides.core.annotations.Step
    public void clickarReanudar() throws InterruptedException {
        page.clickarReanudar();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnterior() throws InterruptedException {
        page.clickarAnterior();
    }

    @net.thucydides.core.annotations.Step
    public void moverDerecha() throws InterruptedException {
        page.moverDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSiguiente() throws InterruptedException {
        page.clickarSiguiente();
    }

    @net.thucydides.core.annotations.Step
    public void moverIzquierda() throws InterruptedException {
        page.moverIzquierda();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPrimerapag() throws InterruptedException {
        page.clickarPrimerapag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarUltimapag() throws InterruptedException {
        page.clickarUltimapag();
    }

}