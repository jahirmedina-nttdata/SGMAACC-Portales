package org.medioAmbiente.PPB004.CAP_FN_004.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FN_004.page.MyPage;
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
    public void mostrarBuscador() throws InterruptedException {
       Thread.sleep(5000);
    }

    @net.thucydides.core.annotations.Step
    public void buscarPortexto() throws InterruptedException {
        page.buscarPortexto();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        page.clickarEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFN05()throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/buscador");
        page.visualizarCAPFN05();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC020()throws InterruptedException {
        page.visualizarCAPFC020();
    }
}