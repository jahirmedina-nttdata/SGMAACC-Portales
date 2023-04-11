package org.medioAmbiente.PPB003.CAP_F_167.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_167.page.MyPage;
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
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarTipoDeEspacio() throws InterruptedException {
        myPage.seleccionarTipoDeEspacio();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarNombreDeEspacio() throws InterruptedException {
        myPage.seleccionarNombreDeEspacio();
    }
    @net.thucydides.core.annotations.Step
    public void seleccionarProvincia() throws InterruptedException {
        myPage.seleccionarProvincia();
    }
    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        myPage.clickarBuscar();
    }

    @net.thucydides.core.annotations.Step
    public void validarResultado() throws InterruptedException {
        myPage.validarResultado();
    }
}