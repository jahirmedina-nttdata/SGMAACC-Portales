package org.medioAmbiente.PPB002.CAP_F_080.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Realidad esquematizada" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinSub.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");

    }

    public void visualizarSinImagen() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Lola Quintana" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinimage.click();
    }

    public void visualizarSinPie() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Emasagra" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinpieImagen.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Proyección visual" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sintxt.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }


    public void visualizarSinAutor() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Modelo Digital" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinautor.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinlocalizacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Arrozales Doñana" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinlocalizacion.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinderecho() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Pinsapar" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinderechos.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }
}
