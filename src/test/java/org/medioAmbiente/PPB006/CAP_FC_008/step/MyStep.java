package org.medioAmbiente.PPB006.CAP_FC_008.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_008.page.MyPage;
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
    public void visualizarDiseño() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 980)");
        Thread.sleep(6000);
    }

    @net.thucydides.core.annotations.Step
    public void validarTextoflotante() throws InterruptedException{
       page.validarTextoflotante();
    }
    @net.thucydides.core.annotations.Step
    public void accederContenido() throws InterruptedException {
        page.accederContenido();
        Thread.sleep(3000);

    }


}