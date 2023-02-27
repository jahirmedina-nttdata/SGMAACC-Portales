package org.medioAmbiente.PPB007.CAP_F_037.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_037.page.MyPage;
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
    public void clickarLogoJunta() throws InterruptedException {
        page.clickarLogoJunta();
    }

    @net.thucydides.core.annotations.Step
    public void clickarLogoPortalCazaPesca() throws InterruptedException {
        page.clickarLogoPortalCazaPesca();
    }


    @net.thucydides.core.annotations.Step
    public void validarTextFlotante() throws InterruptedException{
        page.validarTextFlotante();
    }

}