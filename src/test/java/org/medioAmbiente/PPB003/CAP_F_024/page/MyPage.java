package org.medioAmbiente.PPB003.CAP_F_024.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs180856676736765677379786983TabsId\"]")
    private WebElementFacade Pestaña_Publicaciones;

    @FindBy(xpath = "//*[@id=\"<portlet:namespace/>download/medioambiente/portal/documents/20151/d1a6887d-41fb-c77b-285b-77547bc32576\"]")
    private WebElementFacade Cuidado_Garrapatas;


    public void clickarPublicaciones() throws InterruptedException {
        Pestaña_Publicaciones.click();
    }

    public void clickarBuenasPracticas() throws InterruptedException {
        Cuidado_Garrapatas.click();
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
    }
}
