package org.medioAmbiente.PPB002.CAP_F_099.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_099.page.MyPage;
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
    public void posicionarSobreMenu() throws InterruptedException {
        page.posicionarSobreMenu();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarSubmenu() throws InterruptedException {
        page.pulsarSubmenu();
    }

    @net.thucydides.core.annotations.Step
    public void validarNavegacion() throws InterruptedException {
        page.validarNavegacion();
    }

}