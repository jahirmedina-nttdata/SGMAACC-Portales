package org.medioAmbiente.PPB004.CAP_FN_002.page;

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
    private WebElementFacade txtusuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade txtcontraseña;


    public void escriboUsuario(String usuario) throws InterruptedException {
        txtusuario.sendKeys(usuario);
    }


    public void escriboContraseña(String contraseña) throws InterruptedException {
        txtcontraseña.sendKeys(contraseña + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-title=\"Menú\"]")));
    }

    public void accesoPortalCazaPesca() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/caza-y-pesca").toString());
    }

    public void validarautenticacionPortal() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-title=\"Menú\"]")));
        List<WebElement> Menu = getDriver().findElements(By.xpath("//a[@data-title=\"Menú\"]"));
        List<WebElement> Portal = getDriver().findElements(By.xpath("//a[@title=\"PORTAL DE LA CAZA Y PESCA CONTINENTAL EN ANDALUCIA\"]"));
        if (Menu.size() != 0 && Portal.size() !=0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Autenticacion incorrecta");
        }
    }

}
