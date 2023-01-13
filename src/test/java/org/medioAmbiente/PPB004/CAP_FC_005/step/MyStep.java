package org.medioAmbiente.PPB004.CAP_FC_005.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FC_005.page.MyPage;
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
    public void buscadorGeneral() throws InterruptedException {
        page.buscadorGeneral();
    }

    @net.thucydides.core.annotations.Step
    public void buscadorAvanzado() throws InterruptedException, URISyntaxException {
        page.buscadorAvanzado();
    }

    @net.thucydides.core.annotations.Step
    public void validarNumeroDeBusqueda() throws InterruptedException {
        page.validarNumeroDeBusqueda();
    }
}