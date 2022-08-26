package org.medioAmbiente.PPB003.CAP_F_098.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"layout_19\"]")
    private WebElementFacade Menu_Actualidad;

    @FindBy(xpath = "//*[@id=\"layout_20\"]/a")
    private WebElementFacade Submenu_Agenda;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void visualizarPaginador() throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu_Actualidad)
                .perform();
        actions.moveToElement(Submenu_Agenda)
                .perform();
        Submenu_Agenda.click();
    }
}
