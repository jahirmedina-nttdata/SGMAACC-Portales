package org.medioAmbiente.PPB006.CAP_FC_002.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_002.page.MyPage;
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
    public void visualizarBuscador() throws InterruptedException {

        Thread.sleep(6000);
    }

    @net.thucydides.core.annotations.Step
    public void accederBuscador() throws InterruptedException {
        page.accederBuscador();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC0201() throws InterruptedException {
        page.visualizarCAPFC0201();

    }


}