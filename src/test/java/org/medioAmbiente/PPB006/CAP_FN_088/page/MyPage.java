package org.medioAmbiente.PPB006.CAP_FN_088.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/la-perspectiva-del-cambio-climático-en-la-evaluacion-ambiental")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-ttpi0\"]//a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"card-ttpi3\"]//a")
    private WebElementFacade Flotante;


    public void visualizarCAPFC006() throws InterruptedException{
        Contenido.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");

        if(textflotante.equals("Escenarios climáticos en Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}