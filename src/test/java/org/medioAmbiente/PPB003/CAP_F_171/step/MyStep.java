package org.medioAmbiente.PPB003.CAP_F_171.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_171.page.MyPage;
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
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarPaginador() throws InterruptedException {
        myPage.seleccionarPaginador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSigPag() throws InterruptedException {
        myPage.clickarSigPag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSigUltimaPag() throws InterruptedException {
        myPage.clickarSigUltimaPag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAntPag() throws InterruptedException {
        myPage.clickarAntPag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAntPrimerPag() throws InterruptedException {
        myPage.clickarAntPrimerPag();
    }
}