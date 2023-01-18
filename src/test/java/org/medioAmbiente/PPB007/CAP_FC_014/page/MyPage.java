package org.medioAmbiente.PPB007.CAP_FC_014.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/cae/sellos-electrónicos-y-sistemas-de-firmas-automatizadas")


public class MyPage extends PageObject {


    @FindBy(xpath = "//a[contains(text(),\"Información General\")]")
    private WebElementFacade Miga;

    @FindBy(xpath = "//li[contains(text(),\"Información General\")]")
    private WebElementFacade Miga_Actual;



    public void visualizarCaminoMigas() throws InterruptedException {
        waitFor(1).second();
    }


    public void posicionarPuntero() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga)
                .perform();
        waitFor(1).second();
    }

    public void clickarElementoPadre() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-menu-block__title-principal\"]")));
    }

    public void clickarMigaActual() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga_Actual).click().perform();
        waitFor(1).second();
    }

}
