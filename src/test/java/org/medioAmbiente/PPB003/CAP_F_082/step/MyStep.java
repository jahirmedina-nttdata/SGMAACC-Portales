package org.medioAmbiente.PPB003.CAP_F_082.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_082.page.MyPage;
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
    public void autenticoUsuario() throws InterruptedException {
        page.autenticoUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void cambiarIdioma() throws InterruptedException {
        page.cambiarIdioma();
    }

    @net.thucydides.core.annotations.Step
    public void accederAEspacioNatural() throws InterruptedException, URISyntaxException {
        page.accederAEspacioNatural();
    }

    @net.thucydides.core.annotations.Step
    public void validarTraduccion() throws InterruptedException {
        page.validarTraduccion();
    }

}