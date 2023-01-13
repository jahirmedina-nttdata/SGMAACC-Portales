package org.medioAmbiente.PPB003.CAP_F_066.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_066.page.MyPage;
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
    public void visualizarTitulo() throws InterruptedException {
        page.visualizarTitulo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarTexto() throws InterruptedException {
        page.visualizarTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarImagen() throws InterruptedException {
        page.visualizarImagen();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarCampoFecha() throws InterruptedException {
        page.visualizarCampoFecha();
    }

    @net.thucydides.core.annotations.Step
    public void compartirPorFacebook() throws InterruptedException {
        page.compartirPorFacebook();
    }

    @net.thucydides.core.annotations.Step
    public void compartirPorTwitter() throws InterruptedException {
        page.compartirPorTwitter();
    }

    @net.thucydides.core.annotations.Step
    public void compartirPorPinterest() throws InterruptedException {
        page.compartirPorPinterest();
    }

    @net.thucydides.core.annotations.Step
    public void compartirPorCorreo() throws InterruptedException {
        page.compartirPorCorreo();
    }


}