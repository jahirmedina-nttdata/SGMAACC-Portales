package org.medioAmbiente.PPB002.CAP_F_080.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_080.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();

    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {

        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 700)");

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException {

        page.visualizarSinSub();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinImagen() throws InterruptedException {

        page.visualizarSinImagen();
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPie() throws InterruptedException {
        page.visualizarSinPie();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException {

        page.visualizarSinTexto();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinAutor() throws InterruptedException {
        page.visualizarSinAutor();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinlocalizacion() throws InterruptedException {
        page.visualizarSinlocalizacion();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinderecho() throws InterruptedException {
        page.visualizarSinderecho();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);

    }
}