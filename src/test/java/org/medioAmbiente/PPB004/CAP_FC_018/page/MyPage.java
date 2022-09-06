package org.medioAmbiente.PPB004.CAP_FC_018.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/trámites")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_searchButton\"]/span")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_searchTextInput\"]")
    private WebElementFacade text_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_category0-button\"]/span[2]")
    private WebElementFacade Lista_Categ;

    @FindBy(xpath = "//li[@class=\"ui-menu-item\"][1]")
    private WebElementFacade Colectivo;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]//button[2]/span")
    private WebElementFacade Limpiar;

    @FindBy(xpath = "//*[@id=\"customFilters\"]/label[1]")
    private WebElementFacade Plazo_Abierto;

    @FindBy(xpath = "//*[@id=\"customFilters\"]/label[2]")
    private WebElementFacade Tramitacion;

    @FindBy(xpath = "//*[@id=\"14625020\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"18820764\"]")
    private WebElementFacade Flotante;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[4]/a")
    private WebElementFacade btnNro2;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[3]/a")
    private WebElementFacade btnNro1;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[5]/a")
    private WebElementFacade btnAdelante;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[2]/a")
    private WebElementFacade btnAtras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[6]/a")
    private WebElementFacade btnUltimapg;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[1]/a")
    private WebElementFacade btnPrimerapg;

    public void mostrarBuscador()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void buscarPortexto() throws InterruptedException {
        text_Buscar.sendKeys("Solicitud");
        btnBuscar.click();
    }

    public void buscarPorCateg() throws InterruptedException {
        Limpiar.click();
        Lista_Categ.click();
        Colectivo.click();
        btnBuscar.click();

    }

    public void buscarPorPlazo() throws InterruptedException {
        Limpiar.click();
        Plazo_Abierto.click();
        btnBuscar.click();
    }

    public void buscarPorTramitacion() throws InterruptedException {
        Limpiar.click();
        Tramitacion.click();
        btnBuscar.click();
    }

    public void buscarPorTextoPlazo() throws InterruptedException {
        Limpiar.click();
        text_Buscar.sendKeys("PLanes");
        Plazo_Abierto.click();
        btnBuscar.click();
    }

    public void accederContenido() throws InterruptedException {
        Enlace.click();
        getDriver().navigate().back();
    }

    public void validarTextFlotante() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");

        if(textflotante.equals("Comunicación de alteración, extravío o pérdida del sistema de marcaje del ave de cetrería")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void ejecutarcaso() throws InterruptedException {
        Limpiar.click();
        btnBuscar.click();
        btnNro2.click();
        btnNro1.click();
        btnAdelante.click();
        btnNro1.click();
        btnUltimapg.click();
        btnAtras.click();
        btnNro2.click();
        btnPrimerapg.click();
    }


}
