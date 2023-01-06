package org.medioAmbiente.PPB002.CAP_F_005.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_005.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;


public class MyStep extends ScenarioSteps {

    private MyPage page;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
       getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void seccionInformacionAmbientalAndalucia() throws InterruptedException {
        page.seccionInformacionAmbientalAndalucia();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlace() throws InterruptedException {
        page.clickarEnlace();
    }


}