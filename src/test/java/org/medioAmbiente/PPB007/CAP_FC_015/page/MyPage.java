package org.medioAmbiente.PPB007.CAP_FC_015.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cae/")



public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_9\"]")
    private WebElementFacade Menu1;

    @FindBy(xpath = "//*[@id=\"layout_11\"]")
    private WebElementFacade Menu2;

    @FindBy(xpath = "//*[@id=\"layout_12\"]")
    private WebElementFacade Submenu;


    public void situarCursor() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu1)
                .perform();
        actions.moveToElement(Menu2)
                .perform();
    }

    public void clickarSubmenu() throws InterruptedException{
        Submenu.click();
    }
}
