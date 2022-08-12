package org.medioAmbiente.PPB006.CAP_FN_010.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FN_010.page.MyPage;
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
    public void accederEnlace() throws InterruptedException {
        page.accederEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarPagina() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
            Thread.sleep(2000);
        j.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(1000);
        j.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(1000);
        j.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(1000);


    }


}