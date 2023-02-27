package org.medioAmbiente.PPB004.CAP_F_004.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_F_004.page.MyPage;
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
    public void mostrarBuscador() throws InterruptedException {
       page.mostrarBuscador();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPortexto() throws InterruptedException {
        page.buscarPortexto();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException{
        page.clickarEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF05()throws InterruptedException, URISyntaxException {
        page.visualizarCAPF05();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF067()throws InterruptedException {
        page.visualizarCAPF067();
    }
}