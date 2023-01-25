package org.medioAmbiente.PPB003.CAP_F_181.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/agenda?categoryVal=")


public class MyPage extends PageObject {

    public void seleccionarPaginador() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 550)");
    }
}
