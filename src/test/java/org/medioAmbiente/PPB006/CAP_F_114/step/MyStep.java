package org.medioAmbiente.PPB006.CAP_F_114.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_F_114.page.MyPage;
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
    public void clickarportalAmbiental() throws InterruptedException {
        page.clickarportalAmbiental();
    }

    @net.thucydides.core.annotations.Step
    public void clickarportalCaza() throws InterruptedException{
        page.clickarportalCaza();
    }

    @net.thucydides.core.annotations.Step
    public void clickarVentanVisitante() throws InterruptedException {
        page.clickarVentanVisitante();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCanalAdministracion() throws InterruptedException {
        page.clickarCanalAdministracion();
    }

    @net.thucydides.core.annotations.Step
    public void planAndaluz() throws InterruptedException {
        page.planAndaluz();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPreguntasFrecuente() throws InterruptedException{
        page.clickarPreguntasFrecuente();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTwitter() throws InterruptedException{
        page.clickarTwitter();
    }

    @net.thucydides.core.annotations.Step
    public void clickarFacebook() throws InterruptedException{
        page.clickarFacebook();
    }

    @net.thucydides.core.annotations.Step
    public void clickarInstagram() throws InterruptedException{
        page.clickarInstagram();
    }

    @net.thucydides.core.annotations.Step
    public void clikarlogoJunta() throws InterruptedException{
        page.clikarlogoJunta();
    }

    @net.thucydides.core.annotations.Step
    public void clickarlogoUnion() throws InterruptedException {
        page.clickarlogoUnion();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMapa() throws InterruptedException {
        page.clickarMapa();
    }

    @net.thucydides.core.annotations.Step
    public void clickarProteccionDeDatos() throws InterruptedException {
        page.clickarProteccionDeDatos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAccesibilidad() throws InterruptedException {
        page.clickarAccesibilidad();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCondicionesUso() throws InterruptedException {
        page.clickarCondicionesUso();
    }
}

