package org.medioAmbiente.PPB006.CAP_FC_011.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/emisiones-difusas")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//ul/li[3]/a")
    private WebElementFacade Miga_Padre;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//ul/li[3]")
    private WebElementFacade Miga_Actual;


    public void posicionarPuntero() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga_Padre)
                .perform();
    }

    public void clickarPadre() throws InterruptedException{
        Miga_Padre.click();
    }

    public void clickarActual() throws InterruptedException{
        Miga_Actual.click();
    }
}
