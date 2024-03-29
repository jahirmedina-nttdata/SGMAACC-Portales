package org.medioAmbiente.PPB002.CAP_F_080.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/guest/buscador-imagenes?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinfecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_searchTextInput\"]")
    private WebElementFacade txtbusquedad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinpieImagen;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinSub;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]//div[2]/a")
    private WebElementFacade sinimage;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]/a")
    private WebElementFacade sintxt;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinautor;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinlocalizacion;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_8PWoVRSqGtFp_resultsDiv\"]//div[1]/div/div[2]/a")
    private WebElementFacade sinderechos;


    public void visualizarSinFecha() throws InterruptedException {

        txtbusquedad.sendKeys("Biosfera Sierra" + "\n");
        sinfecha.click();

    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Realidad esquematizada" + "\n");
        sinSub.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");

    }

    public void visualizarSinImagen() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Lola Quintana" + "\n");
        sinimage.click();
    }

    public void visualizarSinPie() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Emasagra" + "\n");
        sinpieImagen.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Proyección visual" + "\n");
        sintxt.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }


    public void visualizarSinAutor() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Modelo Digital" + "\n");
        sinautor.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinlocalizacion() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Arrozales Doñana" + "\n");
        sinlocalizacion.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinderecho() throws InterruptedException {
        getDriver().navigate().back();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Pinsapar" + "\n");
        sinderechos.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }
}
