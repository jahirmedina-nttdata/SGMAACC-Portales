package org.medioAmbiente.PPB005.CAP_F_001_04.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/portal-conocimiento")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),\"Plantilla de contratos para Servicios WEB\")]")
    private WebElementFacade Noticia;


    public void mostrarSeccionNoticias() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 600)");
        waitFor(2).second();
        List<WebElement> lista = getDriver().findElements(By.xpath("//span[contains(text(),\"NOTICIAS\")]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe menu navegacion");
        }
    }


    public void accedoANoticia() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Noticia).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),\"Plantilla de contratos para Servicios WEB\")]")));
    }

}
