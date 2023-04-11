package org.medioAmbiente.PPB003.CAP_F_166.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'CÁDIZ')]")
    private WebElementFacade Cadiz;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarAreaRecreativa() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
    }

    public void seleccionarCadiz() throws InterruptedException {
        Lista_Provincias.click();
        Cadiz.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarResultad() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -400)");
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"reflex-grid resultados\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Resultados");
        }
    }

}
