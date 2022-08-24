package org.medioAmbiente.PPB003.CAP_F_057.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/")



public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;


    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/figure/a/img")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[1]/a/img")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[2]/a/img")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[3]/a/img")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[1]/div/figure[4]/a/img")
    private WebElementFacade Pinterest;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[2]/figure[2]/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[2]/figure[1]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[1]/a")
    private WebElementFacade Conocenos;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[7]/a")
    private WebElementFacade Contacto;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[2]/a")
    private WebElementFacade Enlace_Interes;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[3]/a")
    private WebElementFacade Mapa_Web;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[4]/a")
    private WebElementFacade Manuales;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[5]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"footer\"]//p[6]/a")
    private WebElementFacade Condiciones_Uso;


    public void clickarVentanVisitante() throws InterruptedException{
        Ventana_Visitante.click();
    }

    public void clickarTwitter() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Twitter.click();
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

    public void clickarFacebook() throws InterruptedException {
        Facebook.click();
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

    public void clickarInstagram() throws InterruptedException {
        Instagram.click();
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

    public void clickarPinterest() throws InterruptedException {
        Pinterest.click();
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

    public void clikarlogoJunta() throws InterruptedException{
        Logo_Junta.click();
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

    public void clickarlogoUnion() throws InterruptedException {
        Logo_Union.click();
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

    public void clickarConocenos() throws InterruptedException{
        Conocenos.click();
    }

    public void clickarContacto() throws InterruptedException{
        getDriver().navigate().back();
        Contacto.click();
    }

    public void clickarEnlacesInteres() throws InterruptedException{
        getDriver().navigate().back();
        Enlace_Interes.click();
    }
    public void clickarMapa() throws InterruptedException{
        getDriver().navigate().back();
        Mapa_Web.click();
    }

    public void clickarManuales() throws InterruptedException{
        getDriver().navigate().back();
        Manuales.click();
    }

    public void clickarAccesibilidad()throws InterruptedException {
        getDriver().navigate().back();
        Accesibilidad.click();
    }

    public void clickarCondicionesUso() throws InterruptedException {
        getDriver().navigate().back();
        Condiciones_Uso.click();
    }
}
