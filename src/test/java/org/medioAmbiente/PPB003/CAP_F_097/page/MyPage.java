package org.medioAmbiente.PPB003.CAP_F_097.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/publicaciones?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[6]/a")
    private WebElementFacade Paginador;


    public void seleccionarPaginador() throws InterruptedException {
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Paginador.click();
    }
}