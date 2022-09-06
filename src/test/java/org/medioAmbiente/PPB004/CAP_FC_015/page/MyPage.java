package org.medioAmbiente.PPB004.CAP_FC_015.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/especies-cinegéticas")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_VTr3UpWfPhP8\"]//div[2]//div[4]//h2/a")
    private WebElementFacade Enlace;

    public void navegarContenido()throws InterruptedException  {
        Enlace.click();
        getDriver().navigate().back();
    }
    public void validarTextFlotante() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace)
                .perform();

        String textflotante = Enlace.getAttribute("title");

        if(textflotante.equals("Especies cinegéticas de predadores")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }


}
