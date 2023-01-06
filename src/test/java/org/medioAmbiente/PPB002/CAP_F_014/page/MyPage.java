package org.medioAmbiente.PPB002.CAP_F_014.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/agenda-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//span[@class=\"d-month\"]")
    private WebElementFacade Select_Mes;


}
