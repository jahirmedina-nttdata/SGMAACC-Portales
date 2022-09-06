package org.medioAmbiente.PPB004.CAP_FC_014.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/caza")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-cladt13-destacadosConDescripcionTresColumnas1\"]//h2/a")
    private WebElementFacade Enlace;


    public void validarTextFlotante() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace)
                .perform();

        String textflotante = Enlace.getAttribute("title");

        if(textflotante.equals("Cetrería en Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void clickarEnlace()throws InterruptedException  {
        Enlace.click();
    }


}
