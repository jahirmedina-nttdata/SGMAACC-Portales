package org.medioAmbiente.PPB004.CAP_FN_003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FN_003.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage page;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarFC01() throws InterruptedException{
        page.ejecutarFC01();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarFC02() throws InterruptedException{
        page.ejecutarFC02();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarFC03() throws InterruptedException{
        page.ejecutarFC03();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarFC04() throws InterruptedException{
        page.ejecutarFC04();
    }
}