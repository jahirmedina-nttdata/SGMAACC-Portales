package org.medioAmbiente.PPB006.CAP_FN_012.page;


import kotlin.concurrent.ThreadsKt;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/el-cambio-climatico")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_INSTANCE_I47odfhvNXSE\"]//li[2]/div/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_INSTANCE_I47odfhvNXSE\"]//li[3]/div/a")
    private WebElementFacade Texto_Flotante;


    public void visualizarCAPFC008()  throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");
        Contenido.click();
        getDriver().navigate().back();

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