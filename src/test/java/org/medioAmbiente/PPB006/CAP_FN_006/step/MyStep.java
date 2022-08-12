package org.medioAmbiente.PPB006.CAP_FN_006.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FN_006.page.MyPage;
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
        Thread.sleep(3000);
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC02() throws InterruptedException {
        page.visualizarCAPFC02();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC03() throws InterruptedException {
        page.visualizarCAPFC03();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPFC04() throws InterruptedException {
        Thread.sleep(4000);
    }


}