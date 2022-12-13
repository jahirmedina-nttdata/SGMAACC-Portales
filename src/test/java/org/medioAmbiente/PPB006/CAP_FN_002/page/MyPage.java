package org.medioAmbiente.PPB006.CAP_FN_002.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/c/portal/login")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;
    public void autenticaUsuario() throws InterruptedException  {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-title=\"Menú\"]")));
    }
    public void accederPortalCambioClimatico() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/cambio-climatico").toString());
    }

    public void validarUsuario() throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-title=\"Menú\"]")));
        List<WebElement> Menu = getDriver().findElements(By.xpath("//a[@data-title=\"Menú\"]"));
        List<WebElement> Portal = getDriver().findElements(By.xpath("//a[@title=\"Portal Andaluz de Cambio Climático\"]"));
        if (Menu.size() != 0 && Portal.size() !=0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Autenticacion incorrecta");
        }
    }
}
