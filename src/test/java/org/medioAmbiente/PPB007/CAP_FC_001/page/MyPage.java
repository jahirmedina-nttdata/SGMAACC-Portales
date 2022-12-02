package org.medioAmbiente.PPB007.CAP_FC_001.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("/medioambiente/portal/web/caza-y-pesca")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//a[@title=\"PORTAL DE LA CAZA Y PESCA CONTINENTAL EN ANDALUCIA\"]")
    private WebElementFacade Logo_CazaPesca;


    public void clickarLogoJunta() throws InterruptedException {
        Logo_Junta.click();
    }

    public void clickarLogoPortalCazaPesca() throws InterruptedException {
        getDriver().navigate().back();
        Logo_CazaPesca.click();
    }

    public void validarTextFlotante() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Logo_Junta).perform();

        String validar = Logo_Junta.getAttribute("title");

        if (validar.equals("Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide el Texto");
        }

    }
}
