package org.medioAmbiente.PPB007.CAP_FC_012.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/cae/")



public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[1]/a")
    private WebElementFacade Portal_Ambiental;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[2]/a")
    private WebElementFacade Portal_Caza;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[3]/a")
    private WebElementFacade Portal_CambioClimatico;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[4]/a")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[1]/a")
    private WebElementFacade Atencion_Ciudadania;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[2]/a")
    private WebElementFacade Tramites;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[3]/a")
    private WebElementFacade Herramientas_Centralizada;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[4]/a")
    private WebElementFacade Carpeta_Ciudadana;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[1]/a")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[2]/a")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[3]/a")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//li[1]/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//li[2]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[1]/a")
    private WebElementFacade Mapa_WEb;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[2]/a")
    private WebElementFacade Proteccion_Datos;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[3]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[4]/a")
    private WebElementFacade Condicion_Uso;


    public void clickarportalAmbiental() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Portal_Ambiental.click();
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

    public void clickarPortalCaza() throws InterruptedException{
        Portal_Caza.click();
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

    public void clickarCambioClimatico() throws InterruptedException{
        Portal_CambioClimatico.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Portal Andaluz de Cambio Climático')]")));
        getDriver().navigate().back();
    }

    public void clickarVentanVisitante() throws InterruptedException{
        Ventana_Visitante.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title=\"Ir a Ventana del Visitante\"])[1]")));
        getDriver().navigate().back();
    }

    public void clickarAtencionCiudadania()throws InterruptedException {
        Atencion_Ciudadania.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Portal Ambiental de Andalucía\"]")));
        getDriver().navigate().back();
    }

    public void clickarTramites()throws InterruptedException {
        Tramites.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Canal de Administración Electrónica\"]")));
        getDriver().navigate().back();
    }

    public void clickarHerramientas()throws InterruptedException {
        Herramientas_Centralizada.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"logotipo\"]")));
        getDriver().navigate().back();
    }

    public void clickarCarpetaCiudadana()throws InterruptedException {
        Carpeta_Ciudadana.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"block-terra-page-title\"]")));
        getDriver().navigate().back();
    }

    public void clickarTwitter() throws InterruptedException{
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

    public void clickarMapa() throws InterruptedException{
        Mapa_WEb.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Canal de Administración Electrónica\"]")));
        getDriver().navigate().back();
    }


    public void clickarAccesibilidad()throws InterruptedException {
        Accesibilidad.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Canal de Administración Electrónica\"]")));
        getDriver().navigate().back();
    }

    public void clickarProteccionDatos()throws InterruptedException {
        Proteccion_Datos.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Canal de Administración Electrónica\"]")));
        getDriver().navigate().back();
    }

    public void clickarCondicionesUso() throws InterruptedException {
        Condicion_Uso.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Canal de Administración Electrónica\"]")));

    }
}
