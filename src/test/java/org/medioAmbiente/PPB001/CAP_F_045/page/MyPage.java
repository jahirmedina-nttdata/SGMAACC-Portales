package org.medioAmbiente.PPB001.CAP_F_045.page;


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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/galería-multimedia?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_category1-button\"]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'LUGAR DE IMPORTANCIA COMUNITARIA')]")
    private WebElementFacade Importancia_Comunitaria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_espaciosNaturales-button\"]")
    private WebElementFacade Nombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'MARISMAS DEL ODIEL')]")
    private WebElementFacade Marismas_Odiel;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarTipoDeEspacio() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Tipo_Espacio.click();
        Importancia_Comunitaria.click();
    }

    public void seleccionarNombreDeEspacio() throws InterruptedException {
        waitFor(2).second();
        Nombre_Espacio.waitUntilClickable();
        Nombre_Espacio.click();
        Marismas_Odiel.click();
    }

    public void clickarBuscar() throws InterruptedException {
       btnBuscar.click();
    }

    public void validarResutado() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        List<WebElement> lista = getDriver().findElements(By.xpath("(//div[@class=\"reflex-grid\"])[2]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Resultados");
        }
    }

}
