package org.medioAmbiente.PPB003.CAP_F_027.page;

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

import java.awt.*;
import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "//div[@class=\"lfloat\"]//a[contains(text(),'Espacio Natural de Doñana')]")
    private WebElementFacade Pagina_Facebook;

    @FindBy(xpath = "//div[@class=\"pluginConnectButton\"]/a[1]")
    private WebElementFacade Me_Gusta;

    @FindBy(xpath = "(//div[contains(text(),'Espacio Natural de Doñana')])[2]")
    private WebElementFacade Comentar;


    public void accederPagina() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Fecha Declaración')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"fb:page Facebook Social Plugin\"]"));
        getDriver().switchTo().frame(iframe);
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Seguir página')]")));
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

    public void moverScroll() throws InterruptedException  {
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"fb:page Facebook Social Plugin\"]"));
        getDriver().switchTo().frame(iframe);
        Comentar.click();
    }
}
