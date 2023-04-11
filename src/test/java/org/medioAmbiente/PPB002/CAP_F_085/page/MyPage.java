package org.medioAmbiente.PPB002.CAP_F_085.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/guest/buscador-publicacion?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Aullidos en Sierra Morena\"]")
    private WebElementFacade sinfecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_searchTextInput\"]")
    private WebElementFacade txtbusquedad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinSubtitulo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade sinText;

    @FindBy(xpath = "//a[@title=\"Guía Técnica SIOSE Andalucía (2009)\"]")
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

    @FindBy(xpath = "//a[@title=\"Ir a url\"]")
    private WebElementFacade btnUrl;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade interactivo;

    @FindBy(xpath = "//a/img[@title=\"Ver documento interactivo\"]")
    private WebElementFacade btnInteractivo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")
    private WebElementFacade biblioteca;

    @FindBy(xpath = "//a[@title=\"Málaga industrial y portuaria. 1880\"]")
    private WebElementFacade Doc_URL;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_FytOUWH22K7t_3074891\"]//p/a/img\n")
    private WebElementFacade btnBiblioteca;
    private String prntw;
    private String popwnd;

    public void visualizarSinFecha() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.sendKeys("Aullidos" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinfecha.waitUntilClickable();
        //sinfecha.click();
        getDriver().findElement(By.xpath("//a[@title=\"Aullidos en Sierra Morena\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }

    public void visualizarSinSub() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Lobezno" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
       // j.executeScript("window.scrollBy(0, 150)");
        sinSubtitulo.waitUntilClickable();
        //waitFor(1).second();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinSubtitulo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }


    public void visualizarSinTexto() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Mediterranean Forests" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinText.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinText.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }

    public void visualizarSinTextominiatura() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Recetario de comida" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }


    public void visualizarSinCreditos() throws InterruptedException, URISyntaxException{
        txtbusquedad.clear();
        txtbusquedad.sendKeys("SIOSE Andalucía" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinCredito.waitUntilClickable();
        getDriver().findElement(By.xpath("//a[@title=\"Guía Técnica SIOSE Andalucía (2009)\"]")).click();
        //sinCredito.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinFichero() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Growing" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinFichero.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinFichero.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }

    public void visualizarSinUrl() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("La Gobernanza" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinUrl.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//div[2]//div[2]/a")).click();
        sinUrl.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
        j.executeScript("window.scrollBy(0, 250)");
    }

   // public void visualizarSinImage() throws InterruptedException {
      //  getDriver().navigate().back();
    //    WebDriverWait wait = new WebDriverWait(getDriver(), 30);
     //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
     //   txtbusquedad.clear();
     //   txtbusquedad.sendKeys("Ecobarómetro de Andalucía 2006 (Informe completo)" + "\n");
    //    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    //    JavascriptExecutor j = (JavascriptExecutor) getDriver();
    //    j.executeScript("window.scrollBy(0, 150)");
     //   sinImage.waitUntilClickable();
     //   sinImage.click();
  //  }

    public void visualizarSinBliblioteca() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Agenda 21" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinBliblioteca.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinBliblioteca.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }

    public void visualizarSinSerie() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aurora" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinSerie.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinSerie.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinActor() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Jaén Renacentista" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinautor.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinautor.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinNotas() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Paisajes de Andalucía" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinNotas.waitUntilClickable();
        //getDriver().findElement(By.xpath("//a[@title=\"Paisajes de Andalucía\"]")).click();
        sinNotas.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinArchivos() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Geoparque" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinArchivo.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinArchivo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }

    public void visualizarSinDerechos() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Siente el Bosque" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
       // JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        sinDerecho.waitUntilClickable();
        //getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//a")).click();
        sinDerecho.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"journal-content-article\"]")));
    }

    public void clickarDercarga() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        waitFor(2).second();
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Entremijos" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        descarga.waitUntilClickable();
        descarga.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dwnArchivo\"]")));
        btndescarga.click();
        waitFor(2).second();
    }

    public void clickarDocument() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 380);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Cádiz y Málaga" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        documento.waitUntilClickable();
        documento.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dwnDoc\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        btndocumento.waitUntilClickable();
        waitFor(1).second();
        Actions action = new Actions(getDriver());
        action.moveToElement(btndocumento).perform();
        action.moveToElement(btndocumento).click().perform();
        waitFor(10).second();
    }

    public void clickarUrl() throws InterruptedException, URISyntaxException{
        getDriver().navigate().back();
        waitFor(2).second();
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Málaga industrial " + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        Doc_URL.waitUntilClickable();
        Doc_URL.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Ir a url\"]")));
        btnUrl.waitUntilClickable();
        btnUrl.click();
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

    public void clickarInteractivo() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Geoparque" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        //j.executeScript("window.scrollBy(0, 150)");
        interactivo.waitUntilClickable();
        interactivo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/img[@title=\"Ver documento interactivo\"]")));
        btnInteractivo.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnInteractivo).perform();
        action.moveToElement(btnInteractivo).click().perform();
        waitFor(3).second();
    }

    public void clickarEnlaceBibli() throws InterruptedException, URISyntaxException {
        getDriver().navigate().back();
        waitFor(2).second();
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Buscador de publicaciones\")])[2]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Nudibranquios" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
       // JavascriptExecutor j = (JavascriptExecutor) getDriver();
       // j.executeScript("window.scrollBy(0, 150)");
        biblioteca.waitUntilClickable();
        biblioteca.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_FytOUWH22K7t_3074891\"]//p/a/img\n")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        btnBiblioteca.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnBiblioteca).perform();
        action.moveToElement(btnBiblioteca).click().perform();
    }
}
