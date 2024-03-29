package org.medioAmbiente.PPB003.CAP_F_087.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//section/div//div[3]//figure/a/img")
    private WebElementFacade Pasaporte_Ecoturista;

    @FindBy(xpath = "//*[@id=\"portlet_Pasaportemodule_INSTANCE_vXEUJGmerZqu\"]//section/div/div/div/div/h1")
    private WebElementFacade Validar_Permiso;

    @FindBy(xpath = "//*[@id=\"portlet_Pasaportemodule_INSTANCE_vXEUJGmerZqu\"]/div/div/div/div/div/section")
    private WebElementFacade Validar_Listado;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void clikarPasaporte() throws InterruptedException {
        Pasaporte_Ecoturista.click();
    }

    public void validarPermiso() throws InterruptedException {
        String validar = Validar_Permiso.getText();
        if (validar.contains("Pasaporte ecoturista")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se encuentra autenticado");
        }
    }

    public void validarPasaportes() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        if (Validar_Listado.isEnabled()) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No muestra lista de Pasaportes");
        }
    }
}