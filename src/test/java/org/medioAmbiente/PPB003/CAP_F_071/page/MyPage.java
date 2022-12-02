package org.medioAmbiente.PPB003.CAP_F_071.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"heading\"]/div[2]/div/div/a")
    private WebElementFacade Icono;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"out\"]/figure/img")
    private WebElementFacade Salir;

    @FindBy(xpath = "//*[@class=\"yui3-widget-bd\"]")
    private WebElementFacade Alerta;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_ctvk__null__null\"]")
    private WebElementFacade Olvide_Contraseña;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_screenName\"]")
    private WebElementFacade Recuperar_User;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_captcha\"]")
    private WebElementFacade Captcha;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_captchaText\"]")
    private WebElementFacade Texto_Captcha;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_ctvk__null__null\"]")
    private WebElementFacade Enlace_Acceder;


    public void clickarIcono() throws InterruptedException {
        Icono.click();
    }

    public void accederUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void accederUserInvalido() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        Actions action = new Actions(getDriver());
        action.moveToElement(Salir).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")));
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay" + "\n");
        waitFor(1).second();
        String validacion = Alerta.getText();
        if (validacion.equals("La autenticación ha fallado. Por favor inténtelo otra vez.")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("Informacion valida");
        }
    }

    public void clickarOlvideContraseña() throws InterruptedException {
        Olvide_Contraseña.click();
    }

    public void rellenarFormulario() throws InterruptedException {
        Recuperar_User.sendKeys("Automatizador");
        Texto_Captcha.sendKeys(" " + "\n");
    }

    public void clickarAcceder() throws InterruptedException {
        Enlace_Acceder.click();
    }

}
