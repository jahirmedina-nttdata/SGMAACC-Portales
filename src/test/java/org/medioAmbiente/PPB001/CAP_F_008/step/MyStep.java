package org.medioAmbiente.PPB001.CAP_F_008.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_008.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;


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
    public void cambiarIdioma() throws InterruptedException {
        myPage.cambiarIdioma();
    }

    @net.thucydides.core.annotations.Step
    public void validarTraduccion() throws InterruptedException {
        myPage.validarTraduccion();
    }
}