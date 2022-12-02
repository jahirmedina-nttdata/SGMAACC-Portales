package org.medioAmbiente.PPB006.CAP_FN_011.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/el-cambio-climatico")


public class MyPage extends PageObject {


    public void visualizarInformacion()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        j.executeScript("window.scrollBy(0, 400)");
        j.executeScript("window.scrollBy(0, 400)");
    }
}