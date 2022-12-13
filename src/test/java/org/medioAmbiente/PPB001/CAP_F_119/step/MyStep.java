package org.medioAmbiente.PPB001.CAP_F_119.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_119.page.MyPage;
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
    public void autenticarUsuario() throws InterruptedException {
        page.autenticarUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void accederContenidoWeb() throws InterruptedException {
        page.accederContenidoWeb();
    }

    @net.thucydides.core.annotations.Step
    public void validarListado() throws InterruptedException {
        page.validarListado();
    }
}