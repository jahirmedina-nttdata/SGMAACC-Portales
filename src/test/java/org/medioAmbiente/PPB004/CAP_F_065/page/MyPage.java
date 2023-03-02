package org.medioAmbiente.PPB004.CAP_F_065.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/trámites")



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

    @FindBy(xpath = "//a[@title=\"Comunicación de cesión temporal o definitiva del ave de cetrería\"]")
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
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        text_Buscar.sendKeys("Solicitud");
        btnBuscar.click();
    }

    public void buscarPorCateg() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Limpiar.click();
        Lista_Categ.click();
        Colectivo.click();
        btnBuscar.click();

    }

    public void buscarPorPlazo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Limpiar.click();
        Plazo_Abierto.click();
        btnBuscar.click();
    }

    public void buscarPorTramitacion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Limpiar.click();
        Tramitacion.click();
        btnBuscar.click();
    }

    public void buscarPorTextoPlazo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Limpiar.click();
        text_Buscar.sendKeys("PLanes");
        Plazo_Abierto.click();
        btnBuscar.click();
    }

    public void accederContenido() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Enlace.click();
        getDriver().navigate().back();
    }

    public void validarTextFlotante() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Limpiar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnBuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");

        if(textflotante.contains("Comunicación de cesión temporal o definitiva del ave de cetrería")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void navegarPaginadorCAPF067() throws InterruptedException {
        Limpiar.click();
        btnBuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnAdelante.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro1.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnUltimapg.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnAtras.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro2.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnPrimerapg.click();
    }


}
