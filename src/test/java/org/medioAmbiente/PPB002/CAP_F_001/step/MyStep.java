package org.medioAmbiente.PPB002.CAP_F_001.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_001.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage page;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }


    public void escribimosUsuario(String usuario) throws InterruptedException {
        page.escribimosUsuario(usuario);
    }

    public void escribimosContraseña(String contraseña) throws InterruptedException {
        page.escribimosContraseña(contraseña);
    }

    public void clickAcceder() throws InterruptedException {
        page.clickAcceder();
    }


    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        //  j.executeScript("window.scrollBy(0, 700)");
    }
}