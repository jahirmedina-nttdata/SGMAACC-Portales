package org.medioAmbiente.PPB002.CAP_F_002_05.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_002_05.page.MyPage;
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
    public void acceptCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 100)");

    }


    @net.thucydides.core.annotations.Step
    public void ubicarDirectoA() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 900)");

    }
    @net.thucydides.core.annotations.Step
    public void clickarPortalCazaPesca() throws InterruptedException {
        page.clickarPortalCazaPesca();

    }

    @net.thucydides.core.annotations.Step
    public void clickarPortalAndaluz() throws InterruptedException {
        page.clickarPortalAndaluz();

    }

    @net.thucydides.core.annotations.Step
    public void clickarVentanaVisitante() throws InterruptedException {
        page.clickarVentanaVisitante();

    }

    @net.thucydides.core.annotations.Step
    public void clickarCanalAdministrativoElectronica() throws InterruptedException {
        page.clickarCanalAdministrativoElectronica();

    }

}