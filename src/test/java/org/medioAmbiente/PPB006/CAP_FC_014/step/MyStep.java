package org.medioAmbiente.PPB006.CAP_FC_014.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_014.page.MyPage;
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
    public void visualizarContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 850)");
        Thread.sleep(5000);
    }

    @net.thucydides.core.annotations.Step
    public void mostrarAnimacion() throws InterruptedException {

       page.mostrarAnimacion();
       Thread.sleep(2000);
    }


    @net.thucydides.core.annotations.Step
    public void accederContenido() throws InterruptedException {
        page.accederContenido();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void validarFlotante() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        page.validarFlotante();
        Thread.sleep(3000);

    }



}