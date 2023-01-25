package org.medioAmbiente.PPB001.CAP_F_013.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/buscador-de-noticias")


public class MyPage extends PageObject {


    @FindBy(xpath = "//input[@title=\"Buscar\"]")
    private WebElementFacade Buscador_Especifico;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avanzada;


    @FindBy(xpath = "//input[@placeholder=\"Desde\"]")
    private WebElementFacade Fecha_Incio;

    @FindBy(xpath = "//input[@placeholder=\"Hasta\"]")
    private WebElementFacade Fecha_Fin;

    @FindBy(xpath = "//button/span[contains(text(),\"Buscar\")]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//span[@title=\"category-temática--noticias\"]")
    private WebElementFacade Lista_Tematica;

    @FindBy(xpath = "//div[contains(text(),\"Agua\")]")
    private WebElementFacade Tematica;

    @FindBy(xpath = "//span[@title=\"ordenacion-resultados\"]")
    private WebElementFacade Lista_Ordenacion;

    @FindBy(xpath = "//div[contains(text(),\"Fecha de publicación ascendente\")]")
    private WebElementFacade Publicacion_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título ascendente\")]")
    private WebElementFacade Titulo_Asc;

    @FindBy(xpath = "//div[contains(text(),\"Título descendente\")]")
    private WebElementFacade Titulo_Desc;


    @FindBy(xpath = "//div[contains(text(),\"Atmósfera\")]")
    private WebElementFacade Tematica_Atmosfera;

    public void buscarPorTexto() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Buscador_Especifico.sendKeys("Voluntarios"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorTematica() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Lista_Tematica).click().perform();
        action.moveToElement(Tematica).click().perform();
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void buscarPorFechaDesdeYHasta() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Busqueda_Avanzada).click().perform();
        action.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 180)");
        Fecha_Incio.sendKeys("01/02/2022");
        Fecha_Fin.sendKeys("12/05/2022");
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
        Buscador_Especifico.sendKeys("Junta");
        action.moveToElement(Lista_Tematica).click().perform();
        action.moveToElement(Tematica_Atmosfera).click().perform();
        Fecha_Incio.sendKeys("01/02/2022");
        Fecha_Fin.sendKeys("12/05/2022");
        action.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
    }

}
