package org.medioAmbiente.PPB004.CAP_F_052.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"layout_22\"]")
    private WebElementFacade Menu3;

    @FindBy(xpath = "//*[@id=\"layout_43\"]")
    private WebElementFacade Submenu;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[1]")
    private WebElementFacade Miga_Padre;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li")
    private WebElementFacade Miga;

    public void seleccionarEnlace() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu3)
                .perform();
        Submenu.click();
    }


    public void posicionarPuntero() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga_Padre)
                .perform();
    }

    public void clickarPagPadre() throws InterruptedException{
        Miga_Padre.click();
    }

    public void clickarMiga() throws InterruptedException {
        Miga.click();

    }
}
