package org.medioAmbiente.PPB002.CAP_F_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/actualidad")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-cladt07-destacados1\"]/div[1]//a")
    private WebElementFacade btncontenido;


    public void clickarPremiosConsurso() throws InterruptedException {
        btncontenido.click();

    }
}
