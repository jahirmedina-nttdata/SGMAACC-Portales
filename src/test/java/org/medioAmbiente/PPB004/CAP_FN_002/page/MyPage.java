package org.medioAmbiente.PPB004.CAP_FN_002.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/c/portal/login")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade txtusuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade txtcontraseña;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_xqxj\"]/span")
    private WebElementFacade Acceder;


    public void escriboUsuario(String usuario) throws InterruptedException {
        txtusuario.sendKeys(usuario);
    }


    public void escriboContraseña(String contraseña) throws InterruptedException {
        txtcontraseña.sendKeys(contraseña + "\n");

    }

}
