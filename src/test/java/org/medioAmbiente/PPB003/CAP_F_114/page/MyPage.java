package org.medioAmbiente.PPB003.CAP_F_114.page;


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


@DefaultUrl("/medioambiente/portal/web/guest/buscador-de-materiales-divulgativos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_pagination\"]/li[6]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_GFwsFY3Uow8r_resultsDiv\"]//div[3]//div[2]/a")
    private WebElementFacade Material_Divulgativo;

    public void clickarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
        Paginador.click();
    }

    public void seleccionarMaterialDivulgativos() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Material_Divulgativo.click();
    }

    public void retrocederPagina() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        j.executeScript("window.scrollBy(0, 100)");
        waitFor(2).second();
        List<WebElement> lista = getDriver().findElements(By.xpath("//li[@class=\"page_number active pag_num_4\"]/a"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No esta cacheando");
        }
    }
}