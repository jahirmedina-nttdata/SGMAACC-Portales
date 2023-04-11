package org.medioAmbiente.PPB002.CAP_F_039.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/acceso-rediam/ecobarometro-de-andalucia")


public class MyPage extends PageObject {

    @FindBy(xpath = "//button[@aria-label=\"Next\"]")
    private WebElementFacade Siguente;

    @FindBy(xpath = "//button[@aria-label=\"Previous\"]")
    private WebElementFacade Atras;

    @FindBy(xpath = "//a[@title=\"Datos Básicos de Medio Ambiente en Andalucía\"]")
    private WebElementFacade Tarjeta;


    public void visualizarCarrusel() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 950)");

    }

    public void comprobarFuncionamientoDeFlechas() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Siguente).click().perform();
        waitFor(1).second();
        action.moveToElement(Atras).click().perform();
        waitFor(1).second();
    }

    public void clickarEnlace() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Tarjeta).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Datos Básicos de Medio Ambiente en Andalucía\")])[2]")));
    }


}
