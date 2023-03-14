package org.medioAmbiente.PPB003.CAP_F_170.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_170.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        myPage.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 500)");
    }

    @net.thucydides.core.annotations.Step
    public void buscarPortexto() throws InterruptedException {
        myPage.buscarPortexto();
    }


    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        myPage.clickarBuscar();
    }
}