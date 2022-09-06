package org.medioAmbiente.PPB003.CAP_F_045.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_045.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;


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
        j.executeScript("window.scrollBy(0, 1000)");
    }

    @net.thucydides.core.annotations.Step
    public void accederPagina() throws InterruptedException{
        page.accederPagina();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMeGusta() throws InterruptedException {
        page.clickarMeGusta();
    }

    @net.thucydides.core.annotations.Step
    public void moverScroll()  throws InterruptedException {
        page.moverScroll();
    }
}