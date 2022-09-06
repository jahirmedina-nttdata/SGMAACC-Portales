package org.medioAmbiente.PPB002.CAP_F_093.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/guest/buscador-publicacion?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinfecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_searchTextInput\"]")
    private WebElementFacade txtbusquedad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinSubtitulo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinText;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinCredito;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinFichero;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//div[2]//div[2]/a")
    private WebElementFacade sinUrl;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinImage;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinSerie;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinautor;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinBliblioteca;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//div[2]//div[2]/a")
    private WebElementFacade sinNotas;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinArchivo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinDerecho;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade descarga;

    @FindBy(xpath = "//*[@id=\"dwnArchivo\"]")
    private WebElementFacade btndescarga;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade documento;

    @FindBy(xpath = "//*[@id=\"dwnDoc\"]")
    private WebElementFacade btndocumento;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade url;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_FytOUWH22K7t_3348136\"]//li[2]//img")
    private WebElementFacade btnUrl;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade interactivo;

    @FindBy(xpath = "//*[@id=\"dwnInterc\"]")
    private WebElementFacade btnInteractivo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade biblioteca;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_FytOUWH22K7t_3074891\"]//p/a/img\n")
    private WebElementFacade btnBiblioteca;

    public void visualizarSinFecha() throws InterruptedException {

        txtbusquedad.sendKeys("Aullidos" + "\n");
        sinfecha.click();

    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Lobezno" + "\n");
        sinSubtitulo.click();

    }


    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Mediterranean Forests" + "\n");
        sinText.click();
    }

    public void visualizarSinTextominiatura() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Recetario de comida" + "\n");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }


    public void visualizarSinCreditos() throws InterruptedException{
        txtbusquedad.clear();
        txtbusquedad.sendKeys("SIOSE Andalucía" + "\n");
        sinCredito.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinFichero() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Growing" + "\n");
        sinFichero.click();
    }

    public void visualizarSinUrl() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("La Gobernanza" + "\n");
        sinUrl.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinImage() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("emisiones a la atmósfera" + "\n");
        sinImage.click();
    }

    public void visualizarSinBliblioteca() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Agenda 21" + "\n");
        sinBliblioteca.click();
    }

    public void visualizarSinSerie() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aurora" + "\n");
        sinSerie.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinActor() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Jaén Renacentista" + "\n");
        sinautor.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinNotas() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Paisajes de Andalucía" + "\n");
        sinNotas.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinArchivos() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Geoparque" + "\n");
        sinArchivo.click();
    }

    public void visualizarSinDerechos() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Siente el Bosque" + "\n");
        sinDerecho.click();
    }

    public void clickarDercarga() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Entremijos" + "\n");
        descarga.click();
        btndescarga.click();
    }

    public void clickarDocument() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Cádiz y Málaga" + "\n");
        documento.click();
        btndocumento.click();
    }

    public void clickarUrl() throws InterruptedException{
        getDriver().navigate().back();
        Thread.sleep(1000);
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Cádiz y Málaga" + "\n");
        documento.click();
        btnUrl.click();
    }

    public void clickarInteractivo() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Málaga industrial" + "\n");
        interactivo.click();
        btnInteractivo.click();
    }

    public void clickarEnlaceBibli() throws InterruptedException {
        getDriver().navigate().back();
        Thread.sleep(1000);
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Nudibranquios" + "\n");
        biblioteca.click();
        btnBiblioteca.click();
    }
}
