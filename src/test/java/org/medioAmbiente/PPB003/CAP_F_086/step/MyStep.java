package org.medioAmbiente.PPB003.CAP_F_086.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_086.page.MyPage;
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
    public void seleccionarIdioma() throws InterruptedException {
        page.seleccionarIdioma();
    }

    @net.thucydides.core.annotations.Step
    public void clickarFicha() throws InterruptedException {
        page.clickarFicha();
    }

    @net.thucydides.core.annotations.Step
    public void validarTraduccion() throws InterruptedException {
        page.validarTraduccion();
    }
}