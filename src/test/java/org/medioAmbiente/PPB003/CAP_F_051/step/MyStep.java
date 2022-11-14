package org.medioAmbiente.PPB003.CAP_F_051.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_051.page.MyPage;
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
    public void comprobarElementos() throws InterruptedException {
        page.comprobarElementos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEspaciosNaturales() throws InterruptedException {
        page.clickarEspaciosNaturales();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEquipamientos() throws InterruptedException {
        page.clickarEquipamientos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarActividades() throws InterruptedException {
        page.clickarActividades();
    }

}