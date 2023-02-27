package org.medioAmbiente.PPB006.CAP_F_053.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_F_053.page.MyPage;
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
    public void ubicarseEnLaSeccionTambienTePuedeInteresar() throws InterruptedException {
        page.ubicarseEnLaSeccionTambienTePuedeInteresar();
    }

    @net.thucydides.core.annotations.Step
    public void visualizaTitulo() throws InterruptedException {
        page.visualizaTitulo();
    }

    @net.thucydides.core.annotations.Step
    public void navegarEnElComponente() throws InterruptedException {
        page.navegarEnElComponente();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPunteroEnTexto() throws InterruptedException {
        page.posicionarPunteroEnTexto();
    }
}