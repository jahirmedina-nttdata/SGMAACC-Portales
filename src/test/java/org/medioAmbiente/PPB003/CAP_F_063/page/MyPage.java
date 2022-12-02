package org.medioAmbiente.PPB003.CAP_F_063.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/actividades?categoryVal=")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_YS0LmvJ3MRL7_follow_reading_asset0\"]")
    private WebElementFacade Actividad_Barranquismo;

    public void clickarElemento() throws InterruptedException {
        Actividad_Barranquismo.click();
    }
}
