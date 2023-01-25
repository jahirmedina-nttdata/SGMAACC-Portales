package org.medioAmbiente.PPB003.CAP_F_145.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_145.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        myPage.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 100)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarAreaRecreativa() throws InterruptedException {
        myPage.seleccionarAreaRecreativa();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarAlmeria() throws InterruptedException {
        myPage.seleccionarAlmeria();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        myPage.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void validarResultado() throws InterruptedException {
        myPage.validarResultado();
    }
}