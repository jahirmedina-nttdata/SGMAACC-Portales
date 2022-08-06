package org.medioAmbiente.PPB002.CAP_F_017.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"ui-id-5\"]")
    private WebElementFacade provincia;

    @FindBy(xpath = "//*[@id=\"_cmaotAemetModule_INSTANCE_A3m3T_provincia-button\"]/span[2]")
    private WebElementFacade Listprovincia;

    public void seleccionarProvin() {
        Listprovincia.click();
        provincia.click();
    }

}
