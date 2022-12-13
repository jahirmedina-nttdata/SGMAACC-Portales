package org.medioAmbiente.PPB003.CAP_F_126.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-actividad/-/asset_publisher/QYwm8uHC3ojh/content/buceo/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-facebook\"]/a")
    private WebElementFacade Facebook;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-twitter\"]/a")
    private WebElementFacade Twitter;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-pinterest\"]/a")
    private WebElementFacade Pinterest;

    @FindBy(xpath = "//div[@class=\"jssocials-share jssocials-share-email\"]/a")
    private WebElementFacade Correo;

    @FindBy(xpath = "//div[@class=\"jssocials-share evr-social-network__jssocials-share\"]/a")
    private WebElementFacade Compartir;
    private String prntw;
    private String popwnd;

    public void compartirEnFacebook() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buceo')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
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

    public void compartirEnTwitter() throws InterruptedException {
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

    public void compartirEnPinterest() throws InterruptedException {
        Compartir.click();
        Pinterest.click();
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


    public void compartirPorCorreo() throws InterruptedException {
        Correo.click();
        getDriver().close();
    }
}
