package org.medioAmbiente.PPB006.CAP_F_105.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {


    public void visualizarImagen() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 150)");
        waitFor(3).second();
    }
}
