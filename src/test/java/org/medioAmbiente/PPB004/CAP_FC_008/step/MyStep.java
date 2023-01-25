package org.medioAmbiente.PPB004.CAP_FC_008.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FC_008.page.MyPage;
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
    public void mostrarCarrusel() throws InterruptedException  {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
    }

    @net.thucydides.core.annotations.Step
    public void clickarBullets() throws InterruptedException {
        page.clickarBullets();
    }

    @net.thucydides.core.annotations.Step
    public void puntearCard() throws InterruptedException {
        page.puntearCard();
    }

    @net.thucydides.core.annotations.Step
    public void moverIzquierda() throws InterruptedException {
      page.moverIzquierda();
    }
    @net.thucydides.core.annotations.Step
    public void moverDerecha() throws InterruptedException {
        page.moverDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnuncio()throws InterruptedException {
        page.clickarAnuncio();
    }

    @net.thucydides.core.annotations.Step
    public void puntearVertodo() throws InterruptedException {
        page.puntearVertodo();
    }

    @net.thucydides.core.annotations.Step
    public void clickarVertodo()throws InterruptedException {
        page.clickarVertodo();
    }


}