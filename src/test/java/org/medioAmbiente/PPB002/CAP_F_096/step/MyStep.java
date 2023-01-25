package org.medioAmbiente.PPB002.CAP_F_096.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_096.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;
    //private String driver;
    public static WebDriver driver;

    @net.thucydides.core.annotations.Step
    public void cargandoNavegador() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void ubicarseApartado() throws InterruptedException {
        page.ubicarseApartado();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPuntero() throws InterruptedException {
        page.posicionarPuntero();
    }

    @net.thucydides.core.annotations.Step
    public void arrastrarAlaIzquierda() throws InterruptedException {
        page.arrastrarAlaIzquierda();
    }

    @net.thucydides.core.annotations.Step
    public void arrastrarAlaDerecha() throws InterruptedException {
        page.arrastrarAlaDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void clickarFlechaDerecha() throws InterruptedException {
        page.clickarFlechaDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void clickarFlechaIzquierda() throws InterruptedException {
        page.clickarFlechaIzquierda();
    }

    @net.thucydides.core.annotations.Step
    public void accederEnlace() throws InterruptedException {
        page.accederEnlace();
    }

    @net.thucydides.core.annotations.Step
    public void validarAccesoCorrecto() throws InterruptedException {
        page.validarAccesoCorrecto();
    }

}