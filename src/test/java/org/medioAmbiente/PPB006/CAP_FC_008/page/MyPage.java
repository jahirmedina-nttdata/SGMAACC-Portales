package org.medioAmbiente.PPB006.CAP_FC_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/mitigacion")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_INSTANCE_I47odfhvNXSE\"]//ul/li[3]//a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_INSTANCE_I47odfhvNXSE\"]//ul/li[2]//a")
    private WebElementFacade Texto_Flotante;

    public void visualizarDiseño()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 980)");
    }
    public void accederContenido() throws InterruptedException {
        Contenido.click();
    }

    public void validarTextoflotante() throws InterruptedException {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Texto_Flotante)
                .perform();

        String flotante = Texto_Flotante.getAttribute("title");

        if(flotante.equals("SERVICIO DE ATENCIÓN CIUDADANA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }


}
