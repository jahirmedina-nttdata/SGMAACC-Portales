package org.medioAmbiente.PPB007.CAP_FC_016.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_FC_016.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

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
    public void clickarPortalCaza() throws InterruptedException{
        page.clickarPortalCaza();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCambioClimatico() throws InterruptedException{
        page.clickarCambioClimatico();
    }

    @net.thucydides.core.annotations.Step
    public void clickarVentanVisitante() throws InterruptedException {
        page.clickarVentanVisitante();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAtencionCiudadania() throws InterruptedException {
        page.clickarAtencionCiudadania();
    }

    @net.thucydides.core.annotations.Step
    public void clickarHerramientas() throws InterruptedException {
        page.clickarHerramientas();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCarpetaCiudadana() throws InterruptedException {
        page.clickarCarpetaCiudadana();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTramites() throws InterruptedException {
        page.clickarTramites();
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
    public void clickarAccesibilidad() throws InterruptedException {
        page.clickarAccesibilidad();
    }

    @net.thucydides.core.annotations.Step
    public void clickarProteccionDatos() throws InterruptedException {
        page.clickarProteccionDatos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCondicionesUso() throws InterruptedException {
        page.clickarCondicionesUso();
    }
}


