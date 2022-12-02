package org.medioAmbiente.PPB003.CAP_F_033.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"shareRoundIcons\"]//div[1]/a")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//*[@id=\"shareRoundIcons\"]//div[2]/a")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//*[@id=\"rrss-trigger\"]/a")
    private WebElementFacade Compartir;

    @FindBy(xpath = "//*[@id=\"shareGenericButton\"]//div[2]/a")
    private WebElementFacade Pinterest;

    @FindBy(xpath = "//*[@id=\"shareGenericButton\"]//div[3]/a")
    private WebElementFacade Correo;


    public void compartirFacebook() throws InterruptedException {
        Facebook.click();
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

    public void compartirTwitter() throws InterruptedException  {
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
    }

    public void compartirPinterest()throws InterruptedException  {
        Compartir.click();
        Pinterest.click();
        waitFor(3).second();
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

    public void compartirCorreo()throws InterruptedException  {
        Correo.click();
        getDriver().quit();
    }
}
