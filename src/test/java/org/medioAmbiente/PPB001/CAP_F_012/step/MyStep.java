package org.medioAmbiente.PPB001.CAP_F_012.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB001.CAP_F_012.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;


public class MyStep extends ScenarioSteps {

    private MyPage myPage;

    private String prntw;
    private String popwnd;

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
    public void buscarPorTexto() throws InterruptedException {
        myPage.buscarPorTexto();
    }

    @net.thucydides.core.annotations.Step
    public void accederContenido() throws InterruptedException {
        myPage.accederContenido();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorFecha() throws InterruptedException {
        myPage.buscarPorFecha();
    }

    @net.thucydides.core.annotations.Step
    public void buscarPorTema() throws InterruptedException {
        myPage.buscarPorTema();
    }
}