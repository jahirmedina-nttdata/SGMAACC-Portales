package org.medioAmbiente.PPB001.CAP_F_068.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/avisos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category1-button\"]")
    private WebElementFacade Tipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'MONUMENTO NATURAL')]")
    private WebElementFacade Monumento_Natural;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_espaciosNaturales-button\"]")
    private WebElementFacade Nombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'ENCINA DE LA PEANA')]")
    private WebElementFacade Encina_Peana;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_category0-button\"]")
    private WebElementFacade Lista_Provincias;

    @FindBy(xpath = "//div[contains(text(),'ALMERÍA')]")
    private WebElementFacade Almeria;

    @FindBy(xpath = "//strong[@class=\"evr-article-result__txt\"]")
    private WebElementFacade Validar_Ficha;


    public void seleccionarTipoDeEspacio() throws InterruptedException {
        Tipo_Espacio.click();
        Monumento_Natural.click();
    }

    public void seleccionarProvincia() throws InterruptedException {
        Lista_Provincias.click();
        Almeria.click();
    }

    public void seleccionarNombreDeEspacio() throws InterruptedException {
        Nombre_Espacio.click();
        Encina_Peana.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarResultado() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"reflex-grid resultados\"]")));
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"reflex-grid resultados\"]"));
        String validar = Validar_Ficha.getText();
        if (validar.contains("PRECAUCIÓN POR RIESGO DE CAÍDA EN EL MONUMENTO NATURAL ENCINA DE LA P") && lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide Ficha");
        }
    }
}
