package org.medioAmbiente.PPB003.CAP_F_057.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_057.page.MyPage;
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
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    @net.thucydides.core.annotations.Step
    public void clickarVentanVisitante() throws InterruptedException {
        page.clickarVentanVisitante();
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
    public void clickarPinterest() throws InterruptedException{
        page.clickarPinterest();
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
    public void clickarConocenos() throws InterruptedException {
        page.clickarConocenos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarContacto() throws InterruptedException {
        page.clickarContacto();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlacesInteres() throws InterruptedException {
        page.clickarEnlacesInteres();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMapa() throws InterruptedException {
        page.clickarMapa();
    }

    @net.thucydides.core.annotations.Step
    public void clickarManuales() throws InterruptedException {
        page.clickarManuales();
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


