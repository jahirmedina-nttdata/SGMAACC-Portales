package org.medioAmbiente.PPB006.CAP_FC_005.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_005.page.MyPage;
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
    public void visualizarNoticia() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Thread.sleep(6000);
    }

    @net.thucydides.core.annotations.Step
    public void accederNoticia() throws InterruptedException {
        page.accederNoticia();
        Thread.sleep(2000);
    }

    @net.thucydides.core.annotations.Step
    public void validarTextoflotante() throws InterruptedException{
        getDriver().navigate().back();
        Thread.sleep(3000);
        page.validarTextoflotante();

    }
}