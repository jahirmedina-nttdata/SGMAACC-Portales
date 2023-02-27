package org.medioAmbiente.PPB006.CAP_F_010.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_38\"]")
    private WebElementFacade Cambio_Climatico;


    public void accederEnlace() throws InterruptedException{

        Cambio_Climatico.click();
    }

    public void visualizarPagina() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        j.executeScript("window.scrollBy(0, 200)");
        j.executeScript("window.scrollBy(0, 400)");
    }
}