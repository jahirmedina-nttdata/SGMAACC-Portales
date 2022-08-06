package org.medioAmbiente.PPB002.CAP_F_004.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//li[2]/a")
    private WebElementFacade btnunioneuropea;


    public void clickarUnionEuropea() {

        btnunioneuropea.click();
    }
}
