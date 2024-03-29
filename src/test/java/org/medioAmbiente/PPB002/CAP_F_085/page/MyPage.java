package org.medioAmbiente.PPB002.CAP_F_085.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/guest/buscador-videos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinfecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_searchTextInput\"]")
    private WebElementFacade txtbusquedad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[2]//div[2]/a")
    private WebElementFacade sinSubtitulo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinText;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinNotas;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinAutor;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinDerecho;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[2]/a")
    private WebElementFacade BtnVideo;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PmKROClys4I4_3065973\"]//video")
    private WebElementFacade Btnplay;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_RBLh8ZKfwq6q_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinDireccion;


    public void visualizarSinFecha() throws InterruptedException {

        txtbusquedad.sendKeys("satisfacción del Sistema Andaluz" + "\n");
        sinfecha.click();

    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Carbono Municipal" + "\n");
        sinSubtitulo.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");

    }

    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Parques y la red natura" + "\n");
        sinText.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinTextominiatura() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Agua y cambio climático" + "\n");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinVideo() throws InterruptedException {
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Proyecto de Educación Ambiental" + "\n");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinnotas() throws InterruptedException {
        txtbusquedad.clear();
        txtbusquedad.sendKeys("GPP4Growth" + "\n");
        sinNotas.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinautor() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Día Mundial del Suelo" + "\n");
        sinAutor.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinderecho() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Sierra de las Nieves" + "\n");
        sinDerecho.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarvideo() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("El Palmer" + "\n");
        BtnVideo.click();
        Btnplay.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
    }

    public void visualizarSindireccion() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("El IMA" + "\n");
        sinDireccion.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }
}
