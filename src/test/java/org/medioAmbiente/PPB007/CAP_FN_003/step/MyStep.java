package org.medioAmbiente.PPB007.CAP_FN_003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_FN_003.page.MyPage;
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
    public void visualizarCAPFC001() throws InterruptedException {
        page.visualizarCAPFC001();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC015() throws InterruptedException{
        page.visualizarCAPFC015();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC014() throws InterruptedException{
        page.visualizarCAPFC014();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC016() throws InterruptedException{
        page.visualizarCAPFC016();
    }
}