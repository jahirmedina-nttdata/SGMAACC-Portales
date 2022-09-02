package org.medioAmbiente.PPB001.CAP_F_087.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_087.page.MyPage;
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
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        //j.executeScript("window.scrollBy(0, 50)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarFicha() throws InterruptedException {
        myPage.seleccionarFicha();
    }

    @net.thucydides.core.annotations.Step
    public void validarNoticia() throws InterruptedException {
        myPage.validarNoticia();
    }
}