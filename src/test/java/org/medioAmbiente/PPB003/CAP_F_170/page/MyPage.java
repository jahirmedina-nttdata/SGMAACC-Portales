package org.medioAmbiente.PPB003.CAP_F_170.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_yzet4Tz8dA7q_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//strong[@class=\"evr-article-result__txt\"]")
    private WebElementFacade Validar_Filtro;


    public void buscarPortexto() throws InterruptedException {
       Texto_Buscar.sendKeys("congreso");
    }

    public void clickarBuscar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        btnBuscar.click();
    }

    public void validarFichas() throws InterruptedException {
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"reflex-grid resultados\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Resultados");
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -500)");
        String validar = Validar_Filtro.getAttribute("innerText");
        if(validar.contains("CONGRESO")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No realiza busqueda");
        }

    }

}
