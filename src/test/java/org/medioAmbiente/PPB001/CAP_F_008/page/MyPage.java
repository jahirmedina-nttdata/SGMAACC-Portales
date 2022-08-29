package org.medioAmbiente.PPB001.CAP_F_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/actualidad")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]/div/div/div/ul/li[1]/a")
    private WebElementFacade btnTwitter;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]/div/div/div/ul/li[2]/a")
    private WebElementFacade btnFacebook;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]/div/div/div/ul/li[3]/a")
    private WebElementFacade btnInstagram;

    public void clickBtnTwitter() throws InterruptedException {
        btnTwitter.click();
    }

    public void clickBtnFacebook() throws InterruptedException {
        btnFacebook.click();
    }
    public void clickBtnInstagram() throws InterruptedException {
        btnInstagram.click();
    }

}
