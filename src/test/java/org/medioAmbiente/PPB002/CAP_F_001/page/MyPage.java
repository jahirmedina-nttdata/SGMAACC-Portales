package org.medioAmbiente.PPB002.CAP_F_001.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/c/portal/login")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_login']")
    private WebElementFacade txtusuario;

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_password']")
    private WebElementFacade txtcontraseña;

    @FindBy(xpath = "//*[contains(text(),'Acceder')]")
    private WebElementFacade btnAcceder;

    @FindBy(xpath = "//*[@id=\"slick-slide03\"]/a/p")
    private WebElementFacade lbl_Portal;


    public void escribimosUsuario(String usuario) throws InterruptedException {
        txtusuario.sendKeys(usuario);
    }


    public void escribimosContraseña(String contraseña) throws InterruptedException {
        txtcontraseña.sendKeys(contraseña);

    }


    public void clickAcceder() throws InterruptedException {
        btnAcceder.click();
    }

}
