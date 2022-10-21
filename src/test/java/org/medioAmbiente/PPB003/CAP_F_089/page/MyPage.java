package org.medioAmbiente.PPB003.CAP_F_089.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//section/div//div[3]//figure/a/img")
    private WebElementFacade Pasaporte_Ecoturista;

    @FindBy(xpath = "//button[@class=\"evr-btn--add-pas\"]")
    private WebElementFacade Añadir_Pasaporte;

    @FindBy(xpath = "//button[@id=\"_Pasaportemodule_INSTANCE_vXEUJGmerZqu_delete-5186748\"]")
    private WebElementFacade Eliminar_Pasaporte;

    @FindBy(xpath = "//*[@id=\"_Pasaportemodule_INSTANCE_vXEUJGmerZqu_follow_reading_1\"]/article/div/div[2]/span[2]")
    private WebElementFacade Validar_Eliminado;

    @FindBy(xpath = "//*[@id=\"heading\"]/div[2]/div/div/a")
    private WebElementFacade Usuario_Contenido;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 500)");
        Añadir_Pasaporte.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"evr-btn--delete-pas\"]")));
        Usuario_Contenido.click();
        Pasaporte_Ecoturista.click();
    }

    public void clikarCancelarPasaporte() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        Eliminar_Pasaporte.click();
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();
    }

    public void clikarAceptarPasaporte() throws InterruptedException {
        Eliminar_Pasaporte.click();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public void validarPasaporteEliminado() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 50)");
        List<WebElement> lista = getDriver().findElements(By.xpath("//span[contains(text(),'PARQUE NATURAL BAHÍA DE CÁDIZ')]"));
        if (lista.size() != 0) {
            Assert.fail("No se Eliminó");
        } else {
            Assert.assertTrue(true);
        }
    }
}