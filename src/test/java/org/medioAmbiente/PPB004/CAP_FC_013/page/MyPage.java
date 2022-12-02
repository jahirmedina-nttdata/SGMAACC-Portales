package org.medioAmbiente.PPB004.CAP_FC_013.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/caza")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_menu_web_portlet_SiteNavigationMenuPortlet_INSTANCE_MRclJosGKC5I\"]//li[1]//a")
    private WebElementFacade pagina;


    public void posicionarPuntero() throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.moveToElement(pagina)
                .perform();

        String textflotante = pagina.getAttribute("title");

        if(textflotante.equals("SERVICIO DE ATENCIÓN CIUDADANA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void accederPag()throws InterruptedException  {
        pagina.click();
    }
}
