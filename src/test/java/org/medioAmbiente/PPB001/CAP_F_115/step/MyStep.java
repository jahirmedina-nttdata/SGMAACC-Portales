package org.medioAmbiente.PPB001.CAP_F_115.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_115.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;


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
    public void clickarLupa() throws InterruptedException {
        page.clickarLupa();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarCorrespondenciaCualquiera() throws InterruptedException {
        page.seleccionarCorrespondenciaCualquiera();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorUsuarioCreador() throws InterruptedException {
        page.buscarPorUsuarioCreador();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarEstadoBorrador() throws InterruptedException {
        page.seleccionarEstadoBorrador();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        page.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void validarBusqueda() throws InterruptedException {
        page.validarBusqueda();
    }
}