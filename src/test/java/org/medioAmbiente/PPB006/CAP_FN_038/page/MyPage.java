package org.medioAmbiente.PPB006.CAP_FN_038.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/emisiones-industriales")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"slick-slide00\"]/a")
    private WebElementFacade Imagen;

    @FindBy(xpath = "//*[@id=\"slick-slide01\"]/a")
    private WebElementFacade Flotante;
    public void visualizarCAPFC010() throws InterruptedException{
        Imagen.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();


        String textflotante = Flotante.getAttribute("title");

        if(textflotante.equals("Régimen del Comercio de Derechos de Emisión")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}