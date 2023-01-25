package org.medioAmbiente.PPB003.CAP_F_095.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_095.page.MyPage;
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
    public void autenticarUsuario() throws InterruptedException {
        page.autenticarUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void accederContenidoWeb() throws InterruptedException {
        page.accederContenidoWeb();
    }

    @net.thucydides.core.annotations.Step
    public void accederCarpetaAvisos() throws InterruptedException {
        page.accederCarpetaAvisos();
    }

    @net.thucydides.core.annotations.Step
    public void copiarResumenADescripcion() throws InterruptedException {
        page.copiarResumenADescripcion();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPublicar() throws InterruptedException {
        page.clickarPublicar();
    }

    @net.thucydides.core.annotations.Step
    public void validarCambio() throws InterruptedException {
        page.validarCambio();
    }

    @net.thucydides.core.annotations.Step
    public void copiarDescripcionAResumen() throws InterruptedException {
        page.copiarDescripcionAResumen();
    }
}