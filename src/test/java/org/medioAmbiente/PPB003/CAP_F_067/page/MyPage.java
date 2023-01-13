package org.medioAmbiente.PPB003.CAP_F_067.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),\"VER MÁS\")]")
    private WebElementFacade Ver_Mas;

    @FindBy(xpath = "//a[@title=\"07 Jaén\"]")
    private WebElementFacade Documento;
    private String prntw;
    private String popwnd;

    public void visualizarSugerenciaDelMes() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("(//div[@class=\"slick-list draggable\"])[2]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        waitFor(1).second();
        JavascriptExecutor ja = (JavascriptExecutor) getDriver();
        ja.executeScript("window.scrollBy(0, 300)");
        waitFor(2).second();
    }

    public void clickarVerMas() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Ver_Mas).click().perform();
    }

    public void clickarDescargarDocumento() throws InterruptedException {
       // WebElement Element = getDriver().findElement(By.xpath("//div[@class=\"evr-article-layout__paragraph\"]"));
      //  JavascriptExecutor j = (JavascriptExecutor) getDriver();
      //  j.executeScript("arguments[0].scrollIntoView();", Element);
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Documento).click().perform();

        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        waitFor(15).second();
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }
}
