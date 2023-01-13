package org.medioAmbiente.PPB004.CAP_FN_005.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FN_005.page.MyPage;
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
    public void clickarBuscar() throws InterruptedException {
        page.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTexto() throws InterruptedException {
        page.buscarPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTema() throws InterruptedException{
        page.buscarPorTema();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTextoYTema()throws InterruptedException {
        page.buscarPorTextoYTema();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorFechaDePublicacionAscendentemente()throws InterruptedException {
        page.buscarPorFechaDePublicacionAscendentemente();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTituloAscendente()throws InterruptedException {
        page.buscarPorTituloAscendente();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTituloDescendente()throws InterruptedException {
        page.buscarPorTituloDescendente();
    }

    @net.thucydides.core.annotations.Step
    public void validarFuncionamientoDePaginador()throws InterruptedException {
        page.validarFuncionamientoDePaginador();
    }
}