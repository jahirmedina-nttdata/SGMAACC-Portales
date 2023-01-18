package org.medioAmbiente.PPB005.CAP_F_001_11.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/portal-conocimiento/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),\"Publicación del boletín\")]")
    private WebElementFacade Noticia;


    public void ubicarseEnSeccionNoticias() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }

    public void pulsarEnNoticias() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Noticia).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),\"Publicación del boletín\")]")));
        List<WebElement> descripcion = getDriver().findElements(By.xpath("//div[@class=\"evr-detalle__txt\"]"));
        if (descripcion.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe descripcion");
        }
    }

}
