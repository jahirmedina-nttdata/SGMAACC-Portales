package org.medioAmbiente.PPB002.CAP_F_079.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        txtbusquedad.sendKeys("Capacitación semipresencial");
         btnbuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinfecha.waitUntilClickable();
         sinfecha.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'ANDALUCIA - CUSTODIA')]")));
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinSub() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Taller de astronomía");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sinSub.waitUntilClickable();
        sinSub.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Taller de astronomía y observación de estrellas')])[2]")));
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinImagen() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Las flores del Jardín Botánico");
        btnbuscar.click();
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sinimage.waitUntilClickable();
        sinimage.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Visita guiada “Las flores del Jardín Botánico” y Exposición de fotos de flora')])[2]")));
        j.executeScript("window.scrollBy(0, 350)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinTexto()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Marismas del Odiel");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sintxt.waitUntilClickable();
        sintxt.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Visita a Marismas del Odiel. Aprovechamientos sostenibles: las salinas')])[2]")));
        j.executeScript("window.scrollBy(0, 100)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinFechaDesde()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aprovechamiento pesquero");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sinfechadesde.waitUntilClickable();
        sinfechadesde.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Aprovechamiento pesquero y artes de pesca artesanales en la Red Natura 2000')])[2]")));
        j.executeScript("window.scrollBy(0, 200)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinDireccion() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Día del medio ambiente");
        btnbuscar.click();
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sindirec.waitUntilClickable();
        sindirec.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Día del medio ambiente en la biblioteca de medio ambiente: del 6 al 10 de junio')])[2]")));
        j.executeScript("window.scrollBy(0, 200)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinProvincia() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Munición ecoalternativa");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sinprovincia.waitUntilClickable();
        sinprovincia.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Munición ecoalternativa en el Parque Natural La Breña y Marismas del Barbate')])[2]")));
        j.executeScript("window.scrollBy(0, 350)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinPrograma() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Jornada temática");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sinprograma.waitUntilClickable();
        sinprograma.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Jornada temática sobre gestión forestal en los Montes de Málaga')])[2]")));
        j.executeScript("window.scrollBy(0, 350)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinDescarga() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("supervivencia en la naturaleza");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sindescarga.waitUntilClickable();
        sindescarga.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Técnicas de supervivencia en la naturaleza (L4.07.21)')])[2]")));
        j.executeScript("window.scrollBy(0, 600)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void vizualizaSinDestinatario()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Feria de Muestras");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sindestino.waitUntilClickable();
        sindestino.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Feria de Muestras de los Parques Naturales de Cádiz')])[2]")));
        j.executeScript("window.scrollBy(0, 700)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinContacto() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Parque Natural Del Estrecho");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sincontacto.waitUntilClickable();
        sincontacto.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Reconectando con el Parque Natural Del Estrecho')])[2]")));
        j.executeScript("window.scrollBy(0, 700)");
        waitFor(2).second();
        getDriver().navigate().back();
    }

    public void visualizarSinEnlace() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        txtbusquedad.clear();
        txtbusquedad.sendKeys("riqueza botánica");
        btnbuscar.click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        j.executeScript("window.scrollBy(0, 150)");
        sinenlace.waitUntilClickable();
        sinenlace.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'La riqueza botánica de Marismas del Odiel')])[2]")));
        j.executeScript("window.scrollBy(0, 700)");
        waitFor(2).second();
    }
}
