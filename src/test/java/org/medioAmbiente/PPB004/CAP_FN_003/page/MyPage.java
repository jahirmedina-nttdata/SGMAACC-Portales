package org.medioAmbiente.PPB004.CAP_FN_003.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")


public class MyPage extends PageObject {

    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL13t3R1zQ\"]//a")
    private WebElementFacade Logo_Portal;

    @FindBy(xpath = "//a[@href=\"/medioambiente/portal/web/caza-y-pesca\"]")
    private WebElementFacade Flotante;

    @FindBy(xpath = "//*[@id=\"layout_20\"]")
    private WebElementFacade Menu1;

    @FindBy(xpath = "//*[@id=\"layout_21\"]")
    private WebElementFacade Menu2;

    @FindBy(xpath = "//*[@id=\"layout_22\"]")
    private WebElementFacade Menu3;

    @FindBy(xpath = "//*[@id=\"layout_43\"]")
    private WebElementFacade Submenu;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[1]")
    private WebElementFacade Miga_Padre;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li")
    private WebElementFacade Miga;


    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[1]/a")
    private WebElementFacade Portal_Ambiental;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[2]/a")
    private WebElementFacade Portal_Andaluz;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[3]/a")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[4]/a")
    private WebElementFacade Canal_Admin;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rc3N7\"]//ul/li[1]/a")
    private WebElementFacade Periodos_Habiles;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rc3N7\"]//ul/li[2]/a")
    private WebElementFacade Buzon;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[1]/a/img")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[2]/a/img")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[3]/a/img")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//ul/li[1]/a/img")
    private WebElementFacade Logo_JuntaF;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//ul/li[2]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[1]/a")
    private WebElementFacade Mapa_WEb;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[2]/a")
    private WebElementFacade Proteccion_Datos;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[3]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//ul/li[4]/a")
    private WebElementFacade Condicion_Uso;


    public void ejecutarFC01() throws InterruptedException{
        Logo_Junta.click();
        getDriver().navigate().back();
        Logo_Portal.click();
        getDriver().navigate().back();

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante).perform();

        String textflotante = Flotante.getAttribute("title");

        if(textflotante.equals("PORTAL DE LA CAZA Y PESCA CONTINENTAL EN ANDALUCIA")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }

    public void ejecutarFC02() throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu1)
                .perform();
        actions.moveToElement(Menu3)
                .perform();
        actions.moveToElement(Submenu)
                .perform();
        Submenu.click();
    }

    public void ejecutarFC03()throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Miga_Padre)
                .perform();
        Miga_Padre.click();
        Miga.click();
    }

    public void ejecutarFC04()throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/caza-y-pesca").toString());
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Portal_Ambiental.click();
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

        Portal_Andaluz.click();
        Set<String> wnd1 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i1 = wnd1.iterator();
        prntw = i1.next();
        popwnd = i1.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Ventana_Visitante.click();
        getDriver().navigate().back();

        Canal_Admin.click();
        Set<String> wnd2 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i2 = wnd2.iterator();
        prntw = i2.next();
        popwnd = i2.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Periodos_Habiles.click();
        getDriver().navigate().back();

        Buzon.click();
        Set<String> wnd3 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i3 = wnd3.iterator();
        prntw = i3.next();
        popwnd = i3.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Twitter.click();
        Set<String> wnd4 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i4 = wnd4.iterator();
        prntw = i4.next();
        popwnd = i4.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Facebook.click();
        Set<String> wnd5 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i5 = wnd5.iterator();
        prntw = i5.next();
        popwnd = i5.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Instagram.click();
        Set<String> wnd6 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i6 = wnd6.iterator();
        prntw = i6.next();
        popwnd = i6.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_JuntaF.click();
        Set<String> wnd7 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i7 = wnd7.iterator();
        prntw = i7.next();
        popwnd = i7.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Union.click();
        Set<String> wnd8 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i8 = wnd8.iterator();
        prntw = i8.next();
        popwnd = i8.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Mapa_WEb.click();
        getDriver().navigate().back();

        Proteccion_Datos.click();
        getDriver().navigate().back();

        Accesibilidad.click();
        getDriver().navigate().back();

        Condicion_Uso.click();
    }
}
