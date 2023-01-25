package org.medioAmbiente.PPB002.CAP_F_093.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_093.page.MyPage;
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
    public void posicionarAreasTematicas() throws InterruptedException {
        page.posicionarAreasTematicas();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarSubmenuAtmosfera() throws InterruptedException {
        page.pulsarSubmenuAtmosfera();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarCalidadDelAire() throws InterruptedException {
        page.pulsarCalidadDelAire();
    }

    @net.thucydides.core.annotations.Step
    public void validarAcceso() throws InterruptedException {
        page.validarAcceso();
    }

}