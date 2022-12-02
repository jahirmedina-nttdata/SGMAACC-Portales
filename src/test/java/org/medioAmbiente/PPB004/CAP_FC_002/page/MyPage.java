package org.medioAmbiente.PPB004.CAP_FC_002.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/")



public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_20\"]")
    private WebElementFacade Menu1;

    @FindBy(xpath = "//*[@id=\"layout_21\"]")
    private WebElementFacade Menu2;

    @FindBy(xpath = "//*[@id=\"layout_22\"]")
    private WebElementFacade Menu3;

    @FindBy(xpath = "//*[@id=\"layout_43\"]")
    private WebElementFacade Submenu;


    public void situarCursor() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu1)
                .perform();
        actions.moveToElement(Menu3)
                .perform();
        actions.moveToElement(Submenu)
                .perform();
    }

    public void clickarSubmenu() throws InterruptedException{
        Submenu.click();
    }


}
