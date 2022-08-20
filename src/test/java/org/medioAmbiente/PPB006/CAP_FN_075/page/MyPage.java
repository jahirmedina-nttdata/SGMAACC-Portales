package org.medioAmbiente.PPB006.CAP_FN_075.page;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/la-estrategia-en-andalucia")


public class MyPage extends PageObject {

    public void visualizarCAPFN007() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        j.executeScript("window.scrollBy(0, 200)");
    }

}