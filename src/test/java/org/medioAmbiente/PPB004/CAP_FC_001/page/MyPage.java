package org.medioAmbiente.PPB004.CAP_FC_001.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL13t3R1zQ\"]//a")
    private WebElementFacade Logo_Portal;

    @FindBy(xpath = "//a[@href=\"/medioambiente/portal/web/caza-y-pesca\"]")
    private WebElementFacade Flotante;


    public void clickarLogoJunta() throws InterruptedException {
        Logo_Junta.click();
    }

    public void clickarLogoCasaPesca() throws InterruptedException{
        getDriver().navigate().back();
        Logo_Portal.click();
    }

    public void visualizarTextFlotante()throws InterruptedException {
        Actions actions = new Actions(getDriver());
               actions.moveToElement(Flotante).perform();
    }
}
