package org.medioAmbiente.PPB004.CAP_FN_002.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB004.CAP_FN_002.page.MyPage;
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
    public void escriboUsuario(String usuario) throws InterruptedException {
        page.escriboUsuario(usuario);
    }

    @net.thucydides.core.annotations.Step
    public void escriboContraseña(String contraseña) throws InterruptedException {
        page.escriboContraseña(contraseña);
    }

    @net.thucydides.core.annotations.Step
    public void accesoPortalCazaPesca() throws InterruptedException, URISyntaxException {
        page.accesoPortalCazaPesca();
    }

    @net.thucydides.core.annotations.Step
    public void validarautenticacionPortal() throws InterruptedException {
        page.validarautenticacionPortal();
    }

}