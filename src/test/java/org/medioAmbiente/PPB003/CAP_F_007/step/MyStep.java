package org.medioAmbiente.PPB003.CAP_F_007.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_007.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 500)");
    }

    @net.thucydides.core.annotations.Step
    public void compartirFacebook() throws InterruptedException {
        page.compartirFacebook();
    }

    @net.thucydides.core.annotations.Step
    public void compartirTwitter() throws InterruptedException {
        page.compartirTwitter();
    }

    @net.thucydides.core.annotations.Step
    public void compartirPinterest() throws InterruptedException {
        page.compartirPinterest();
    }

    @net.thucydides.core.annotations.Step
    public void compartirCorreo() throws InterruptedException {
        page.compartirCorreo();
    }

}