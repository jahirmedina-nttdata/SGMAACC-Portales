package org.medioAmbiente.PPB006.CAP_FN_077.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/cambio-climatico/la-estrategia-en-andalucia")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-ttpi0\"]//a")
    private WebElementFacade Contenido;


    public void visualizarCAPFC004() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");
    }

    public void visualizarCAPFC006() throws InterruptedException{
        Contenido.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());

        actions.moveToElement(Contenido)
                .perform();

        String textflotante = Contenido.getAttribute("title");
        if(textflotante.equals("Oficina Andaluza de Cambio Climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}