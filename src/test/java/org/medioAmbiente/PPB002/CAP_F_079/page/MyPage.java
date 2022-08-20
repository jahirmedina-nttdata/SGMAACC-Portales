package org.medioAmbiente.PPB002.CAP_F_079.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/guest/buscador-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]/div/div/div[1]//div[2]/a")
    private WebElementFacade sinfecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_searchTextInput\"]")
    private WebElementFacade txtbusquedad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_searchButton\"]")
    private WebElementFacade btnbuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinSub;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinimage;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]//div[2]/a")
    private WebElementFacade sintxt;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinfechadesde;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sindirec;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinprovincia;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/div/div[2]/a")
    private WebElementFacade sinprograma;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/div/div[2]/a")
    private WebElementFacade sindescarga;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/a")
    private WebElementFacade sindestino;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sincontacto;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinenlace;

    public void visualizarSinFecha() throws InterruptedException {
        //txtbusquedad.click();
        txtbusquedad.sendKeys("Capacitación semipresencial");
         btnbuscar.click();
         sinfecha.click();

    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
       txtbusquedad.sendKeys("Taller de astronomía");
        btnbuscar.click();
        sinSub.click();

    }

    public void visualizarSinImagen() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Las flores del Jardín Botánico");
        btnbuscar.click();
        sinimage.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 350)");

    }

    public void visualizarSinTexto()throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Marismas del Odiel");
        btnbuscar.click();
        sintxt.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 100)");
    }

    public void visualizarSinFechaDesde()throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aprovechamiento pesquero");
        btnbuscar.click();
        sinfechadesde.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarSinDireccion() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Día del medio ambiente");
        btnbuscar.click();
        sindirec.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarSinProvincia() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Munición ecoalternativa");
        btnbuscar.click();
        sinprovincia.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 350)");
    }

    public void visualizarSinPrograma() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Jornada temática");
        btnbuscar.click();
        sinprograma.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 350)");
    }

    public void visualizarSinDescarga() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("supervivencia en la naturaleza");
        btnbuscar.click();
        sindescarga.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 600)");
    }

    public void vizualizaSinDestinatario()throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Feria de Muestras");
        btnbuscar.click();
        sindestino.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinContacto() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Parque Natural Del Estrecho");
        btnbuscar.click();
        sincontacto.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinEnlace() throws InterruptedException{
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("riqueza botánica");
        btnbuscar.click();
        sinenlace.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }
}
