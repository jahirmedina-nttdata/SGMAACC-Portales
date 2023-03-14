package org.medioAmbiente.PPB003.CAP_F_121.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category0-button\"]")
    private WebElementFacade SelectTipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'LUGAR DE IMPORTANCIA COMUNITARIA')]")
    private WebElementFacade Importancia_Comunitaria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_espaciosNaturales-button\"]")
    private WebElementFacade SelectNombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'DUNAS DEL ODIEL')]")
    private WebElementFacade Dunas_Odiel;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarImportanciaComunitaria() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(SelectTipo_Espacio).click().perform();
        action.moveToElement(Importancia_Comunitaria).click().perform();
    }

    public void seleccionarDunasOdiel() throws InterruptedException {
        SelectNombre_Espacio.waitUntilClickable();
        Actions action = new Actions(getDriver());
        action.moveToElement(SelectNombre_Espacio).click().perform();
        action.moveToElement(Dunas_Odiel).click().perform();
    }

    public void clickarBuscar() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnBuscar).click().perform();
    }

    public void validarResultado() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"evr-map-result__paragraph\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Resultados");
        }
    }

}
