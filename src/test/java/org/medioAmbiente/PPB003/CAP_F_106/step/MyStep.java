package org.medioAmbiente.PPB003.CAP_F_106.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_106.page.MyPage;
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
    public void buscarEspacioNatural() throws InterruptedException {
        page.buscarEspacioNatural();
    }
    @net.thucydides.core.annotations.Step
    public void Visualizar_Paginador() throws InterruptedException {
        page.Visualizar_Paginador();
    }
    @net.thucydides.core.annotations.Step
    public void seleccionarPaginador() throws InterruptedException {
        page.seleccionarPaginador();
    }
}