package org.medioAmbiente.PPB001.CAP_F_015.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_015.page.MyPage;
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
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTexto() throws InterruptedException {
        myPage.buscarPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTematica() throws InterruptedException {
        myPage.buscarPorTematica();
    }


    @net.thucydides.core.annotations.Step
    public void buscarPorFechaDesdeYHasta() throws InterruptedException {
        myPage.buscarPorFechaDesdeYHasta();
    }

    @net.thucydides.core.annotations.Step
    public void ordenarFechaDePublicacionAscendentemente() throws InterruptedException {
        myPage.ordenarFechaDePublicacionAscendentemente();
    }

    @net.thucydides.core.annotations.Step
    public void ordenarPorTituloAscendentemente() throws InterruptedException {
        myPage.ordenarPorTituloAscendentemente();
    }

    @net.thucydides.core.annotations.Step
    public void ordenarPorTituloDescendentemente() throws InterruptedException {
        myPage.ordenarPorTituloDescendentemente();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTodosLosFiltros() throws InterruptedException {
        myPage.buscarPorTodosLosFiltros();
    }
}