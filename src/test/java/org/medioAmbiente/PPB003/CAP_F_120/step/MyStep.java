package org.medioAmbiente.PPB003.CAP_F_120.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_120.page.MyPage;
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
    public void seleccionarMenu() throws InterruptedException {
        myPage.seleccionarMenu();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarSubmenu() throws InterruptedException {
        myPage.seleccionarSubmenu();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarParqueNatural() throws InterruptedException {
        myPage.seleccionarParqueNatural();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarSierradeAracenayPicosdeAroche() throws InterruptedException {
        myPage.seleccionarSierradeAracenayPicosdeAroche();
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
    public void pulsarLimpiar() throws InterruptedException {
        myPage.pulsarLimpiar();
    }
}