package org.medioAmbiente.PPB006.CAP_FN_047.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_41\"]")
    private WebElementFacade Menu;

    public void clickarAdaptacion() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
        Menu.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
    }
}