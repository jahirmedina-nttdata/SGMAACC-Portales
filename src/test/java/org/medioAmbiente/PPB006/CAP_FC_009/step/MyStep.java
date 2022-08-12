package org.medioAmbiente.PPB006.CAP_FC_009.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_009.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 100)");
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCarrusel() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 980)");
        Thread.sleep(6000);
    }

    @net.thucydides.core.annotations.Step
    public void accederContenido() throws InterruptedException {
        page.accederContenido();
        Thread.sleep(3000);

    }

    @net.thucydides.core.annotations.Step
    public void validarTextoflotante() throws InterruptedException{
       getDriver().navigate().back();
       Thread.sleep(2000);
        page.validarTextoflotante();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBullet() throws InterruptedException{
        Thread.sleep(2000);
        page.clickarBullet();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarIzquierda() throws InterruptedException{
        Thread.sleep(2000);
        page.deslizarIzquierda();
    }
    @net.thucydides.core.annotations.Step
    public void deslizarDerecha() throws InterruptedException{
        Thread.sleep(2000);
        page.deslizarDerecha();
    }


}