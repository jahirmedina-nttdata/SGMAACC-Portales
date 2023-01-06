package org.medioAmbiente.PPB005.CAP_F_001_01.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB005.CAP_F_001_01.page.MyPage;
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
    public void escribimosUsuario(String usuario) throws InterruptedException {
        page.escribimosUsuario(usuario);
    }

    @net.thucydides.core.annotations.Step
    public void escribimosContraseña(String contraseña) throws InterruptedException {
        page.escribimosContraseña(contraseña);
    }

    @net.thucydides.core.annotations.Step
    public void clickAcceder() throws InterruptedException, URISyntaxException {
        page.clickAcceder();
    }

}