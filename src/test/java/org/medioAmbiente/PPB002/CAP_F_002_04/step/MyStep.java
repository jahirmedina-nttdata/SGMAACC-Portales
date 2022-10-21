package org.medioAmbiente.PPB002.CAP_F_002_04.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_002_04.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;
    //private String driver;
    public static WebDriver driver;


    @net.thucydides.core.annotations.Step
    public void cargandoPortal() throws InterruptedException {
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
    public void ubicarNoticia() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");

    }

    @net.thucydides.core.annotations.Step
    public void deslizarnoticia() throws InterruptedException {
        page.deslizarnoticia();

    }

    @net.thucydides.core.annotations.Step
    public void clickarNoticia() throws InterruptedException{
        page.clickarNoticia();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCategoriaNoti() throws InterruptedException{
        page.clickarcategoria();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTodos() throws InterruptedException{
        page.clickarTodos();

    }
}