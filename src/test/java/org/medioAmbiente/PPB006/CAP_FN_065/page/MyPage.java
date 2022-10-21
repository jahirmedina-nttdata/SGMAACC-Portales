package org.medioAmbiente.PPB006.CAP_FN_065.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/campanas")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"Agua y cambio climático\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//a[@title=\"Formación ambiental\"]")
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
        if(textflotante.equals("Formación ambiental")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}