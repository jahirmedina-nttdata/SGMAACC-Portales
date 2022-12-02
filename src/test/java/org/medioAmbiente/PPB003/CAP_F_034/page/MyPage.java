package org.medioAmbiente.PPB003.CAP_F_034.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs1686584798332686932737884698220183TabsId\"]/a")
    private WebElementFacade Pestaña_Interes;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs1686584798332686932737884698220183TabsSection\"]//li[1]/a")
    private WebElementFacade Parque_Natural;


    public void clickarPestaña() throws InterruptedException {
        Pestaña_Interes.click();
    }

    public void clickarEspaciosNaturales() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        Parque_Natural.click();
    }

    public void visualizarDatos() throws InterruptedException {
        getDriver().navigate().back();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }
}
