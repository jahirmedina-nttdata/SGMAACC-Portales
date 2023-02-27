package org.medioAmbiente.PPB004.CAP_F_005.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/buscador")


public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_searchTextInput\"]")
    private WebElementFacade txtbuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_category0-button\"]/span[2]")
    private WebElementFacade Lista_Tema;

    @FindBy(xpath = "//*[@role=\"option\"][contains(text(),'Caza')]")
    private WebElementFacade Tema_Caza;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[4]/button[2]/span")
    private WebElementFacade Limpiar;

    @FindBy(xpath = "//li[@class=\"page_number pag_num_5\"]/a")
    private WebElementFacade Paginador5;

    @FindBy(xpath = "(//li/a[contains(text(),\">\")])[1]")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//li/a[contains(text(),\">>\")]")
    private WebElementFacade Ultima_pagina;

    @FindBy(xpath = "(//li/a[contains(text(),\"<\")])[2]")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//li/a[contains(text(),\"<<\")]")
    private WebElementFacade Primera_pagina;

    @FindBy(xpath = "//span[@title=\"ordenacion-resultados\"]")
    private WebElementFacade Lista_Ordenacion;

    @FindBy(xpath = "//div[contains(text(),\"Fecha de publicación ascendente\")]")
    private WebElementFacade Publicacion_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título ascendente\")]")
    private WebElementFacade Titulo_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título descendente\")]")
    private WebElementFacade Titulo_Desc;


    public void clickarBuscar() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTexto() throws InterruptedException{
        txtbuscar.sendKeys("Plan"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTema() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Lista_Tema.click();
        Tema_Caza.click();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorTextoYTema()throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        txtbuscar.sendKeys("Perros");
        Lista_Tema.click();
        Tema_Caza.click();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorFechaDePublicacionAscendentemente() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Publicacion_Asc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorTituloAscendente() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Titulo_Asc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorTituloDescendente() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Titulo_Desc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void validarFuncionamientoDePaginador() throws InterruptedException{
        Actions action = new Actions(getDriver());
        action.moveToElement(Limpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
        action.moveToElement(Paginador5).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Siguiente).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Ultima_pagina).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Anterior).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Primera_pagina).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
    }

}
