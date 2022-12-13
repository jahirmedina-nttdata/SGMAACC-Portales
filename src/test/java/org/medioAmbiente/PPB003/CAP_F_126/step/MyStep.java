package org.medioAmbiente.PPB003.CAP_F_126.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_126.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        myPage.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
      //  j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void compartirEnFacebook() throws InterruptedException {
        myPage.compartirEnFacebook();
    }

    @net.thucydides.core.annotations.Step
    public void compartirEnTwitter() throws InterruptedException {
        myPage.compartirEnTwitter();
    }

    @net.thucydides.core.annotations.Step
    public void compartirEnPinterest() throws InterruptedException {
        myPage.compartirEnPinterest();
    }


    @net.thucydides.core.annotations.Step
    public void compartirPorCorreo() throws InterruptedException {
        myPage.compartirPorCorreo();
    }
}