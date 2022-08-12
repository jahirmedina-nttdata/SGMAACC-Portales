package org.medioAmbiente.PPB004.CAP_FC_017.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/terrenos-cinegéticos")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_VTr3UpWfPhP8\"]//div[2]//div[2]/div/h2/a")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_VTr3UpWfPhP8\"]//div[2]//div[1]/div/h2/a")
    private WebElementFacade Texto_Flotante;

    public void navegarContenido()throws InterruptedException  {
        Enlace.click();
    }
    public void validarTextFlotante() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();
        Thread.sleep(2000);
        String textflotante = Texto_Flotante.getAttribute("title");

        if(textflotante.equals("Tipos de terrenos cinegéticos")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }


}
