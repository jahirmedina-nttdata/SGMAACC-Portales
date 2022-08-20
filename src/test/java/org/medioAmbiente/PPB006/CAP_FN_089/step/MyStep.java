package org.medioAmbiente.PPB006.CAP_FN_089.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FN_089.page.MyPage;
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
    public void clickarPlanAndaluz() throws InterruptedException {
        page.clickarPlanAndaluz();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarPlanAndaluz() throws InterruptedException {
        page.visualizarPlanAndaluz();
    }
}