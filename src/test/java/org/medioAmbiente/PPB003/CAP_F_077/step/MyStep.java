package org.medioAmbiente.PPB003.CAP_F_077.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_077.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;

import java.awt.*;


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
    public void clikarEliminarVisita() throws InterruptedException {
        page.clikarEliminarVisita();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCancelar() throws InterruptedException{
        page.clickarCancelar();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAceptar() throws InterruptedException {
        page.clickarAceptar();
    }

    @net.thucydides.core.annotations.Step
    public void validarEliminacion() throws InterruptedException {
        page.validarEliminacion();
    }
}