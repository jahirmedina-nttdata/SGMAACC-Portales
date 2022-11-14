package org.medioAmbiente.PPB003.CAP_F_051.page;


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


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//h2/a[contains(text(),'Espacios Naturales')]")
    private WebElementFacade Espacio_Natural;

    @FindBy(xpath = "//h2/a[contains(text(),'Equipamientos')]")
    private WebElementFacade Equipamientos;

    @FindBy(xpath = "//h2/a[contains(text(),'Actividades')]")
    private WebElementFacade Actividades;

    @FindBy(xpath = "(//a[@title=\"Ir a Ventana del Visitante\"])[3]")
    private WebElementFacade Ventana_Visitante;


    public void comprobarElementos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 550)");

        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"evr-content-links\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Apartado");
        }
    }

    public void clickarEspaciosNaturales() throws InterruptedException {
        Espacio_Natural.click();
        WebElement iframe = getDriver().findElement(By.id( "ifr"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"m-panel-btn g-cartografia-mapa-ruta\"]")));
        getDriver().switchTo().defaultContent();
        Ventana_Visitante.click();
    }

    public void clickarEquipamientos() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 550)");
        Equipamientos.click();
        WebElement iframe = getDriver().findElement(By.id( "ifr"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"m-panel-btn g-cartografia-mapa-ruta\"]")));
        getDriver().switchTo().defaultContent();
        Ventana_Visitante.click();
    }

    public void clickarActividades() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 550)");
        Actividades.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"evr-actividades\"]")));
    }
}
