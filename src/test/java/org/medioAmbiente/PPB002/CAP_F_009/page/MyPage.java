package org.medioAmbiente.PPB002.CAP_F_009.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/actualidad")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-cladt07-destacados1\"]/div[1]//a")
    private WebElementFacade btncontenido;


    public void clickarPremiosConsurso() throws InterruptedException {
        btncontenido.click();

    }
}
