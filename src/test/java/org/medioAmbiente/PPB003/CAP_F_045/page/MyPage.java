package org.medioAmbiente.PPB003.CAP_F_045.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/209785922463897\"][@title=\"Centro de Visitantes Parque Natural Bahía de Cádiz\"]")
    private WebElementFacade Pagina_Facebook;

    @FindBy(xpath = "//div[@class=\"_5pcr userContentWrapper\"][1]")
    private WebElementFacade Scroll;

    @FindBy(xpath = "//div[@class=\"pluginConnectButton\"]/a[1]")
    private WebElementFacade Me_Gusta;


    public void accederPagina() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        j.executeScript("window.scrollBy(0, 300)");
        waitFor(3).second();
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"fb:page Facebook Social Plugin\"]"));
        getDriver().switchTo().frame(iframe);
        Pagina_Facebook.click();
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

    public void clickarMeGusta() throws InterruptedException {
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"fb:page Facebook Social Plugin\"]"));
        getDriver().switchTo().frame(iframe);
        Me_Gusta.click();
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

    public void moverScroll() throws InterruptedException{
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"fb:page Facebook Social Plugin\"]"));
        getDriver().switchTo().frame(iframe);
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }
}
