package org.medioAmbiente.PPB002.CAP_F_017.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_017.page.MyPage;
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
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void ubicarseEnListado() throws InterruptedException {
        page.ubicarseEnListado();
    }

    @net.thucydides.core.annotations.Step
    public void posicionarCursosEnListado() throws InterruptedException {
        page.posicionarCursosEnListado();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnColabora() throws InterruptedException {
        page.clickarEnColabora();
    }
}