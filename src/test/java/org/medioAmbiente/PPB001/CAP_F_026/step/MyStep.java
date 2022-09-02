package org.medioAmbiente.PPB001.CAP_F_026.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_026.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        myPage.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
      //  j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarImportanciaComunitaria() throws InterruptedException {
        myPage.seleccionarImportanciaComunitaria();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarDunasOdiel() throws InterruptedException {
        myPage.seleccionarDunasOdiel();
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