package org.medioAmbiente.PPB002.CAP_F_005.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/acceso-rediam")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Teledetección y territorio\"]")
    private WebElementFacade Enlace_Teledeteccion;


    public void seccionInformacionAmbientalAndalucia() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("(//a[@title=\"Ecobarómetro de Andalucía\"])[1]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void clickarEnlace() throws InterruptedException{
        Enlace_Teledeteccion.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Teledetección y caracterización del territorio')])[2]")));
    }
}
