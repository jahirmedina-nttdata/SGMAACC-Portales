package org.medioAmbiente.PPB007.CAP_F_041.page;


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

@DefaultUrl("/medioambiente/portal/web/cae/informacion-general")


public class MyPage extends PageObject {


    @FindBy(xpath = "//a[@title=\"Calendario días inhábiles\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//a[@title=\"Sistemas de firma y formatos de documentos\"]")
    private WebElementFacade TextoFlotante;


    public void visualizarContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        waitFor(1).second();
    }


    public void clickarEnlace() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"Calendario laboral\")]")));
    }

    public void mostrarTextoFlotante() throws InterruptedException {
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(TextoFlotante)
                .perform();
        String textflotante = TextoFlotante.getAttribute("title");

        if(textflotante.equals("Sistemas de firma y formatos de documentos")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto Flotante");
        }
    }

}
