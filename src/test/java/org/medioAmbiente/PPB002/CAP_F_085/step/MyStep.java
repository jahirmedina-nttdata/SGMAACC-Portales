package org.medioAmbiente.PPB002.CAP_F_085.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_085.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;

    @net.thucydides.core.annotations.Step
    public void cargarPagina() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
        j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException {
        page.visualizarSinSub();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException {
        page.visualizarSinTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTextominiatura() throws InterruptedException {
        page.visualizarSinTextominiatura();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinVideo() throws InterruptedException {
        page.visualizarSinVideo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinnotas() throws InterruptedException {
        page.visualizarSinnotas();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinautor() throws InterruptedException {
        page.visualizarSinautor();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinderecho() throws InterruptedException {
        page.visualizarSinderecho();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarvideo() throws InterruptedException {
        page.visualizarvideo();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSindireccion() throws InterruptedException {
        page.visualizarSindireccion();
    }
}