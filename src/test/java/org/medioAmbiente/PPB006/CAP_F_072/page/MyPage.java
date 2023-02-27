package org.medioAmbiente.PPB006.CAP_F_072.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_42\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_139\"]")
    private WebElementFacade SubMenu;


    public void clickarOrganizmo()  throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        actions.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }

    public void visualizarOrganizmo()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }
}