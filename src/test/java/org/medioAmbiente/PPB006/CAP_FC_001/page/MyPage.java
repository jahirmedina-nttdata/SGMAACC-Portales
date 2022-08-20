package org.medioAmbiente.PPB006.CAP_FC_001.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a")
    private WebElementFacade Imagen_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL13t3R1zQ\"]//span/a")
    private WebElementFacade Texto_Portal;

    public void clickarImageJunta() throws InterruptedException {
        Imagen_Junta.click();
    }

    public void validarJuntaFlotante() throws InterruptedException{
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Imagen_Junta)
                .perform();

        String textflotante = Imagen_Junta.getAttribute("title");

        if(textflotante.equals("Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void clickarTextoPortal() throws InterruptedException {
        Texto_Portal.click();
    }

    public void validarPortalFlotante() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Portal)
                .perform();

        String textflotante = Texto_Portal.getAttribute("title");

        if(textflotante.equals("Portal Andaluz de Cambio Climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }
}
