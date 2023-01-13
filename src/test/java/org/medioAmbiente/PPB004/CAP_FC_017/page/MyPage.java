package org.medioAmbiente.PPB004.CAP_FC_017.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/terrenos-cinegéticos")



public class MyPage extends PageObject {


    @FindBy(xpath = "//a[@title=\"Guarda de coto de caza\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//a[@title=\"Tipos de terrenos cinegéticos\"]")
    private WebElementFacade Texto_Flotante;

    public void mostrarContenido()throws InterruptedException  {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        waitFor(1).second();
    }
    public void navegarContenido()throws InterruptedException  {
        Actions action = new Actions(getDriver());
        action.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h1[contains(text(),'Guarda de coto de caza')])[2]")));
    }
    public void validarTextFlotante() throws InterruptedException{
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();
        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.contains("Tipos de terrenos cinegéticos")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }



}
