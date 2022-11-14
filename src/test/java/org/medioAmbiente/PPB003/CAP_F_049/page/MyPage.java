package org.medioAmbiente.PPB003.CAP_F_049.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"layout_56\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "(//*[@id=\"layout_67\"])[1]")
    private WebElementFacade Submenu;

    public void clickarSubmenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        actions.moveToElement(Submenu)
                .perform();
        Submenu.click();
    }
}
