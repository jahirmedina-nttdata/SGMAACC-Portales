package org.medioAmbiente.PPB003.CAP_F_083.page;


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

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[2]/div/figure/a")
    private WebElementFacade Favoritos;

    @FindBy(xpath = "//*[@id=\"portlet_favoritosmodule_INSTANCE_favoritosModule\"]//button[1]/a/figure")
    private WebElementFacade Añadir_Favoritos;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[2]/div/div/a")
    private WebElementFacade Usuario_Contenido;

    @FindBy(xpath = "//span[text()=\"PARQUE NATURAL BAHÍA DE CÁDIZ\"]")
    private WebElementFacade Validar_Añadido;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
    }

    public void clikarAñadirFavoritos() throws InterruptedException {
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        Añadir_Favoritos.click();
    }

    public void validarAñadido() throws InterruptedException {
        Usuario_Contenido.click();
        Favoritos.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        String validar = Validar_Añadido.getText();
        if (validar.contains("PARQUE NATURAL BAHÍA DE CÁDIZ")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se Añadio");
        }
    }

    public void clickarEliminarFavorito() throws InterruptedException {
        Validar_Añadido.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        Añadir_Favoritos.click();
    }
}