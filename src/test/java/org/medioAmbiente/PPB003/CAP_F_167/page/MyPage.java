package org.medioAmbiente.PPB003.CAP_F_167.page;


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

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category1-button\"]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'MONUMENTO NATURAL')]")
    private WebElementFacade Monumento_Natural;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_espaciosNaturales-button\"]")
    private WebElementFacade Nombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'ENCINA DE LA PEANA')]")
    private WebElementFacade Encina_Peana;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almería;


    public void seleccionarTipoDeEspacio() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 850)");
        Tipo_Espacio.waitUntilClickable();
        Tipo_Espacio.click();
        Monumento_Natural.click();
    }

    public void seleccionarNombreDeEspacio() throws InterruptedException {
        Nombre_Espacio.click();
        Encina_Peana.click();
    }

    public void seleccionarProvincia() throws InterruptedException {
       Lista_Provincias.click();
       Almería.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarResultado() throws InterruptedException {
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
