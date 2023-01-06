package org.medioAmbiente.PPB007.CAP_FC_010.page;


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

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@DefaultUrl("/medioambiente/portal/web/cae/tramites-y-servicios?categoryVal=")


public class MyPage extends PageObject {


    @FindBy(xpath = "//button/span[contains(text(),\"Buscar\")]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button/span[contains(text(),\"Limpiar\")]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//div[@id=\"headerSearchField\"]//input")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//span[@title=\"category-tipo--tramites\"]")
    private WebElementFacade SelectTipo;

    @FindBy(xpath = "//div[contains(text(),\"Certificación\")]")
    private WebElementFacade Tipo;

    @FindBy(xpath = "//span[@title=\"category-temática--trámites\"]")
    private WebElementFacade SelectTematica;

    @FindBy(xpath = "//div[contains(text(),\"Aire\")]")
    private WebElementFacade Tematica;

    @FindBy(xpath = "//label[contains(text(),\"Plazo abierto\")]")
    private WebElementFacade Plazo_Abierto;

    @FindBy(xpath = "//label[@for=\"tramitacionElectronica\"]")
    private WebElementFacade Tramitacion_Electronica;

    @FindBy(xpath = "(//div[@class=\"evr-form-results__item-title\"]//a)[2]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//li[@class=\"page_number pag_num_5\"]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "(//a[contains(text(),\">\")])[1]")
    private WebElementFacade btnSiguiente;

    @FindBy(xpath = "//li[@class=\"page-item last\"]/a")
    private WebElementFacade Ultima_Pagina;

    @FindBy(xpath = "(//a[contains(text(),\"<\")])[2]")
    private WebElementFacade btnAnterior;

    @FindBy(xpath = "//li[@class=\"page-item first\"]/a")
    private WebElementFacade Primera_Pagina;



    public void visualizarContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
        waitFor(1).second();
        List<WebElement> Campo_Texto = getDriver().findElements(By.xpath("//div[@id=\"headerSearchField\"]//input"));
        List<WebElement> Campo_SelectTipos = getDriver().findElements(By.xpath("//span[@title=\"category-tipo--tramites\"]"));
        List<WebElement> Campo_SelectTematica = getDriver().findElements(By.xpath("//span[@title=\"category-temática--trámites\"]"));
        List<WebElement> Check_PlazoAbierto = getDriver().findElements(By.xpath("//label[contains(text(),\"Plazo abierto\")]"));
        List<WebElement> Check_TramitacionElectronica = getDriver().findElements(By.xpath("//label[@for=\"tramitacionElectronica\"]"));
        if (Campo_Texto.size() != 0 && Campo_SelectTipos.size() != 0 && Campo_SelectTematica.size() != 0 && Check_PlazoAbierto.size() != 0 && Check_TramitacionElectronica.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe campos");
        }
    }

    public void buscarSinFiltros() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnBuscar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"evr-form-results__item\"]"));
        if (lista.size() == 10) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }

    public void buscarPorTexto() throws InterruptedException {
        Texto_Buscar.sendKeys("Tramite");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnBuscar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTipo() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(SelectTipo).click().perform();
        actions.moveToElement(Tipo).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTematica() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(SelectTematica).click().perform();
        actions.moveToElement(Tematica).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorPlazoAbierto() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Plazo_Abierto).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTramitacionElectronica() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(Tramitacion_Electronica).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTextoYPlazoAbierto() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Texto_Buscar.sendKeys("Transporte");
        actions.moveToElement(Plazo_Abierto).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void clickarEnlace() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        actions.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"header-title\"]")));
    }

    public void ejecutarCAPFN030() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 400)");
        Paginador.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 400)");
        btnSiguiente.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 400)");
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 400)");
        btnAnterior.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 400)");
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 400)");
    }

}
