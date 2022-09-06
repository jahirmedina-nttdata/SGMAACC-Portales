package org.medioAmbiente.PPB001.CAP_F_104.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/publicaciones?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_searchTextInput\"]")
    private WebElementFacade Buscar_Texto;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_searchButton\"]")
    private WebElementFacade btnBuscar;

    public void escribirTextoBuscar() throws InterruptedException {
        Buscar_Texto.sendKeys("guía");
    }

    public void clickarBuscar() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        btnBuscar.click();
    }

    public void validarBusqueda() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        List<WebElement> lista = getDriver().findElements(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_resultsDiv\"]/div/div[2]/table/tbody/tr"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }
}
