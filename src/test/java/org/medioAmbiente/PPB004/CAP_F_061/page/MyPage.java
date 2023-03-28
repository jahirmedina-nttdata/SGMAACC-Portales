package org.medioAmbiente.PPB004.CAP_F_061.page;


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


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/caza")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Cetrería en Andalucía\"]")
    private WebElementFacade Enlace;

    public void mostrarDestacamos()throws InterruptedException  {
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Seguridad cinegética')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }
    public void validarTextFlotante() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Seguridad cinegética')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace)
                .perform();

        String textflotante = Enlace.getAttribute("title");

        if(textflotante.contains("Cetrería en Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void clickarEnlace()throws InterruptedException  {
        Enlace.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),\"Cetrería en Andalucía\")])[2]")));
        getDriver().navigate().back();
    }


}