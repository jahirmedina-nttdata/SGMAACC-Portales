package org.medioAmbiente.PPB007.CAP_FC_004.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_FC_004.page.MyPage;
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
    public void visualizarElementos() throws InterruptedException {
        page.visualizarElementos();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPunteroEnElemento() throws InterruptedException {
        page.posicionarPunteroEnElemento();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException {
        page.clickarEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void mostrarTextoFlotante() throws InterruptedException {
        page.mostrarTextoFlotante();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPunteroEnBotonCarpetaCiudadana() throws InterruptedException {
        page.posicionarPunteroEnBotonCarpetaCiudadana();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBotonCarpetaCiudadana() throws InterruptedException {
        page.clickarBotonCarpetaCiudadana();
    }

}