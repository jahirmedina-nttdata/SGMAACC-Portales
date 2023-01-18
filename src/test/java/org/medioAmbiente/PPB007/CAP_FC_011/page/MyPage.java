package org.medioAmbiente.PPB007.CAP_FC_011.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/cae/tramites-y-servicios")


public class MyPage extends PageObject {


    @FindBy(xpath = "//button/span[contains(text(),\"Buscar\")]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button/span[contains(text(),\"Limpiar\")]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//div[@id=\"headerSearchField\"]//input")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//a[@id=\"46607779\"]")
    private WebElementFacade Enlace_SinFecha;

    @FindBy(xpath = "//a[@id=\"31828084\"]")
    private WebElementFacade Enlace_SinSubtitulo;

    @FindBy(xpath = "//a[@id=\"15507146\"]")
    private WebElementFacade Enlace_SinTexto;

    @FindBy(xpath = "//a[@id=\"25077254\"]")
    private WebElementFacade Enlace_SinAfectos;

    @FindBy(xpath = "//a[@id=\"24653148\"]")
    private WebElementFacade Enlace_Sinrequisitos;

    @FindBy(xpath = "//a[@id=\"23962351\"]")
    private WebElementFacade Enlace_SinOrgano;

    @FindBy(xpath = "//a[@id=\"36237692\"]")
    private WebElementFacade Enlace_SinLugar;

    @FindBy(xpath = "//a[@id=\"18820764\"]")
    private WebElementFacade Enlace_SinObservacion;

    @FindBy(xpath = "//a[@id=\"18820740\"]")
    private WebElementFacade Enlace_SinFechaPlazoAbierto;

    @FindBy(xpath = "//a[@id=\"18820716\"]")
    private WebElementFacade Enlace_SinPeriodo;

    @FindBy(xpath = "//a[@id=\"14624628\"]")
    private WebElementFacade Enlace_SinPlazoNotificacion;

    @FindBy(xpath = "//a[@id=\"18545043\"]")
    private WebElementFacade Enlace_SinSilencioAdmin;

    @FindBy(xpath = "//a[@id=\"14625636\"]")
    private WebElementFacade Enlace_SinModelo;

    @FindBy(xpath = "//a[@id=\"14624859\"]")
    private WebElementFacade Enlace_SinSeguimiento;

    @FindBy(xpath = "//a[@id=\"45570780\"]")
    private WebElementFacade Enlace_SinDocumentacion;

    @FindBy(xpath = "//a[@id=\"14626251\"]")
    private WebElementFacade Enlace_SinEnlaceBoja;

    @FindBy(xpath = "//a[@id=\"14625108\"]")
    private WebElementFacade Enlace_SinEnlaceTramitacion;

    @FindBy(xpath = "//a[@id=\"14624650\"]")
    private WebElementFacade Enlace_SinPresentacionTele;

    @FindBy(xpath = "//a[@id=\"14625944\"]")
    private WebElementFacade Enlace_SinJustificacionTele;

    @FindBy(xpath = "//a[@id=\"14624628\"]")
    private WebElementFacade Enlace_SinNotificacionTele;

    @FindBy(xpath = "//a[@id=\"14625130\"]")
    private WebElementFacade Enlace_SinSeguimientoExpediente;

    @FindBy(xpath = "//a[@id=\"14624639\"]")
    private WebElementFacade Enlace_SinPagoTelematico;



    public void visualizarSinFechaManual() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
        waitFor(1).second();
        Texto_Buscar.sendKeys("Autorizaciones de uso en Zona");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnBuscar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinFecha).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinSubtitulo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Trámite de consultas iniciales");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinSubtitulo).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinTexto() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Desclasificación de suelo como contaminado");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinTexto).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinTextoAlternativo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Presentación de declaración responsable");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void visualizarSinRequisitos() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Fase de consultas iniciales");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_Sinrequisitos).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinAfectados() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Fase de consultas iniciales");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinAfectos).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinOrganoTramitador() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Presentación de declaración");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinOrgano).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinLugarDePresentacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Plan de Transporte Metropolitano");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinLugar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 550)");
    }

    public void visualizarSinObservacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Comunicación de alteración");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinObservacion).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinFechaDePlazoAbierto() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Comunicación de cesión");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinFechaPlazoAbierto).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinPeriodo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Comunicación de extravío");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinPeriodo).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinPlazoDeNotificacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Procedimiento de elección");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinPlazoNotificacion).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinSilencioAdministrativo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Modificación de Comunidad");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinSilencioAdmin).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinModelo() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Trámite de información pública del Anteproyecto");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinModelo).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinSeguimientoDeTramite() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Subsanación al informe");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinSeguimiento).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinDocumentacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Trámite de consultas iniciales");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinDocumentacion).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinDireccionDeEnlaceBoja() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Comunicación sobre la Información");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinEnlaceBoja).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void visualizarSinDireccionDeEnlaceAlProcesoDeTramitacion() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Solicitud de constitución");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinEnlaceTramitacion).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
    }

    public void visualizarSinPresentacionTelematica() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Separación de Comunidades");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinPresentacionTele).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinJustificacionTelematica() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Residuos: certificado de destrucción");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinJustificacionTele).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinNotificacionTelematica() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Procedimiento de elección");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinNotificacionTele).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

    public void visualizarSinSeguimientoDeExpediente() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Presentación de la Memoria");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinSeguimientoExpediente).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }


    public void visualizarSinPagoTelematico() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Revisión de una concesión");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Enlace_SinPagoTelematico).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
    }

}
