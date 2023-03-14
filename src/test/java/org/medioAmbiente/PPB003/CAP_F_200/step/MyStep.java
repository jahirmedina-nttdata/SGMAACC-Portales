package org.medioAmbiente.PPB003.CAP_F_200.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_200.page.MyPage;
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
        j.executeScript("window.scrollBy(0, 50)");
    }

    @net.thucydides.core.annotations.Step
    public void escribirTextoBusqueda() throws InterruptedException {
        myPage.escribirTextoBusqueda();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarTipoEquipamiento() throws InterruptedException {
        myPage.seleccionarTipoEquipamiento();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarProvincia() throws InterruptedException {
        myPage.seleccionarProvincia();
    }

    @net.thucydides.core.annotations.Step
    public void clickarBuscar() throws InterruptedException {
        myPage.clickarBuscar();
    }
}