package org.medioAmbiente.PPB003.CAP_F_071.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_071.page.MyPage;
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
    public void clickarIcono() throws InterruptedException {
        page.clickarIcono();
    }

    @net.thucydides.core.annotations.Step
    public void accederUsuario() throws InterruptedException {
        page.accederUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void accederUserInvalido() throws InterruptedException {
        page.accederUserInvalido();
    }

    @net.thucydides.core.annotations.Step
    public void clickarOlvideContraseña() throws InterruptedException {
        page.clickarOlvideContraseña();
    }

    @net.thucydides.core.annotations.Step
    public void rellenarFormulario() throws InterruptedException {
        page.rellenarFormulario();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAcceder() throws InterruptedException {
        page.clickarAcceder();
    }
}