package org.medioAmbiente.PPB004.CAP_FC_005.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    public void buscadorGeneral() throws InterruptedException{
        waitFor(5).second();
    }

    public void buscadorAvanzado() throws InterruptedException{
       getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/buscador");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }


}
