package org.medioAmbiente.PPB001.CAP_F_014.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/buscador-agenda")


public class MyPage extends PageObject {


    @FindBy(xpath = "//input[@title=\"Buscar\"]")
    private WebElementFacade Buscador_Especifico;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avanzada;

    @FindBy(xpath = "//span[@title=\"category-provincia\"]")
    private WebElementFacade Lista_Provincia;

    @FindBy(xpath = "//div[contains(text(),\"Cádiz\")]")
    private WebElementFacade Provincia;

    @FindBy(xpath = "//input[@placeholder=\"Desde\"]")
    private WebElementFacade Fecha_Incio;

    @FindBy(xpath = "//input[@placeholder=\"Hasta\"]")
    private WebElementFacade Fecha_Fin;

    @FindBy(xpath = "//button/span[contains(text(),\"Buscar\")]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//span[@title=\"category-eventos\"]")
    private WebElementFacade Lista_Evento;

    @FindBy(xpath = "//div[contains(text(),\"Curso\")]")
    private WebElementFacade Evento;

    @FindBy(xpath = "//span[@title=\"ordenacion-resultados\"]")
    private WebElementFacade Lista_Ordenacion;

    @FindBy(xpath = "//div[contains(text(),\"Fecha de publicación ascendente\")]")
    private WebElementFacade Publicacion_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título ascendente\")]")
    private WebElementFacade Titulo_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título descendente\")]")
    private WebElementFacade Titulo_Desc;

    @FindBy(xpath = "//div[contains(text(),\"Sevilla\")]")
    private WebElementFacade Prov_Sevilla;

    @FindBy(xpath = "//div[contains(text(),\"Jornada\")]")
    private WebElementFacade Evento_Jornada;

    public void buscarPorTexto() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Buscador_Especifico.sendKeys("Medio Ambiente"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorEvento() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Busqueda_Avanzada).click().perform();
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 180)");
        action.moveToElement(Lista_Evento).click().perform();
        action.moveToElement(Evento).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }
    public void buscarPorProvincia() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Provincia).click().perform();
        action.moveToElement(Provincia).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorFechaDesdeYHasta() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Fecha_Incio.sendKeys("02/02/2021");
        Fecha_Fin.sendKeys("02/01/2022");
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void ordenarFechaDePublicacionAscendentemente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Publicacion_Asc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void ordenarPorTituloAscendentemente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Titulo_Asc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void ordenarPorTituloDescendentemente() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Ordenacion).click().perform();
        action.moveToElement(Titulo_Desc).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorTodosLosFiltros() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Buscador_Especifico.sendKeys("Geoparques");
        action.moveToElement(Lista_Provincia).click().perform();
        action.moveToElement(Prov_Sevilla).click().perform();
        action.moveToElement(Lista_Evento).click().perform();
        action.moveToElement(Evento_Jornada).click().perform();
        Fecha_Incio.sendKeys("01/02/2022");
        Fecha_Fin.sendKeys("12/12/2022");
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
    }

}
