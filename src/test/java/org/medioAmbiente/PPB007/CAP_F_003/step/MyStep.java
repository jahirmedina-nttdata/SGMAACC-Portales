package org.medioAmbiente.PPB007.CAP_F_003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB007.CAP_F_003.page.MyPage;
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
    public void visualizarHeader() throws InterruptedException {
        page.visualizarHeader();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarMenuNavegacion() throws InterruptedException{
        page.visualizarMenuNavegacion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCaminoMigas() throws InterruptedException{
        page.visualizarCaminoMigas();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarFooter() throws InterruptedException{
        page.visualizarFooter();
    }
}