package org.medioAmbiente.PPB006.CAP_FC_013.step;

import net.thucydides.core.steps.ScenarioSteps;
import org.medioAmbiente.PPB006.CAP_FC_013.page.MyPage;
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
    }

    @net.thucydides.core.annotations.Step
    public void clickarportalAmbiental() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        page.clickarportalAmbiental();
        Thread.sleep(2000);
        getDriver().navigate().back();

    }

    @net.thucydides.core.annotations.Step
    public void clickarportalCaza() throws InterruptedException{
        page.clickarportalCaza();
        Thread.sleep(2000);
        getDriver().navigate().back();


    }

    @net.thucydides.core.annotations.Step
    public void clickarVentanVisitante() throws InterruptedException {
        page.clickarVentanVisitante();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCanalAdministracion() throws InterruptedException {
        page.clickarCanalAdministracion();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void planAndaluz() throws InterruptedException {
        page.planAndaluz();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarPreguntasFrecuente() throws InterruptedException{
        page.clickarPreguntasFrecuente();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarTwitter() throws InterruptedException{
        page.clickarTwitter();

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
    }

    @net.thucydides.core.annotations.Step
    public void clickarFacebook() throws InterruptedException{
        page.clickarFacebook();

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
    }

    @net.thucydides.core.annotations.Step
    public void clickarInstagram() throws InterruptedException{
        page.clickarInstagram();

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
    }

    @net.thucydides.core.annotations.Step
    public void clikarlogoJunta() throws InterruptedException{

        page.clikarlogoJunta();

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
    }

    @net.thucydides.core.annotations.Step
    public void clickarlogoUnion() throws InterruptedException {
        page.clickarlogoUnion();

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
    }

    @net.thucydides.core.annotations.Step
    public void clickarMapa() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        page.clickarMapa();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarAccesibilidad() throws InterruptedException {
        page.clickarAccesibilidad();
        Thread.sleep(2000);
        getDriver().navigate().back();
    }

    @net.thucydides.core.annotations.Step
    public void clickarCondicionesUso() throws InterruptedException {
        page.clickarCondicionesUso();
        Thread.sleep(2000);

    }

}


