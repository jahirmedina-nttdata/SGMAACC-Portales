package org.medioAmbiente.PPB002.CAP_F_081.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/buscador?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"El transporte comarcal como instrumento de ordenación territorial\"]")
    private WebElementFacade sinfecha;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_searchTextInput\"]")
    private WebElementFacade txtbusquedad;

    @FindBy(xpath = "//span[contains(text(),'Limpiar')]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//a[@title=\"Recursos naturales de Andalucía (1991)\"]")
    private WebElementFacade sinSubTitulo;

    @FindBy(xpath = "//a[@title=\"Planificación Hidrológica 1998\"]")
    private WebElementFacade sinTexto;

    @FindBy(xpath = "//a[@title=\"Life Flora Sierra Nevada\"]")
    private WebElementFacade sinRequisitos;

    @FindBy(xpath = "//a[@title=\"Área metropolitana de Sevilla. Análisis del medio físico\"]")
    private WebElementFacade sinAfectados;

    @FindBy(xpath = "//a[@title=\"El río Dílar y su entorno (1998)\"]")
    private WebElementFacade sinOrganos;

    @FindBy(xpath = "//a[@title=\"Datos Básicos Parque Nacional Doñana (Edición 1998)\"]")
    private WebElementFacade sinLugar;

    @FindBy(xpath = "//a[@title=\"La RENPA en Cifras (Edición 2002)\"]")
    private WebElementFacade sinObservaciones;

    @FindBy(xpath = "//a[@title=\"Geology of the arid zone of Almeria. 2003\"]")
    private WebElementFacade sinFechaPlazo;

    @FindBy(xpath = "//a[@title=\"Programa de Conservación de la Focha moruna (2001-2012)\"]")
    private WebElementFacade sinPeriodo;

    @FindBy(xpath = "//a[@title=\"Aumenta la población de buitre negro en Andalucía\"]")
    private WebElementFacade sinPlazoNoti;

    @FindBy(xpath = "//a[@title=\"Invertidos más de 12 millones en la gestión del litoral andaluz\"]")
    private WebElementFacade sinSilencioAdmin;

    @FindBy(xpath = "//a[@title=\"Menos ruido, más vida  (2004)\"]")
    private WebElementFacade sinModelo;

    @FindBy(xpath = "//a[@title=\"Programa Andarríos\"]")
    private WebElementFacade sinSeguimiento;

    @FindBy(xpath = "//a[@title=\"La Sierra Subbética es reconocida por la UNESCO como Geoparque de España\"]")
    private WebElementFacade sinDocumentacion;

    @FindBy(xpath = "//a[@title=\"Resolución del Parlamento de Andalucía de 14 y 15 de noviembre de 1989, por la que se aprueba el Plan Forestal Andaluz.\"]")
    private WebElementFacade sinEnlace;

    @FindBy(xpath = "//a[@title=\"Solicitud de estimación de la calidad del corcho\"]")
    private WebElementFacade sinEnlaceTrami;

    @FindBy(xpath = "//a[@title=\"Flora amenazada y endémica de Sierra Nevada (2001)\"]")
    private WebElementFacade sinPresTelematica;

    @FindBy(xpath = "(//a[@title=\"Buenas prácticas del mes\"])[1]")
    private WebElementFacade sinJustTelematica;

    @FindBy(xpath = "//a[@title=\"Un vivero forestal en el aula (1995)\"]")
    private WebElementFacade sinNotiTelematica;

    @FindBy(xpath = "//a[@title=\"Un Mar de Bosques (1996)\"]")
    private WebElementFacade sinSeguiExpediente;

    @FindBy(xpath = "//a[@title=\"Técnicas de censo, muestreo y seguimiento de aves (L4.13.22)\"]")
    private WebElementFacade sinPago;


    public void visualizarSinFecha() throws InterruptedException {

        txtbusquedad.sendKeys("Transporte comarcal" + "\n");
        sinfecha.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("(//h1[contains(text(),'El transporte comarcal como instrumento de ordenación territorial')])[2]")));
    }

    public void visualizarSinSub() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Recursos naturales de Andalucía (1991)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinSubTitulo.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Planificación Hidrológica 1998" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinTexto.waitUntilClickable();
        sinTexto.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinTextoMinuatura() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        btnLimpiar.click();
        btnBuscar.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void visualizarSinrequisitos() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        btnLimpiar.click();
        txtbusquedad.sendKeys("Jardines botánicos (2002)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinRequisitos.waitUntilClickable();
        sinRequisitos.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinafectados() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Área metropolitana de Sevilla. Análisis del medio físico" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinAfectados.waitUntilClickable();
        sinAfectados.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinorganos() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("El río Dílar y su entorno (1998)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinOrganos.waitUntilClickable();
        sinOrganos.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinlugar() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Datos Básicos Parque Nacional Doñana (Edición 1998)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinLugar.waitUntilClickable();
        sinLugar.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinobservaciones() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("La RENPA en Cifras (Edición 2002)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinObservaciones.waitUntilClickable();
        sinObservaciones.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinfechaplazo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Geology of the arid zone of Almeria. 2003" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinFechaPlazo.waitUntilClickable();
        sinFechaPlazo.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinperiodo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Plan Andaluz de Humedales (2004)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinPeriodo.waitUntilClickable();
        sinPeriodo.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinplazonotificacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Aumenta la población de buitre negro en Andalucía" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinPlazoNoti.waitUntilClickable();
        sinPlazoNoti.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinsilencioadministrativo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Invertidos más de 12 millones en la gestión del litoral andaluz" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinSilencioAdmin.waitUntilClickable();
        sinSilencioAdmin.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinmodelo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Menos ruido, más vida (2004)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinModelo.waitUntilClickable();
        sinModelo.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinseguimiento() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Plan Director de Riberas de Andalucía" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinSeguimiento.waitUntilClickable();
        sinSeguimiento.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSindocumentacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("La Sierra Subbética es reconocida por la UNESCO como Geoparque de España" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinDocumentacion.waitUntilClickable();
        sinDocumentacion.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinenlace() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Plan Forestal Andaluz, 1989" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinEnlace.waitUntilClickable();
        sinEnlace.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinenlacetramitacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Solicitud de estimación de la calidad del corcho" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinEnlaceTrami.waitUntilClickable();
        sinEnlaceTrami.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinpresentaciontelematica() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Flora amenazada y endémica de Sierra Nevada (2001)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinPresTelematica.waitUntilClickable();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        sinPresTelematica.click();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinjustificantetelematico() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Buenas prácticas del mes" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinJustTelematica.waitUntilClickable();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        sinJustTelematica.click();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinnotificaciontelematica() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Un vivero forestal en el aula (1995)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinNotiTelematica.waitUntilClickable();
        sinNotiTelematica.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinseguimientoexpediente() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Un Mar de Bosques (1996)" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinSeguiExpediente.waitUntilClickable();
        sinSeguiExpediente.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinpago() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        txtbusquedad.clear();
        txtbusquedad.sendKeys("Técnicas de censo" + "\n");
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        sinPago.waitUntilClickable();
        sinPago.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

}
