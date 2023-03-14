package org.medioAmbiente.PPB003.CAP_F_183.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/avisos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_resultsDiv\"]/div/div[1]/div/div/span[2]")
    private WebElementFacade Resultado_Cantidad;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_NnDPygTc2VqD_asset0\"]/div/strong")
    private WebElementFacade Validar_Ficha;


    public void buscarPortexto() throws InterruptedException {
       Texto_Buscar.sendKeys("zona");
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarFicha() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"reflex-grid resultados\"]")));
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"reflex-grid resultados\"]"));
        String ficha = Validar_Ficha.getText();
        //String cantidad = Resultado_Cantidad.getText();

        if(ficha.contains("Zona") && lista.size() != 0) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No realiza busqueda");
        }
    }

}
