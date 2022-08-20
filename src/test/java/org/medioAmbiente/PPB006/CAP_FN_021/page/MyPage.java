package org.medioAmbiente.PPB006.CAP_FN_021.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/actua")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"layout_38\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_121\"]")
    private WebElementFacade SubMenu;


    public void visualizarActua() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        j.executeScript("window.scrollBy(0, 200)");
    }
}