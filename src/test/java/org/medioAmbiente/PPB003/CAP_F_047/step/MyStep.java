package org.medioAmbiente.PPB003.CAP_F_047.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_047.page.MyPage;
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
    public void clickarValor3() throws InterruptedException {
        page.clickarValor3();
    }

    @net.thucydides.core.annotations.Step
    public void clickarValor5() throws InterruptedException {
        page.clickarValor5();
    }

    @net.thucydides.core.annotations.Step
    public void clickarValoradas() throws InterruptedException {
        page.clickarValoradas();
    }
}