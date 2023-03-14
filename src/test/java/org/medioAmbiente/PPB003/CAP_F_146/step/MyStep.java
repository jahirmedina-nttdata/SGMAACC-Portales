package org.medioAmbiente.PPB003.CAP_F_146.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_146.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 100)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarPaginador5() throws InterruptedException {
        myPage.seleccionarPaginador5();
    }


    @net.thucydides.core.annotations.Step
    public void clickarSiguientePag() throws InterruptedException {
        myPage.clickarSiguientePag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarSiguienteUltimaPag() throws InterruptedException {
        myPage.clickarSiguienteUltimaPag();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnterior() throws InterruptedException {
        myPage.clickarAnterior();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        myPage.clickarAnteriorPrimeraPag();
    }
}