package org.medioAmbiente.PPB001.CAP_F_116.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_116.page.MyPage;
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
    public void clickarSiguientePaginador() throws InterruptedException {
        page.clickarSiguientePaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSiguientePaginadorEnUltimaPagina() throws InterruptedException {
        page.clickarSiguientePaginadorEnUltimaPagina();
    }
    @net.thucydides.core.annotations.Step
    public void clickarAnteriorPaginador() throws InterruptedException {
        page.clickarAnteriorPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnteriorPaginadorEnPrimeraPagina() throws InterruptedException {
        page.clickarAnteriorPaginadorEnPrimeraPagina();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCualquierPaginador() throws InterruptedException {
        page.clickarCualquierPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarMismoPaginador() throws InterruptedException {
        page.clickarMismoPaginador();
    }

}