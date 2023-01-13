package org.medioAmbiente.PPB001.CAP_F_061.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    public void seleccionarPaginador() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 550)");
    }
}
