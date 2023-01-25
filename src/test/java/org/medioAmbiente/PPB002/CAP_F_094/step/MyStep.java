package org.medioAmbiente.PPB002.CAP_F_094.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_094.page.MyPage;
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
    public void posicionarServicios() throws InterruptedException {
        page.posicionarServicios();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBlibliotecaPublicacionesyMultimedia() throws InterruptedException {
        page.clickarBlibliotecaPublicacionesyMultimedia();
    }

    @net.thucydides.core.annotations.Step
    public void clickarInformesPeriodicos() throws InterruptedException {
        page.clickarInformesPeriodicos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarInformeMA() throws InterruptedException {
        page.clickarInformeMA();
    }

    @net.thucydides.core.annotations.Step
    public void clickarInformeMA2020() throws InterruptedException {
        page.clickarInformeMA2020();
    }

    @net.thucydides.core.annotations.Step
    public void clickarDescargarPDF() throws InterruptedException {
        page.clickarDescargarPDF();
    }

}