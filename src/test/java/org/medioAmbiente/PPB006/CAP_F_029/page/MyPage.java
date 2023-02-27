package org.medioAmbiente.PPB006.CAP_F_029.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_44\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_137\"]")
    private WebElementFacade SubMenu;


    public void clickarObjetivos()  throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        actions.moveToElement(SubMenu)
                .perform();
        SubMenu.click();
    }

    public void visualizarObjetivos() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }
}