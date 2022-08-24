package org.medioAmbiente.PPB003.CAP_F_048.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[1]/div/div[1]/h1/a/img[1]")
    private WebElementFacade Logo_Junta;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[1]/div/div[2]/h1/a/img[1]")
    private WebElementFacade Logo_Ventana;

    public void clickarJunta() throws InterruptedException {
        Logo_Junta.click();
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

    public void clickarVentanaVisitante() throws InterruptedException {
        Logo_Ventana.click();
    }

}
