package org.medioAmbiente.PPB006.CAP_FN_057.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_42\"]")
    private WebElementFacade Menu;


    public void clickarComunicacion()  throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        Menu.click();

    }

}