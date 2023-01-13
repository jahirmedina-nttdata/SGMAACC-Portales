package org.medioAmbiente.PPB003.CAP_F_021.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs16567847386736865686983TabsId\"]")
    private WebElementFacade Pestaña_Actividades;

    @FindBy(xpath = "//a[contains(text(),\"Enlace a ecoturismoandaluz.com\")]")
    private WebElementFacade Enlace;


    public void clickarActividades() throws InterruptedException {
        Pestaña_Actividades.click();
    }

    public void clickarReservaTuVisita() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("(//div[@class=\"col-lg-3 col-md-4 col-sm-6 col-xs-12\"])[9]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Enlace.click();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(),\"¿Qué espacio natural quieres visitar?\")]")));
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }
}
