package org.medioAmbiente.PPB003.CAP_F_089.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_089.page.MyPage;
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
    public void clikarCancelarPasaporte() throws InterruptedException {
        page.clikarCancelarPasaporte();
    }

    @net.thucydides.core.annotations.Step
    public void clikarAceptarPasaporte() throws InterruptedException {
        page.clikarAceptarPasaporte();
    }

    @net.thucydides.core.annotations.Step
    public void validarPasaporteEliminado() throws InterruptedException {
        page.validarPasaporteEliminado();
    }
}