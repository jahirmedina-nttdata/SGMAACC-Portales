package org.medioAmbiente.PPB002.CAP_F_085.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_085.page.MyPage;
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
        Thread.sleep(3000);
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
    public void visualizarSinTexto() throws InterruptedException {
        page.visualizarSinTexto();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTextominiatura() throws InterruptedException {
        page.visualizarSinTextominiatura();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(3000);
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinVideo() throws InterruptedException {
        page.visualizarSinVideo();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(3000);
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinnotas() throws InterruptedException {
        page.visualizarSinnotas();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinautor() throws InterruptedException {
        page.visualizarSinautor();
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
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarvideo() throws InterruptedException {
        page.visualizarvideo();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Thread.sleep(5000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSindireccion() throws InterruptedException {
        page.visualizarSindireccion();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);

    }
}