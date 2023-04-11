package org.medioAmbiente.PPB003.CAP_F_077.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_ReTFpDg2eNvQ\"]//div[1]/div/div/h1/a")
    private WebElementFacade Planifica_Visitas;

    @FindBy(xpath = "(//a[@title=\"Editar visita\"]//img)[1]")
    private WebElementFacade Editar_Visita;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_title\"]")
    private WebElementFacade Nombre_Visita;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_dateTo\"]")
    private WebElementFacade Fecha_Hasta;

    @FindBy(xpath = "//button[text()=\"Guardar\"]")
    private WebElementFacade btnGuardar;

    @FindBy(xpath = "//*[@id=\"portlet_visitasmodule_INSTANCE_61L1Y8gTGInZ\"]//div[3]/section//span")
    private WebElementFacade Validar_Modificacion;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(org.openqa.selenium.By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Menu_Vertical.click();
        } else {
            Assert.assertTrue(true);
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Planifica_Visitas).click().perform();
    }

    public void clikarEditarVisita() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Editar_Visita).click().perform();
    }

    public void modificarVisita() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"yui3-widget-bd modal-body\"]")));
        Nombre_Visita.clear();
        Nombre_Visita.sendKeys("EL MARTINETE");
        Fecha_Hasta.clear();
        Actions action = new Actions(getDriver());
        action.moveToElement(btnGuardar).click().perform();
    }

    public void validarModificacion() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'EL MARTINETE')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        String validar = Validar_Modificacion.getText();
        if (validar.contains("EL MARTINETE")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No coincide con la modificacion");
        }
    }
}
