package org.medioAmbiente.PPB003.CAP_F_117.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/cae/tramites-y-servicios?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//li[@class=\"page_number pag_num_7\"]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//a[@title=\"Presentación del Plan de minimización de residuos\"]")
    private WebElementFacade Enlace;

    public void clickarPaginador() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 600)");
        waitFor(2).second();
        j.executeScript("window.scrollBy(0, 500)");
        Paginador.click();
    }

    public void clickarEnlace() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        WebElement Element = getDriver().findElement(By.xpath("//p[contains(text(),'Mostrando')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Enlace.click();
    }

    public void retrocederPagina() throws InterruptedException {
        getDriver().navigate().back();
        waitFor(3).second();
    }

    public void validarCacheoDePaginador() throws InterruptedException {
        List<WebElement> lista = getDriver().findElements(By.xpath("//li[@class=\"page_number active pag_num_7\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No esta cacheando");
        }
    }
}