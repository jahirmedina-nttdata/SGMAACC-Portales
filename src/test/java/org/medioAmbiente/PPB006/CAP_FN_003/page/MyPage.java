package org.medioAmbiente.PPB006.CAP_FN_003.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a")
    private WebElementFacade Imagen_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL13t3R1zQ\"]//span/a")
    private WebElementFacade Texto_Portal;

    @FindBy(xpath = "//*[@id=\"layout_44\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_102\"]")
    private WebElementFacade SubMenu;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[3]/a")
    private WebElementFacade Miga_Padre;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[3]")
    private WebElementFacade Miga_Actual;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[2]/a")
    private WebElementFacade Home;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[1]/a")
    private WebElementFacade Portal_Ambiental;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[2]/a")
    private WebElementFacade Portal_Caza;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[3]/a")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[4]/a")
    private WebElementFacade Canal_Admin;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rc3N7\"]//ul/li[1]/a")
    private WebElementFacade Plan_Andaluz;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rc3N7\"]//ul/li[2]/a")
    private WebElementFacade Preguntas_Frecuentes;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[1]/a/img")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[2]/a/img")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[3]/a/img")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//ul/li[1]/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//ul/li[2]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[1]/a")
    private WebElementFacade Mapa_WEb;


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[3]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[4]/a")
    private WebElementFacade Condicion_Uso;


    public void visualizarCAPFC01() throws InterruptedException {
        Imagen_Junta.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Imagen_Junta)
                .perform();
        String textflotante = Imagen_Junta.getAttribute("title");
        if(textflotante.equals("Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

        Texto_Portal.click();

        Actions actions1 = new Actions(getDriver());
        actions1.moveToElement(Texto_Portal)
                .perform();

        String textflotante1 = Texto_Portal.getAttribute("title");

        if(textflotante1.equals("Portal Andaluz de Cambio Climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }

    public void visualizarCAPFC12() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();

        Actions actions1 = new Actions(getDriver());
        actions1.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }

    public void visualizarCAPFC11() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga_Padre)
                .perform();
        Miga_Padre.click();
        Miga_Actual.click();
        Home.click();
    }

    public void visualizarCAPFC13() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Portal_Ambiental.click();
        getDriver().navigate().back();

        Portal_Caza.click();
        getDriver().navigate().back();

        Ventana_Visitante.click();
        getDriver().navigate().back();

        Canal_Admin.click();
        getDriver().navigate().back();

        Plan_Andaluz.click();
        getDriver().navigate().back();

        Preguntas_Frecuentes.click();
        getDriver().navigate().back();

        Twitter.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Facebook.click();
        Set<String> wndf = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i1 = wndf.iterator();
        prntw = i1.next();
        popwnd = i1.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Instagram.click();
        Set<String> wndi = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i2 = wndi.iterator();
        prntw = i2.next();
        popwnd = i2.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Junta.click();
        Set<String> wnd1 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i3 = wnd1.iterator();
        prntw = i3.next();
        popwnd = i3.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Union.click();
        Set<String> wnd2 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i4 = wnd2.iterator();
        prntw = i4.next();
        popwnd = i4.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Mapa_WEb.click();
        getDriver().navigate().back();

        Accesibilidad.click();
        getDriver().navigate().back();

        Condicion_Uso.click();
    }
}
