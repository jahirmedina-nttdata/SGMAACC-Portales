package org.medioAmbiente.PPB006.CAP_F_002.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_F_002.page.MyPage;
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
    public void autenticaUsuario() throws InterruptedException {
        page.autenticaUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void accederPortalCambioClimatico() throws InterruptedException, URISyntaxException {
        page.accederPortalCambioClimatico();
    }

    @net.thucydides.core.annotations.Step
    public void validarUsuario() throws InterruptedException {
        page.validarUsuario();
    }
}