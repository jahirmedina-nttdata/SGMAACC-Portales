package org.medioAmbiente.PPB004.CAP_F_003.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_F_003.page.MyPage;
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
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarF050() throws InterruptedException{
        page.ejecutarF050();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarF051() throws InterruptedException{
        page.ejecutarF051();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarF052() throws InterruptedException{
        page.ejecutarF052();
    }

    @net.thucydides.core.annotations.Step
    public void ejecutarF053() throws InterruptedException, URISyntaxException {
        page.ejecutarF053();
    }
}