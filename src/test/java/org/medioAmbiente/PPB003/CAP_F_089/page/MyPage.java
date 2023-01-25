package org.medioAmbiente.PPB003.CAP_F_089.page;


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

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


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

    @FindBy(xpath = "//*[@id=\"p_p_id_Pasaportemodule_INSTANCE_PasaporteModule_\"]//button[1]")
    private WebElementFacade btnPasaporte;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void clikarAñadirPasaporte() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035").toString());
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Añadir_Pasaporte).click().perform();
    }

    public void validarPasaporte() throws InterruptedException {
        List<WebElement> icono = getDriver().findElements(org.openqa.selenium.By.xpath("//button[@class=\"evr-btn--delete-pas\"]"));
        if (icono.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se añadio a Pasaporte");
        }
        Actions action = new Actions(getDriver());
        action.moveToElement(Usuario_Contenido).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        action.moveToElement(Pasaporte_Ecoturista).click().perform();
        j.executeScript("window.scrollBy(0, 300)");
        String validar = Validar_Añadido.getText();
        if (validar.contains("PARQUE NATURAL BAHÍA DE CÁDIZ")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se Añadio");
        }
    }

    public void clickarEliminarPasaporte() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Validar_Añadido).click().perform();
        btnPasaporte.waitUntilClickable();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 350)");
        action.moveToElement(Añadir_Pasaporte).click().perform();
        List<WebElement> icono = getDriver().findElements(org.openqa.selenium.By.xpath("//button[@class=\"evr-btn--add-pas\"]"));
        if (icono.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se eliminó Pasaporte");
        }

    }
}