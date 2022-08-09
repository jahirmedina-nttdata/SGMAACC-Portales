package org.medioAmbiente.PPB004.CAP_FN_006.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FN_006.page.MyPage;
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
    public void clickarDia() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        page.clickarDia();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSiguiente() throws InterruptedException{
        page.clickarSiguiente();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnterior() throws InterruptedException{
        page.clickarAnterior();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void clickarMasInfo() throws InterruptedException{
        page.clickarMasInfo();
        Thread.sleep(4000);
    }

    @net.thucydides.core.annotations.Step
    public void clickarPesca() throws InterruptedException{
        getDriver().navigate().back();
        Thread.sleep(2000);
        page.clickarPesca();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinEvento() throws InterruptedException{
        page.visualizarSinEvento();
        Thread.sleep(2000);
    }
}