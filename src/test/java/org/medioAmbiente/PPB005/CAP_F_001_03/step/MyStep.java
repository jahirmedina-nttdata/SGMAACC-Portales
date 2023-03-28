package org.medioAmbiente.PPB005.CAP_F_001_03.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB005.CAP_F_001_03.page.MyPage;
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
    public void mostrarMenu() throws InterruptedException {
        page.mostrarMenu();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarPunteroEnMenu() throws InterruptedException {
        page.posicionarPunteroEnMenu();
    }

    @net.thucydides.core.annotations.Step
    public void accedoAlSubmenu() throws InterruptedException {
        page.accedoAlSubmenu();
    }

}