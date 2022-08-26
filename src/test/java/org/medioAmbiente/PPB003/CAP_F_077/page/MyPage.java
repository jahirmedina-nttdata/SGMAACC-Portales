package org.medioAmbiente.PPB003.CAP_F_077.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Instant;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[1]/div/figure/a")
    private WebElementFacade Planifica_Visitas;

    @FindBy(xpath = "//*[@class=\"maxwidth\"][3]//img")
    private WebElementFacade Eliminar_Visita;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_editar-58472162\"]")
    private WebElementFacade Cancelar_Eliminacion;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_editar-58472162\"]")
    private WebElementFacade Aceptar_Eliminacion;

    @FindBy(xpath = "//button[text()=\"Eliminar\"]")
    private WebElementFacade btnEliminar;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_visitaSelect\"]/option[4]")
    private WebElementFacade Validar_Eliminacion;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        waitFor(1).second();
        Planifica_Visitas.click();
    }

    public void clikarEliminarVisita() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        Eliminar_Visita.click();
    }

    public void clickarCancelar() throws InterruptedException{
        btnEliminar.click();
        Alert alert = getDriver().switchTo().alert();
        alert.dismiss();

    }

    public void clickarAceptar() throws InterruptedException {
        btnEliminar.click();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }

    public void validarEliminacion() throws InterruptedException {

        String validar = Validar_Eliminacion.getText();
        if (validar.contains("NACIMIENTO DEL HUEZNAR")) {
            Assert.fail("No fue eliminado");
        } else {
            Assert.assertTrue(true);
        }
    }
}
