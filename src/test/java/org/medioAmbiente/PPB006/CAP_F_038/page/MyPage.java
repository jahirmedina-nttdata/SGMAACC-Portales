package org.medioAmbiente.PPB006.CAP_F_038.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/emisiones-industriales")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Sistema Andaluz de Compensación de Emisiones (SACE)\"]")
    private WebElementFacade Imagen;

    @FindBy(xpath = "//a[@title=\"Régimen del Comercio de Derechos de Emisión\"]")
    private WebElementFacade Flotante;

    public void visualizarCAPF112() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//h1[@id=\"evr-menu-block__title-principal\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Imagen.click();
        getDriver().navigate().back();

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if (textflotante.equals("Régimen del Comercio de Derechos de Emisión")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide el Texto");
        }

    }
}