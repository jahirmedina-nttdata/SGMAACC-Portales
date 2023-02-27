package org.medioAmbiente.PPB004.CAP_F_054.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    public void buscadorGeneral() throws InterruptedException{
        waitFor(3).second();
    }

    public void buscadorAvanzado() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/caza-y-pesca/buscador").toString());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),\"Mostrando\")]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void validarNumeroDeBusqueda() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class=\"evr-form-results__item-title\"]"));
        if (lista.size() > 8) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }


}
