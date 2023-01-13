package org.medioAmbiente.PPB005.CAP_F_001_07.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB005.CAP_F_001_07.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.net.URISyntaxException;


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
    public void comprobarInformacion() throws InterruptedException, URISyntaxException {
        page.comprobarInformacion();
    }
}