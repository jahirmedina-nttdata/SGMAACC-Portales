package org.medioAmbiente.PPB003.CAP_F_202.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB003.CAP_F_202.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;


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
      //  j.executeScript("window.scrollBy(0, 700)");
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarMenu() throws InterruptedException {
        myPage.seleccionarMenu();
    }

    @net.thucydides.core.annotations.Step
    public void seleccionarSubmenu() throws InterruptedException {
        myPage.seleccionarSubmenu();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarActividadBuceo() throws InterruptedException {
        myPage.pulsarActividadBuceo();
    }


    @net.thucydides.core.annotations.Step
    public void visualizarCarrusel() throws InterruptedException {
        myPage.visualizarCarrusel();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarPausarCarrusel() throws InterruptedException {
        myPage.pulsarPausarCarrusel();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarReanudarCarrusel() throws InterruptedException {
        myPage.pulsarReanudarCarrusel();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarAnteriorImagen() throws InterruptedException {
        myPage.pulsarAnteriorImagen();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarCarruselalaDerecha() throws InterruptedException {
        myPage.deslizarCarruselalaDerecha();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarSiguienteImagen() throws InterruptedException {
        myPage.pulsarSiguienteImagen();
    }

    @net.thucydides.core.annotations.Step
    public void deslizarCarruselalaIzquierda() throws InterruptedException {
        myPage.deslizarCarruselalaIzquierda();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarIrAlaPrimeraImagen() throws InterruptedException {
        myPage.pulsarIrAlaPrimeraImagen();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarIrAlaUltimaImagen() throws InterruptedException {
        myPage.pulsarIrAlaUltimaImagen();
    }
}