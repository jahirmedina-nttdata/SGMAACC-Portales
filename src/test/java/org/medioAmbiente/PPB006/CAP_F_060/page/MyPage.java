package org.medioAmbiente.PPB006.CAP_F_060.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/comunicacion-y-participacion")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-ttpi0\"]//a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"card-ttpi1\"]//a")
    private WebElementFacade Flotante;

    public void visualizarCAPF106() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
    }

    public void visualizarCAPF108() throws InterruptedException{
        Contenido.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if(textflotante.equals("Buscador de publicaciones digitales sobre cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}