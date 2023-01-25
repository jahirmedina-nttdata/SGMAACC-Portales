package org.medioAmbiente.PPB002.CAP_F_092.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_092.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class MyStep extends ScenarioSteps {

    private MyPage page;
    private String prntw;
    private String popwnd;
    //private String driver;
    public static WebDriver driver;

    @net.thucydides.core.annotations.Step
    public void cargandoNavegador() throws InterruptedException {
        page.open();
        getDriver().manage().window().maximize();
    }

    @net.thucydides.core.annotations.Step
    public void aceptarCookies() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void posicionarAreasTematicas() throws InterruptedException {
        page.posicionarAreasTematicas();
    }

    @net.thucydides.core.annotations.Step
    public void pulsarSubmenuAtmosfera() throws InterruptedException {
        page.pulsarSubmenuAtmosfera();
    }

    @net.thucydides.core.annotations.Step
    public void checkPlanificacion() throws InterruptedException {
        page.checkPlanificacion();
    }

    @net.thucydides.core.annotations.Step
    public void checkVisualizadores() throws InterruptedException {
        page.checkVisualizadores();
    }

    @net.thucydides.core.annotations.Step
    public void checkListados() throws InterruptedException {
        page.checkListados();
    }

    @net.thucydides.core.annotations.Step
    public void checkDatosTiempoReal() throws InterruptedException {
        page.checkDatosTiempoReal();
    }

    @net.thucydides.core.annotations.Step
    public void checkInformesyMemorias() throws InterruptedException {
        page.checkInformesyMemorias();
    }

    @net.thucydides.core.annotations.Step
    public void checkEstadisticas() throws InterruptedException {
        page.checkEstadisticas();
    }

    @net.thucydides.core.annotations.Step
    public void checkTodoslosFiltros() throws InterruptedException {
        page.checkTodoslosFiltros();
    }

}