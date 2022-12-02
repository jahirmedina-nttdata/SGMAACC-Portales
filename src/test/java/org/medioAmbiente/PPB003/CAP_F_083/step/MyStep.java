package org.medioAmbiente.PPB003.CAP_F_083.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_083.page.MyPage;
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
    public void autenticarUsuario() throws InterruptedException {
        page.autenticarUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void clikarAñadirFavoritos() throws InterruptedException, URISyntaxException {
        page.clikarAñadirFavoritos();
    }

    @net.thucydides.core.annotations.Step
    public void validarAñadido() throws InterruptedException {
        page.validarAñadido();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEliminarFavorito() throws InterruptedException {
        page.clickarEliminarFavorito();
    }
}