package org.medioAmbiente.PPB002.CAP_F_085.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_085.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;


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
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException, URISyntaxException {
        page.visualizarSinSub();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException, URISyntaxException {
        page.visualizarSinTexto();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTextominiatura() throws InterruptedException, URISyntaxException {
        page.visualizarSinTextominiatura();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinCreditos() throws InterruptedException, URISyntaxException {
        page.visualizarSinCreditos();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFichero() throws InterruptedException, URISyntaxException {
        page.visualizarSinFichero();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinUrl()throws InterruptedException, URISyntaxException {
        page.visualizarSinUrl();
    }

  //  @net.thucydides.core.annotations.Step
  //  public void visualizarSinImage() throws InterruptedException {
       // page.visualizarSinImage();
  //  }

    @net.thucydides.core.annotations.Step
    public void visualizarSinBliblioteca() throws InterruptedException, URISyntaxException{
        page.visualizarSinBliblioteca();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSerie() throws InterruptedException, URISyntaxException {
        page.visualizarSinSerie();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinActor() throws InterruptedException, URISyntaxException{
        page.visualizarSinActor();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinNotas() throws InterruptedException, URISyntaxException {
        page.visualizarSinNotas();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinArchivos() throws InterruptedException, URISyntaxException{
        page.visualizarSinArchivos();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDerechos() throws InterruptedException, URISyntaxException{
        page.visualizarSinDerechos();
    }

    @net.thucydides.core.annotations.Step
    public void clickarDercarga() throws InterruptedException, URISyntaxException{
        page.clickarDercarga();
    }

    @net.thucydides.core.annotations.Step
    public void clickarDocument() throws InterruptedException, URISyntaxException {
        page.clickarDocument();
    }

    @net.thucydides.core.annotations.Step
    public void clickarUrl() throws InterruptedException , URISyntaxException{
        page.clickarUrl();

    }

    @net.thucydides.core.annotations.Step
    public void clickarInteractivo() throws InterruptedException, URISyntaxException{
        page.clickarInteractivo();
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlaceBibli() throws InterruptedException, URISyntaxException{
        page.clickarEnlaceBibli();
    }
}