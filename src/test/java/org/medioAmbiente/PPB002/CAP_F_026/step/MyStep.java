package org.medioAmbiente.PPB002.CAP_F_026.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_026.page.MyPage;
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
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void comprobarFuncionamientoCarrusel() throws InterruptedException {
        page.comprobarFuncionamientoCarrusel();
    }

    @net.thucydides.core.annotations.Step
    public void comprobarFuncionamientoListado() throws InterruptedException {
        page.comprobarFuncionamientoListado();
    }

    @net.thucydides.core.annotations.Step
    public void comprobarFuncionamientoFiltros() throws InterruptedException {
        page.comprobarFuncionamientoFiltros();
    }

}