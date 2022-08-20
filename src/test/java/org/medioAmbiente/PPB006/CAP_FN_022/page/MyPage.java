package org.medioAmbiente.PPB006.CAP_FN_022.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/actua")



public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"slick-slide00\"]/a/div/div")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"slick-slide01\"]/a")
    private WebElementFacade Flotante;

    public void visualizarCAPFC004() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void visualizarCAPFC009()  throws InterruptedException{
        Enlace.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if(textflotante.equals("Buenas prácticas en el puesto de trabajo y en el aula")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}