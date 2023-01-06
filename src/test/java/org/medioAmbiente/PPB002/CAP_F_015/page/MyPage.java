package org.medioAmbiente.PPB002.CAP_F_015.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/guest/actualidad/agenda-eventos")


public class MyPage extends PageObject {

    @FindBy(xpath = "//span[@class=\"d-month\"]")
    private WebElementFacade Select_Mes;


}
