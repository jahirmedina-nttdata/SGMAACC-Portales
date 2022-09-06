package org.medioAmbiente.PPB003.CAP_F_016.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs177658065TabsId\"]")
    private WebElementFacade Pestaña_Mapa;

    @FindBy(xpath = "//*[@id=\"mapjs\"]/div/canvas")
    private WebElementFacade Observatorio;

    @FindBy(xpath = "//*[@id=\"m-infowfs-results-scroll\"]/div/table/tbody/tr/td[4]/a")
    private WebElementFacade Ver_Ficha;

    public void clickarMapa() throws InterruptedException {
        Pestaña_Mapa.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 450)");
    }

    public void clickarIconoObservatorio() throws InterruptedException {
        WebElement iframe = getDriver().findElement(By.xpath("//*[@id=\"ifr\"]"));
        getDriver().switchTo().frame(iframe);
        waitFor(15).second();
        Actions actions = new Actions(getDriver());
        actions.click(Observatorio)
                .perform();
        waitFor(3).second();
        actions.moveToElement(Ver_Ficha)
                .perform();
        Ver_Ficha.click();
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
