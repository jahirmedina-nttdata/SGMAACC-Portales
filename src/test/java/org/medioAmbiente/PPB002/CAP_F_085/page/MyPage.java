package org.medioAmbiente.PPB002.CAP_F_085.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinfecha.waitUntilClickable();
        getDriver().findElement(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]/div/div/div/div/div[2]/a")).click();
        //sinfecha.click();

    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Lobezno" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinSubtitulo.waitUntilClickable();
        sinSubtitulo.click();

    }


    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Mediterranean Forests" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinText.waitUntilClickable();
        sinText.click();
    }

    public void visualizarSinTextominiatura() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Recetario de comida" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }


    public void visualizarSinCreditos() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("SIOSE Andalucía" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinCredito.waitUntilClickable();
        sinCredito.click();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinFichero() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Growing" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinFichero.waitUntilClickable();
        sinFichero.click();
    }

    public void visualizarSinUrl() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("La Gobernanza" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinUrl.waitUntilClickable();
        sinUrl.click();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinImage() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("emisiones a la atmósfera" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinImage.waitUntilClickable();
        sinImage.click();
    }

    public void visualizarSinBliblioteca() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Agenda 21" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinBliblioteca.waitUntilClickable();
        sinBliblioteca.click();
    }

    public void visualizarSinSerie() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aurora" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinSerie.waitUntilClickable();
        sinSerie.click();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinActor() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Jaén Renacentista" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinautor.waitUntilClickable();
        sinautor.click();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinNotas() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Paisajes de Andalucía" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinNotas.waitUntilClickable();
        sinNotas.click();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinArchivos() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Geoparque" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinArchivo.waitUntilClickable();
        sinArchivo.click();
    }

    public void visualizarSinDerechos() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Siente el Bosque" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinDerecho.waitUntilClickable();
        sinDerecho.click();
    }

    public void clickarDercarga() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Entremijos" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        descarga.waitUntilClickable();
        descarga.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dwnArchivo\"]")));
        btndescarga.click();
    }

    public void clickarDocument() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Cádiz y Málaga" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        documento.waitUntilClickable();
        documento.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dwnDoc\"]")));
        btndocumento.click();
    }

    public void clickarUrl() throws InterruptedException{
        getDriver().navigate().back();
        Thread.sleep(1000);
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Cádiz y Málaga" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        documento.waitUntilClickable();
        documento.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_FytOUWH22K7t_3348136\"]//li[2]//img")));
        btnUrl.click();
    }

    public void clickarInteractivo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Málaga industrial" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        interactivo.waitUntilClickable();
        interactivo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"dwnInterc\"]")));
        btnInteractivo.click();
    }

    public void clickarEnlaceBibli() throws InterruptedException {
        getDriver().navigate().back();
        Thread.sleep(1000);
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Nudibranquios" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        biblioteca.waitUntilClickable();
        biblioteca.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_FytOUWH22K7t_3074891\"]//p/a/img\n")));
        btnBiblioteca.click();
    }
}
