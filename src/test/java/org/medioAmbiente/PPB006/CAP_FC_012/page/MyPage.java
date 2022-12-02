package org.medioAmbiente.PPB006.CAP_FC_012.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_44\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_102\"]")
    private WebElementFacade SubMenu;


    public void posicionarMenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
    }

    public void clickarSubmenu() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }
}
