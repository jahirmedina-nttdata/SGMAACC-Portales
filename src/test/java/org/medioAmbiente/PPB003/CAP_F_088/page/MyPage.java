package org.medioAmbiente.PPB003.CAP_F_088.page;


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

    @FindBy(xpath = "//*[@id=\"portlet_Pasaportemodule_INSTANCE_PasaporteModule\"]/div/div/div/div/button[1]/a/figure/img")
    private WebElementFacade Añadir_Pasaporte;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[2]/div/div/a")
    private WebElementFacade Usuario_Contenido;

    @FindBy(xpath = "//span[text()=\"PARQUE NATURAL BAHÍA DE CÁDIZ\"]")
    private WebElementFacade Validar_Añadido;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void clikarAñadirPasaporte() throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        Añadir_Pasaporte.click();
    }

    public void validarPasaporte() throws InterruptedException {
        Usuario_Contenido.click();
        Pasaporte_Ecoturista.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        String validar = Validar_Añadido.getText();
        if (validar.contains("PARQUE NATURAL BAHÍA DE CÁDIZ")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se Añadio");
        }
    }

    public void clickarEliminarPasaporte() throws InterruptedException {
        Validar_Añadido.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        Añadir_Pasaporte.click();
    }
}