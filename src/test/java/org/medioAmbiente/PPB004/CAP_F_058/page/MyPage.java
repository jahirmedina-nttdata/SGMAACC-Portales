package org.medioAmbiente.PPB004.CAP_F_058.page;


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


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/caza")



public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"SERVICIO DE ATENCIÓN CIUDADANA\"]/span[contains(text(),\"Periodos hábiles de caza\")]")
    private WebElementFacade Titulo_Animacion;

    @FindBy(xpath = "//a[@title=\"SERVICIO DE ATENCIÓN CIUDADANA\"]/span[contains(text(),\"Homologación de trofeos\")]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "(//a[@title=\"SERVICIO DE ATENCIÓN CIUDADANA\"])[5]")
    private WebElementFacade Texto_Flotante;


    public void mostrarListado() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        waitFor(1).second();
    }

    public void mostrarAnimacion() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Titulo_Animacion)
                .perform();
    }

    public void clickarEnlace() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),\"HOMOLOGACIÓN DE TROFEOS DE CAZA EN ANDALUCÍA\")]")));
    }

    public void validarTextoFlotante() throws InterruptedException{
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();

        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.equals("SERVICIO DE ATENCIÓN CIUDADANA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

}
