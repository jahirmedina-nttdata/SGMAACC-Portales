package org.medioAmbiente.PPB003.CAP_F_126.page;


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

import java.sql.SQLException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category2_input\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category2_itemList\"]/ul/li[1]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category1-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//button[contains(text(),\"APLICAR\")]")
    private WebElementFacade btnAplicar;


    public void seleccionarAreaRecreativa() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Tipo_Equipamiento).click().perform();
        action.moveToElement(Area_Recreativa).click().perform();
        action.moveToElement(btnAplicar).click().perform();
    }

    public void seleccionarAlmeria() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Lista_Provincias).click().perform();
        action.moveToElement(Almeria).click().perform();
    }

    public void clickarBuscar() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(btnBuscar).click().perform();
    }

    public void validarResultado() throws InterruptedException, SQLException {
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
