package org.medioAmbiente.PPB003.CAP_F_065.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/noticias-detalle/-/asset_publisher/pUmOGVAxEAjQ/content/el-milano-real-anida-en-c-c3-b3rdoba/20151")


public class MyPage extends PageObject {

    public void visualizar_Noticia() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
    }
}
