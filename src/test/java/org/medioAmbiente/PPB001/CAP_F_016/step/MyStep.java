package org.medioAmbiente.PPB001.CAP_F_016.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_016.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.net.URISyntaxException;


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
    }

    @net.thucydides.core.annotations.Step
    public void buscarImagenPorTexto() throws InterruptedException, URISyntaxException {
        myPage.buscarImagenPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarImagenPorTema() throws InterruptedException {
        myPage.buscarImagenPorTema();
    }

    @net.thucydides.core.annotations.Step
    public void buscarImagenPorFecha() throws InterruptedException {
        myPage.buscarImagenPorFecha();
    }

    @net.thucydides.core.annotations.Step
    public void buscarImagenPorFiltros() throws InterruptedException {
        myPage.buscarImagenPorFiltros();
    }

    @net.thucydides.core.annotations.Step
    public void buscarVideoPorTexto() throws InterruptedException, URISyntaxException {
        myPage.buscarVideoPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void buscarVideoPorTema() throws InterruptedException {
        myPage.buscarVideoPorTema();
    }

    @net.thucydides.core.annotations.Step
    public void buscarVideoPorFecha() throws InterruptedException {
        myPage.buscarVideoPorFecha();
    }

    @net.thucydides.core.annotations.Step
    public void buscarVideoPorFiltros() throws InterruptedException {
        myPage.buscarVideoPorFiltros();
    }
}