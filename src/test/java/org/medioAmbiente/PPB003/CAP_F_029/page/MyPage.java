package org.medioAmbiente.PPB003.CAP_F_029.page;


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


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//span[contains(text(),'VERSIÓN IMPRIMIBLE')])[2]")
    private WebElementFacade Archivo;
    private String prntw;
    private String popwnd;

    public void visualizarDescargas() throws InterruptedException {
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'NO TE VAYAS SIN...')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
    }

    public void clickarDescarga() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Archivo).click().perform();
        Set<String> wnd = getDriver().getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        prntw = i.next();
        popwnd = i.next();
        // switching pop up window handle id
        getDriver().switchTo().window(popwnd);
        System.out.println("Nombre de Pestana "+ getDriver().getTitle());
        waitFor(5).second();
        // closes pop up window
        getDriver().close();
        // switching parent window handle id
        getDriver().switchTo().window(prntw);
    }
}
