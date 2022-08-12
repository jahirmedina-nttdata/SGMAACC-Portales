package org.medioAmbiente.PPB006.CAP_FN_010.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_38\"]")
    private WebElementFacade Cambio_Climatico;



    public void accederEnlace() throws InterruptedException{

        Cambio_Climatico.click();
    }


}