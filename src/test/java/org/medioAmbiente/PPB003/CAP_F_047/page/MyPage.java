package org.medioAmbiente.PPB003.CAP_F_047.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    @FindBy(xpath = "//*[@id=\"ahyk_column1_1_averageRatingContent\"]/a[3]")
    private WebElementFacade Valor3;

    @FindBy(xpath = "//*[@id=\"ahyk_column1_1_averageRatingContent\"]/a[5]")
    private WebElementFacade Valor5;

    @FindBy(xpath = "//*[@id=\"portlet_ratingsmodule\"]//div[2]/a")
    private WebElementFacade Fichas_Valoradas;


    public void clickarValor3() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Valor3.click();
    }

    public void clickarValor5() throws InterruptedException {
        waitFor(2).second();
        Valor5.click();
        Alert alert= getDriver().switchTo().alert();
        String alertaMensaje = alert.getText();
        if (alertaMensaje.equals("Ya has valorado esta página antes")){
            Assert.assertTrue(true);
            alert.accept();
        }else {
            Assert.fail("Se puede valorar normalmente");
        }
    }

    public void clickarValoradas() throws InterruptedException {
            Fichas_Valoradas.click();
    }
}
