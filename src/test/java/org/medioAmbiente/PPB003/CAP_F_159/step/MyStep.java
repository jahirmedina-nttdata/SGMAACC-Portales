package org.medioAmbiente.PPB003.CAP_F_159.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_159.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        myPage.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
      //  j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarMenuPublicaciones() throws InterruptedException {
        myPage.seleccionarMenuPublicaciones();
    }


    @net.thucydides.core.annotations.Step
    public void buscarPorTexto() throws InterruptedException {
        myPage.buscarPorTexto();
    }


    @net.thucydides.core.annotations.Step
    public void pulsarBuscar() throws InterruptedException {
        myPage.pulsarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void validarBusqueda() throws InterruptedException {
        myPage.validarBusqueda();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarFormatoPDF() throws InterruptedException {
        myPage.pulsarFormatoPDF();
    }
}