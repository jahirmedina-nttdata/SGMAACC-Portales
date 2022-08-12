package org.medioAmbiente.PPB006.CAP_FC_005.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_2L7JS5ZUGVJn\"]//div[2]/div[1]/a")
    private WebElementFacade Noticia;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_2L7JS5ZUGVJn\"]//div[2]//div[1]/div[1]/a")
    private WebElementFacade Notica_Flotante;


    public void accederNoticia() throws InterruptedException {
        Noticia.click();
    }

    public void validarTextoflotante() throws InterruptedException {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Notica_Flotante)
                .perform();

        String flotante = Notica_Flotante.getAttribute("title");

        if(flotante.equals("Nuevos visores de adaptación de las costas al cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}
