package org.medioAmbiente.PPB002.CAP_F_071.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_071.page.MyPage;
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
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("document.querySelector(\"#accept-cookies\").click();");
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException{
        page.visualizarSinSub();
    }
    @net.thucydides.core.annotations.Step
    public void visualizarSinImagen() throws InterruptedException{
        page.visualizarSinImagen();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException{
        page.visualizarSinTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFechaDesde() throws InterruptedException{
        page.visualizarSinFechaDesde();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDireccion() throws InterruptedException{
        page.visualizarSinDireccion();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinProvincia() throws InterruptedException{
        page.visualizarSinProvincia();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinPrograma() throws InterruptedException{
        page.visualizarSinPrograma();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDescarga() throws InterruptedException{
        page.visualizarSinDescarga();
    }

    @net.thucydides.core.annotations.Step
    public void vizualizaSinDestinatario()throws InterruptedException {
        page.vizualizaSinDestinatario();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinContacto() throws InterruptedException{
        page.visualizarSinContacto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinEnlace() throws InterruptedException{
        page.visualizarSinEnlace();
    }
}