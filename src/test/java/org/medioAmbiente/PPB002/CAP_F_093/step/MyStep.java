package org.medioAmbiente.PPB002.CAP_F_093.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB002.CAP_F_093.page.MyPage;
import org.openqa.selenium.JavascriptExecutor;

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
        j.executeScript("window.scrollBy(0, 700)");

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFecha() throws InterruptedException {
        page.visualizarSinFecha();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSub() throws InterruptedException {

        page.visualizarSinSub();
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTexto() throws InterruptedException {
        page.visualizarSinTexto();
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinTextominiatura() throws InterruptedException {
        page.visualizarSinTextominiatura();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(3000);
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinCreditos() throws InterruptedException {
        page.visualizarSinCreditos();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinFichero() throws InterruptedException {
        page.visualizarSinFichero();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinUrl()throws InterruptedException {
        page.visualizarSinUrl();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinImage() throws InterruptedException {
        page.visualizarSinImage();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinBliblioteca() throws InterruptedException{
        page.visualizarSinBliblioteca();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinSerie() throws InterruptedException {
        page.visualizarSinSerie();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinActor() throws InterruptedException{
        page.visualizarSinActor();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinNotas() throws InterruptedException {
        page.visualizarSinNotas();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinArchivos() throws InterruptedException{
        page.visualizarSinArchivos();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void visualizarSinDerechos() throws InterruptedException{
        page.visualizarSinDerechos();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarDercarga() throws InterruptedException{
        page.clickarDercarga();
        Thread.sleep(8000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarDocument() throws InterruptedException {
        page.clickarDocument();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(1000);

    }

    @net.thucydides.core.annotations.Step
    public void clickarUrl() throws InterruptedException {
        getDriver().navigate().back();
        page.clickarUrl();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
        Thread.sleep(3000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarInteractivo() throws InterruptedException{
        page.clickarInteractivo();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(1000);
    }

    @net.thucydides.core.annotations.Step
    public void clickarEnlaceBibli() throws InterruptedException{
        getDriver().navigate().back();
        page.clickarEnlaceBibli();
        Thread.sleep(2000);
    }
}