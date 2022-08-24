package org.medioAmbiente.PPB003.CAP_F_034.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_034.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 500)");
    }

    @net.thucydides.core.annotations.Step
    public void clickarPestaña() throws InterruptedException {
        page.clickarPestaña();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEspaciosNaturales() throws InterruptedException {
        page.clickarEspaciosNaturales();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarDatos() throws InterruptedException {
        page.visualizarDatos();
    }
}