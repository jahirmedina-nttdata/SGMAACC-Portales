package org.medioAmbiente.PPB006.CAP_F_032.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/contacta")


public class MyPage extends PageObject {

    public void visualizarCAPF106() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }
}