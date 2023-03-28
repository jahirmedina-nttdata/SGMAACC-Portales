package org.medioAmbiente.PPB007.CAP_F_005.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("/medioambiente/portal/web/cae")


public class MyPage extends PageObject {

    public void visualizarTituloUltimosDiasPara() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
    }
}