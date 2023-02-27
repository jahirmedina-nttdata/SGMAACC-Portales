package org.medioAmbiente.PPB006.CAP_F_003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_F_003.page.MyPage;
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
    public void visualizarCAPF103() throws InterruptedException {
        page.visualizarCAPF103();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF114() throws InterruptedException {
        page.visualizarCAPF114();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCAPF113() throws InterruptedException {
        page.visualizarCAPF113();
    }
    @net.thucydides.core.annotations.Step
    public void visualizarCAPF115() throws InterruptedException {
        page.visualizarCAPF115();
    }
}