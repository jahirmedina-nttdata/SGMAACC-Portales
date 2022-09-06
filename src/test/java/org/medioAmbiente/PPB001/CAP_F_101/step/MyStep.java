package org.medioAmbiente.PPB001.CAP_F_101.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_101.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 200)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarTipoEspacio() throws InterruptedException {
        myPage.seleccionarTipoEspacio();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarProvincia() throws InterruptedException {
        myPage.seleccionarProvincia();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarCategoria() throws InterruptedException {
        myPage.seleccionarCategoria();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarArchivo() throws InterruptedException {
        myPage.seleccionarArchivo();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        myPage.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void validarBusqueda() throws InterruptedException {
        myPage.validarBusqueda();
    }
}