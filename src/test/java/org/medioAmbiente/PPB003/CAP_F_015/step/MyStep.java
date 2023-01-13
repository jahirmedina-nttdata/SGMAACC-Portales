package org.medioAmbiente.PPB003.CAP_F_015.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_015.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.net.URISyntaxException;


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
        //j.executeScript("window.scrollBy(0, 500)");
    }

    @net.thucydides.core.annotations.Step
    public void autenticarUsuario() throws InterruptedException {
        page.autenticarUsuario();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarCAPF003() throws InterruptedException, URISyntaxException {
        page.ejecutarCAPF003();
    }

    @net.thucydides.core.annotations.Step
    public void consultarRenpaParaValidarFechaDeclaracion() throws InterruptedException {
        page.consultarRenpaParaValidarFechaDeclaracion();
    }

    @net.thucydides.core.annotations.Step
    public void consultarRenpaParaValidarMunicipio() throws InterruptedException {
        page.consultarRenpaParaValidarMunicipio();
    }

    @net.thucydides.core.annotations.Step
    public void consultarRenpaParaValidarSuperficieTotal() throws InterruptedException {
        page.consultarRenpaParaValidarSuperficieTotal();
    }
}