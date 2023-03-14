package org.medioAmbiente.PPB002.CAP_F_134.page;


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


@DefaultUrl("/medioambiente/portal/web/guest/buscador-agenda-por-dias")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_uC4fnnj4ZZYH_pagination\"]/li[7]")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_uC4fnnj4ZZYH_resultsDiv\"]/section/div/div[1]/div/div/a[1]")
    private WebElementFacade Agenda;

    public void clickarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        Paginador.click();
    }

    public void seleccionarAgenda() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Agenda.click();
    }

    public void retrocederPagina() throws InterruptedException {
        getDriver().navigate().back();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 300)");
        waitFor(2).second();
        List<WebElement> lista = getDriver().findElements(By.xpath("//li[@class=\"page_number active pag_num_5\"]/a"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No esta cacheando");
        }
    }
}