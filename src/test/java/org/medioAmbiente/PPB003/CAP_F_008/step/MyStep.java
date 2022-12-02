package org.medioAmbiente.PPB003.CAP_F_008.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_008.page.MyPage;
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
    public void Autenticarse() throws InterruptedException, URISyntaxException {
        page.Autenticarse();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPasaporte() throws InterruptedException {
        page.clickarPasaporte();
    }

    @net.thucydides.core.annotations.Step
    public void verificarIcono() throws InterruptedException {
        page.verificarIcono();
    }
}