package org.medioAmbiente.PPB006.CAP_FC_007.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_007.page.MyPage;
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
    public void clickarComponenteDestacado() throws InterruptedException {
        page.clickarComponenteDestacado();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarContenido() throws InterruptedException {
        page.visualizarContenido();
    }

    @net.thucydides.core.annotations.Step
    public void mostrarApartado() throws InterruptedException {
        page.mostrarApartado();
    }

    @net.thucydides.core.annotations.Step
    public void ocultarApartado() throws InterruptedException{
        page.ocultarApartado();
    }

    @net.thucydides.core.annotations.Step
    public void descargarArchivo() throws InterruptedException{
        page.descargarArchivo();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException{
        page.clickarEnlace();
    }
}