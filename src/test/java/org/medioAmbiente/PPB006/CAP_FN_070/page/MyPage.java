package org.medioAmbiente.PPB006.CAP_FN_070.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/documentacion")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Planes y programas para frenar el cambio climático en Andalucía\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//a[@title=\"Normativa sobre cambio climático en Andalucía\"]")
    private WebElementFacade Flotante;

    public void visualizarCAPFC010() throws InterruptedException{
        WebElement Element = getDriver().findElement(By.xpath("//h1[@id=\"evr-menu-block__title-principal\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Contenido.click();
        getDriver().navigate().back();

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if(textflotante.equals("Normativa sobre cambio climático en Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}