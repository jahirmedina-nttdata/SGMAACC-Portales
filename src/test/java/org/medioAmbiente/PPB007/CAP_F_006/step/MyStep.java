package org.medioAmbiente.PPB007.CAP_F_006.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_006.page.MyPage;
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
    public void visualizarCAPF038() throws InterruptedException {
        page.visualizarCAPF038();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF040() throws InterruptedException {
        page.visualizarCAPF040();
    }
}