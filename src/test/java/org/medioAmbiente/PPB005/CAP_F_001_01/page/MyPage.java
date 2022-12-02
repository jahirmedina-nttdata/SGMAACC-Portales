package org.medioAmbiente.PPB005.CAP_F_001_01.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/c/portal/login")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_login']")
    private WebElementFacade txtusuario;

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_password']")
    private WebElementFacade txtcontraseña;

    @FindBy(xpath = "//*[contains(text(),'Acceder')]")
    private WebElementFacade btnAcceder;



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
