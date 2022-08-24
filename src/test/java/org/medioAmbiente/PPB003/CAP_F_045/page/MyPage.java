package org.medioAmbiente.PPB003.CAP_F_045.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "//a[1][@href='https://www.facebook.com/209785922463897']")
    private WebElementFacade Pagina_Facebook;

    @FindBy(xpath = "//*[@class=\"_10b4\"]")
    private WebElementFacade Scroll;

    @FindBy(xpath = "//*[contains(text(),'Seguir página')]")
    private WebElementFacade Me_Gusta;


    public void accederPagina() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
        waitFor(3).second();

        Actions actions = new Actions(getDriver());
        actions.click(Pagina_Facebook)
                .perform();

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

    public void moverScroll() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Scroll,0,300)
                .perform();
    }
}
