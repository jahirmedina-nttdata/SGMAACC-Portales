package org.medioAmbiente.PPB006.CAP_FN_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_6AhVby6BhP1b\"]//section//li[1]//a")
    private WebElementFacade Contenido1;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_6AhVby6BhP1b\"]//section//li[2]//a")
    private WebElementFacade Contenido2;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_6AhVby6BhP1b\"]//section//li[3]//a")
    private WebElementFacade Contenido3;

    public void visualizarCAPFC014() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido1)
                .moveToElement(Contenido3)
                .perform();
        Thread.sleep(2000);
        Contenido1.click();
        getDriver().navigate().back();
        Thread.sleep(2000);

        Actions actions1 = new Actions(getDriver());
        actions1.moveToElement(Contenido2)
                .perform();
        String textflotante = Contenido2.getAttribute("title");

        if(textflotante.equals("ADMINISTRACIONES LOCALES")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}