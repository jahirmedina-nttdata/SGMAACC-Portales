package org.medioAmbiente.PPB002.CAP_F_013.page;


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


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/agenda-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//span[@class=\"d-month\"]")
    private WebElementFacade Select_Mes;

    @FindBy(xpath = "//div[@data-month=\"2\"]")
    private WebElementFacade Mes_Posterior;

    @FindBy(xpath = "//span[@class=\"d-year\"]")
    private WebElementFacade Select_Año;

    @FindBy(xpath = "//div[@data-year=\"1\"]")
    private WebElementFacade Año_Posterior;

    @FindBy(xpath = "//label/text[contains(text(),'14')]")
    private WebElementFacade Select_Dia;


    public void seleccionarMesPosterior() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Select_Mes).click().perform();
        action.moveToElement(Mes_Posterior).click().perform();
        List<WebElement> lista = getDriver().findElements(By.xpath("//input[@data-date=\"2023-02-01T05:00:00.000Z\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se visualiza los dias del mes");
        }
    }

    public void seleccionarAñoPosterior() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Select_Año).click().perform();
        action.moveToElement(Año_Posterior).click().perform();
        List<WebElement> lista = getDriver().findElements(By.xpath("//input[@data-date=\"2024-02-01T05:00:00.000Z\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se visualiza los dias del mes");
        }
    }

    public void clickarSobreDia() throws InterruptedException {
        Select_Dia.click();
    }
}
