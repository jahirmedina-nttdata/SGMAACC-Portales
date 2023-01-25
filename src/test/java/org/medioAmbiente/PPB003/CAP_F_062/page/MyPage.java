package org.medioAmbiente.PPB003.CAP_F_062.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/actividades?categoryVal=")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_YS0LmvJ3MRL7_follow_reading_asset2\"]")
    private WebElementFacade Actividad_Buceo;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_QYwm8uHC3ojh_tabs1686584798332686932737884698220183TabsSection\"]/div/div[2]/div/h3/a")
    private WebElementFacade Reservar_Visita;


    public void clickarReservar() throws InterruptedException {
        Actividad_Buceo.click();
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 850)");
        Reservar_Visita.click();
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
