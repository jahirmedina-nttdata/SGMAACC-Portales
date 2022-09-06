package org.medioAmbiente.PPB003.CAP_F_064.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_064.page.MyPage;
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
    public void visualizarCAPF048() throws InterruptedException {
        page.visualizarCAPF048();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF049() throws InterruptedException {
        page.visualizarCAPF049();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF057() throws InterruptedException {
        page.visualizarCAPF057();
    }
}