package org.medioAmbiente.PPB002.CAP_F_079.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_079.page.MyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


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

        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 700)");

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
        //Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException{
        //Thread.sleep(1000);
        page.visualizarSinSub();
        getDriver().navigate().back();

    }
    @net.thucydides.core.annotations.Step
    public void visualizarSinImagen() throws InterruptedException{

        page.visualizarSinImagen();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException{

        page.visualizarSinTexto();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        Thread.sleep(1000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFechaDesde() throws InterruptedException{

        page.visualizarSinFechaDesde();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDireccion() throws InterruptedException{

        page.visualizarSinDireccion();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinProvincia() throws InterruptedException{

        page.visualizarSinProvincia();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPrograma() throws InterruptedException{

        page.visualizarSinPrograma();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDescarga() throws InterruptedException{

        page.visualizarSinDescarga();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 600)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void vizualizaSinDestinatario()throws InterruptedException {

        page.vizualizaSinDestinatario();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinContacto() throws InterruptedException{

        page.visualizarSinContacto();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(1000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinEnlace() throws InterruptedException{

        page.visualizarSinEnlace();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(1000);

    }
}