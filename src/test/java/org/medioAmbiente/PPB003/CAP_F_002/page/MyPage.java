package org.medioAmbiente.PPB003.CAP_F_002.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/c/portal/login")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//a[@id=\"_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_sidenavToggleId\"]")
    private WebElementFacade Menu_Vertical;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void accederVentanaVisitante() throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante");
    }

    public void validaAcceso() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_sidenavToggleId\"]")));
        Menu_Vertical.click();
    }
}
