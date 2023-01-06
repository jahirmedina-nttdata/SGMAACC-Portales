package org.medioAmbiente.PPB003.CAP_F_116.page;


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


@DefaultUrl("/medioambiente/portal/web/guest/buscador-de-revistas-y-boletines")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_pagination\"]/li[8]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//div[2]//div[2]/a")
    private WebElementFacade Revista;

    public void clickarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
        Paginador.click();
    }

    public void seleccionarRevista() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Revista.click();
    }

    public void retrocederPagina() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        waitFor(4).second();
        List<WebElement> lista = getDriver().findElements(By.xpath("//li[@class=\"page_number active pag_num_6\"]/a"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No esta cacheando");
        }
    }
}