package org.medioAmbiente.PPB007.CAP_F_049.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_049.page.MyPage;
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
    public void clickarPaginador() throws InterruptedException {
        page.clickarPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException {
        page.clickarEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void retrocederPagina() throws InterruptedException {
        page.retrocederPagina();
    }

    @net.thucydides.core.annotations.Step
    public void validarCacheoDePaginador() throws InterruptedException {
        page.validarCacheoDePaginador();
    }
}