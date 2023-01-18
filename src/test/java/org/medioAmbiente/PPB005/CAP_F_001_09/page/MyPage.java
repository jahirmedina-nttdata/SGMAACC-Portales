package org.medioAmbiente.PPB005.CAP_F_001_09.page;


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

import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/portal-conocimiento/marco-organizativo")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),\"ESTÁNDARES\")]")
    private WebElementFacade Menu_Estandares;


    public void visualizarMenuLateralIzquierdo() throws InterruptedException {
            waitFor(1).second();
    }

    public void pulsarMenuLateralIzquierdo() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Menu_Estandares).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class=\"tituloNoticia\"]")));
    }

    public void pulsarSubmenuLateral() throws InterruptedException{
        getDriver().navigate().back();
    }

}
