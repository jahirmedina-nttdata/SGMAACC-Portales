package org.medioAmbiente.PPB003.CAP_F_057.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//span[contains(text(),'Seguir')])[1]")
    private WebElementFacade VV_Twitter;

    @FindBy(xpath = "(//span[contains(text(),'Seguir')])[1]")
    private WebElementFacade Infoca_Twitter;

    @FindBy(xpath = "//a[contains(text(),'Seguir página')]")
    private WebElementFacade VV_Facebook;

    private String prntw;
    private String popwnd;
    public void visualizarRedesSociales() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//a[contains(text(),'Ver todo el contenido de la Agenda')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void clickarSeguirVentanaVisitanteTwitter() throws InterruptedException {
        WebElement iframe = getDriver().findElement(By.xpath( "(//iframe[@title=\"Twitter Timeline\"])[1]"));
        getDriver().switchTo().frame(iframe);
        VV_Twitter.click();
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

    public void clickarSeguirVentanaVisitanteFacebook() throws InterruptedException {
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"fb:page Facebook Social Plugin\"]"));
        getDriver().switchTo().frame(iframe);
        VV_Facebook.click();
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

    public void clickarSeguirInfocaTwitter() throws InterruptedException {
        WebElement iframe = getDriver().findElement(By.xpath( "(//iframe[@title=\"Twitter Timeline\"])[2]"));
        getDriver().switchTo().frame(iframe);
        Infoca_Twitter.click();
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
