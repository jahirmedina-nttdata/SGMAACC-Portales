package org.medioAmbiente.PPB007.CAP_FC_009.page;


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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@DefaultUrl("/medioambiente/portal/web/cae/tablon-de-anuncios?categoryVal=")


public class MyPage extends PageObject {


    @FindBy(xpath = "//button/span[contains(text(),\"Buscar\")]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button/span[contains(text(),\"Limpiar\")]")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//input[@title=\"Buscar\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//span[@title=\"category-provincias\"]")
    private WebElementFacade SelectProvincia;

    @FindBy(xpath = "//div[contains(text(),\"Huelva\")]")
    private WebElementFacade Provincia;

    @FindBy(xpath = "//input[@placeholder=\"Desde\"]")
    private WebElementFacade Fecha_Inicio;

    @FindBy(xpath = "//input[@placeholder=\"Hasta\"]")
    private WebElementFacade Fecha_Fin;

    @FindBy(xpath = "(//div[@class=\"evr-form-results__item-title\"]/a)[2]")
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

    private String prntw;
    private String popwnd;

    public void visualizarContenido() throws InterruptedException {
        waitFor(1).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        List<WebElement> Campo_Texto = getDriver().findElements(By.xpath("//input[@title=\"Buscar\"]"));
        List<WebElement> Campo_SelectProv = getDriver().findElements(By.xpath("//span[@title=\"category-provincias\"]"));
        List<WebElement> Campo_FechaInicio = getDriver().findElements(By.xpath("//input[@placeholder=\"Desde\"]"));
        List<WebElement> Campo_FechaFin = getDriver().findElements(By.xpath("//input[@placeholder=\"Hasta\"]"));
        if (Campo_Texto.size() != 0 && Campo_SelectProv.size() != 0 && Campo_FechaInicio.size() != 0 && Campo_FechaFin.size() != 0) {
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
        Texto_Buscar.sendKeys("Anuncio");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnBuscar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorProvincia() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        actions.moveToElement(SelectProvincia).click().perform();
        actions.moveToElement(Provincia).click().perform();
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorFechaInicio() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Fecha_Inicio.sendKeys("05/05/2021");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void buscarPorFechaFin() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Fecha_Fin.sendKeys("09/02/2022");
        actions.moveToElement(btnBuscar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

    public void clickarEnlace() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnLimpiar).click().perform();
        actions.moveToElement(Enlace).click().perform();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        waitFor(2).second();
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }

    public void ejecutarCAPFN030() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");
        Paginador.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        btnSiguiente.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Ultima_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        btnAnterior.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        Primera_Pagina.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
    }

}
