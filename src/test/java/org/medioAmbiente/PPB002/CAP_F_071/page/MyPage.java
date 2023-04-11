package org.medioAmbiente.PPB002.CAP_F_071.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/buscador-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]/div/div/div[2]//div[2]/a")
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

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_FoI1LOPlgiFQ_resultsDiv\"]//div[2]/a")
    private WebElementFacade sinfechahasta;

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
        txtbusquedad.sendKeys("Recursos ecoturísticos");
         btnbuscar.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
       // JavascriptExecutor j = (JavascriptExecutor) getDriver();
       // j.executeScript("window.scrollBy(0, 150)");
        sinfecha.waitUntilClickable();
         sinfecha.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Recursos ecoturísticos del Parque Natural del Estrecho')]")));
    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        //JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Taller de astronomía");
        btnbuscar.click();
       // j.executeScript("window.scrollBy(0, 150)");
        sinSub.waitUntilClickable();
        sinSub.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Taller de astronomía y observación de estrellas')])[2]")));
    }

    public void visualizarSinImagen() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Las flores del Jardín Botánico");
        btnbuscar.click();
       // j.executeScript("window.scrollBy(0, 150)");
        sinimage.waitUntilClickable();
        sinimage.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Visita guiada “Las flores del Jardín Botánico” y Exposición de fotos de flora')])[2]")));
        j.executeScript("window.scrollBy(0, 350)");
    }

    public void visualizarSinTexto()throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Marismas del Odiel");
        btnbuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
       // j.executeScript("window.scrollBy(0, 150)");
        sintxt.waitUntilClickable();
        sintxt.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Visita a Marismas del Odiel. Aprovechamientos sostenibles: las salinas')])[2]")));
        j.executeScript("window.scrollBy(0, 100)");
    }

    public void visualizarSinFechaDesde()throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aprovechamientos forestales");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sinfechadesde.waitUntilClickable();
        sinfechadesde.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Aprovechamientos forestales sostenibles en los pinares de La Breña')])[2]")));
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarSinFechaHasta()throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Paloma alta");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sinfechahasta.waitUntilClickable();
        sinfechahasta.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Paloma alta, retos y oportunidades. Parque Natural del Estrecho')])[2]")));
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarSinDireccion() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Día del medio ambiente");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sindirec.waitUntilClickable();
        sindirec.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Día del medio ambiente en la biblioteca de medio ambiente: del 6 al 10 de junio')])[2]")));
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarSinProvincia() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Munición ecoalternativa");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sinprovincia.waitUntilClickable();
        sinprovincia.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Munición ecoalternativa en el Parque Natural La Breña y Marismas del Barbate')])[2]")));
        j.executeScript("window.scrollBy(0, 350)");
    }

    public void visualizarSinPrograma() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Jornada temática");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sinprograma.waitUntilClickable();
        sinprograma.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Jornada temática sobre gestión forestal en los Montes de Málaga')])[2]")));
        j.executeScript("window.scrollBy(0, 350)");
    }

    public void visualizarSinDescarga() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("supervivencia en la naturaleza");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sindescarga.waitUntilClickable();
        sindescarga.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Técnicas de supervivencia en la naturaleza (L4.07.21)')])[2]")));
        j.executeScript("window.scrollBy(0, 600)");
    }

    public void vizualizaSinDestinatario()throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Feria de Muestras");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sindestino.waitUntilClickable();
        sindestino.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Feria de Muestras de los Parques Naturales de Cádiz')])[2]")));
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinContacto() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Parque Natural Del Estrecho");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sincontacto.waitUntilClickable();
        sincontacto.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'Reconectando con el Parque Natural Del Estrecho')])[2]")));
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarSinEnlace() throws InterruptedException{
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        txtbusquedad.clear();
        txtbusquedad.sendKeys("riqueza botánica");
        btnbuscar.click();
        //j.executeScript("window.scrollBy(0, 150)");
        sinenlace.waitUntilClickable();
        sinenlace.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'La riqueza botánica de Marismas del Odiel')])[2]")));
        j.executeScript("window.scrollBy(0, 700)");
    }
}
