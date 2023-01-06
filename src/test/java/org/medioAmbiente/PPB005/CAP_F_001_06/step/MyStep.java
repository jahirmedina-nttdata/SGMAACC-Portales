package org.medioAmbiente.PPB005.CAP_F_001_06.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB005.CAP_F_001_06.page.MyPage;
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
    public void autenticarUsuario() throws InterruptedException, URISyntaxException {
        page.autenticarUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSubmenuLateral() throws InterruptedException {
        page.clickarSubmenuLateral();
    }

    @net.thucydides.core.annotations.Step
    public void validarQueNavegueAlSubmenu() throws InterruptedException {
        page.validarQueNavegueAlSubmenu();
    }
}