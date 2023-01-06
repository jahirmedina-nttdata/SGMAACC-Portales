package org.medioAmbiente.PPB007.CAP_FC_003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_FC_003.page.MyPage;
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
    public void visualizarContenido() throws InterruptedException {
        page.visualizarContenido();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPunteroEnTarjeta() throws InterruptedException {
        page.posicionarPunteroEnTarjeta();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTarjeta() throws InterruptedException {
        page.clickarTarjeta();
    }

    @net.thucydides.core.annotations.Step
    public void mostrarTextoFlotante() throws InterruptedException {
        page.mostrarTextoFlotante();
    }

    @net.thucydides.core.annotations.Step
    public void clickarVerMas() throws InterruptedException {
        page.clickarVerMas();
    }

}