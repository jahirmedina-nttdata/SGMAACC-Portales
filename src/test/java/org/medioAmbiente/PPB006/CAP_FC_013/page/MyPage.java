package org.medioAmbiente.PPB006.CAP_FC_013.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[1]/a")
    private WebElementFacade Portal_Ambiental;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[2]/a")
    private WebElementFacade Portal_Caza;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[3]/a")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[4]/a")
    private WebElementFacade Canal_Admin;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rc3N7\"]//ul/li[1]/a")
    private WebElementFacade Plan_Andaluz;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rc3N7\"]//ul/li[2]/a")
    private WebElementFacade Preguntas_Frecuentes;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[1]/a/img")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[2]/a/img")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[3]/a/img")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//ul/li[1]/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//ul/li[2]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[1]/a")
    private WebElementFacade Mapa_WEb;


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[3]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[4]/a")
    private WebElementFacade Condicion_Uso;


    public void clickarportalAmbiental() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Portal_Ambiental.click();
        getDriver().navigate().back();
    }

    public void clickarportalCaza() throws InterruptedException{
        Portal_Caza.click();
        getDriver().navigate().back();
    }

    public void clickarVentanVisitante() throws InterruptedException{
        Ventana_Visitante.click();
        getDriver().navigate().back();
    }

    public void clickarCanalAdministracion()throws InterruptedException {
        Canal_Admin.click();
        getDriver().navigate().back();
    }

    public void planAndaluz() throws InterruptedException {
        Plan_Andaluz.click();
        getDriver().navigate().back();
    }

    public void clickarPreguntasFrecuente() throws InterruptedException {
        Preguntas_Frecuentes.click();
        getDriver().navigate().back();
    }

    public void clickarTwitter() throws InterruptedException{
        Twitter.click();
    }

    public void clickarFacebook() throws InterruptedException {
        Facebook.click();
    }

    public void clickarInstagram() throws InterruptedException {
        Instagram.click();
    }

    public void clikarlogoJunta() throws InterruptedException{
        Logo_Junta.click();
    }

    public void clickarlogoUnion() throws InterruptedException {
        Logo_Union.click();
    }

    public void clickarMapa() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Mapa_WEb.click();
        getDriver().navigate().back();
    }


    public void clickarAccesibilidad()throws InterruptedException {
        Accesibilidad.click();
        getDriver().navigate().back();
    }

    public void clickarCondicionesUso() throws InterruptedException {
        Condicion_Uso.click();
    }
}
