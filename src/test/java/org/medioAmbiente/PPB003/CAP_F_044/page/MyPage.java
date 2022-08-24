package org.medioAmbiente.PPB003.CAP_F_044.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;
    @FindBy(xpath = "//*[@id=\"_aemet_INSTANCE_aemet_popup_weather\"]/section//a")
    private WebElementFacade Ampliar_Informacion;


    public void visualizarTiempo() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 1000)");
    }

    public void clickarAmpliarInformacion() throws InterruptedException {
        Ampliar_Informacion.click();
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
}
