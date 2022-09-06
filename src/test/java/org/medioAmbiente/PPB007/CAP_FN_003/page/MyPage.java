package org.medioAmbiente.PPB007.CAP_FN_003.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cae/")


public class MyPage extends PageObject {

    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL1et3R1zQ\"]//ul/a")
    private WebElementFacade Logo_JuntaHeader;

    @FindBy(xpath = "//*[@id=\"layout_9\"]")
    private WebElementFacade Menu1;

    @FindBy(xpath = "//*[@id=\"layout_11\"]")
    private WebElementFacade Menu2;

    @FindBy(xpath = "//*[@id=\"layout_12\"]")
    private WebElementFacade Submenu;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[2]/a")
    private WebElementFacade Miga;

    @FindBy(xpath = "//*[@id=\"_com_liferay_site_navigation_breadcrumb_web_portlet_SiteNavigationBreadcrumbPortlet_breadcrumbs-defaultScreen\"]//li[1]/a")
    private WebElementFacade Miga_Padre;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[1]/a")
    private WebElementFacade Portal_Ambiental;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[2]/a")
    private WebElementFacade Portal_Caza;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[3]/a")
    private WebElementFacade Portal_CambioClimatico;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3R1zQ\"]//ul/li[4]/a")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[1]/a")
    private WebElementFacade Atencion_Ciudadania;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[2]/a")
    private WebElementFacade Tramites;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[3]/a")
    private WebElementFacade Herramientas_Centralizada;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3RdJ4\"]//ul/li[4]/a")
    private WebElementFacade Carpeta_Ciudadana;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[1]/a")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[2]/a")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rd3R\"]//ul/li[3]/a")
    private WebElementFacade Instagram;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//li[1]/a/img")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rl0G\"]//li[2]/a/img")
    private WebElementFacade Logo_Union;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[1]/a")
    private WebElementFacade Mapa_WEb;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[2]/a")
    private WebElementFacade Proteccion_Datos;
    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[3]/a")
    private WebElementFacade Accesibilidad;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PubL15h3Rb07\"]//li[4]/a")
    private WebElementFacade Condicion_Uso;


    public void visualizarCAPFC001() throws InterruptedException {
        Logo_JuntaHeader.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Logo_JuntaHeader).perform();

        String validar = Logo_JuntaHeader.getAttribute("title");

        if (validar.equals("Consejería de Agricultura, Ganadería, Pesca y Desarrollo Sostenible")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide el Texto");
        }
    }

    public void visualizarCAPFC015() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu1)
                .perform();
        actions.moveToElement(Menu2)
                .perform();
        Submenu.click();
    }

    public void visualizarCAPFC014() throws InterruptedException {
        getDriver().navigate().back();
        Miga.click();
        Miga_Padre.click();
    }

    public void visualizarCAPFC016() throws InterruptedException {
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
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Portal_Caza.click();
        Set<String> wnd1 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i1 = wnd1.iterator();
        prntw = i1.next();
        popwnd = i1.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Portal_CambioClimatico.click();

        getDriver().navigate().back();
        Ventana_Visitante.click();

        getDriver().navigate().back();
        Atencion_Ciudadania.click();

        getDriver().navigate().back();
        Tramites.click();

        getDriver().navigate().back();
        Herramientas_Centralizada.click();

        getDriver().navigate().back();
        Carpeta_Ciudadana.click();

        getDriver().navigate().back();
        Twitter.click();
        Set<String> wnd2 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i2 = wnd2.iterator();
        prntw = i2.next();
        popwnd = i2.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Facebook.click();
        Set<String> wnd3 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i3 = wnd3.iterator();
        prntw = i3.next();
        popwnd = i3.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Instagram.click();
        Set<String> wnd4 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i4 = wnd4.iterator();
        prntw = i4.next();
        popwnd = i4.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Junta.click();
        Set<String> wnd5 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i5 = wnd5.iterator();
        prntw = i5.next();
        popwnd = i5.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Logo_Union.click();
        Set<String> wnd6 = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i6 = wnd6.iterator();
        prntw = i6.next();
        popwnd = i6.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana " + getDriver().getTitle());
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);

        Mapa_WEb.click();

        getDriver().navigate().back();
        Accesibilidad.click();

        getDriver().navigate().back();
        Proteccion_Datos.click();

        getDriver().navigate().back();
        Condicion_Uso.click();
    }
}
