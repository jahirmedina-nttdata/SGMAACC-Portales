package org.medioAmbiente.PPB001.CAP_F_057.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_057.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 100)");
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
    public void clickarBuscar() throws InterruptedException {
        myPage.clickarBuscar();
    }
}