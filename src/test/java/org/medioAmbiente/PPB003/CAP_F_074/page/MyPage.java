package org.medioAmbiente.PPB003.CAP_F_074.page;


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

    @FindBy(xpath = "//*[@id=\"portlet_visitasmodule_INSTANCE_61L1Y8gTGInZ\"]/div/div/div/div/section/div/div/div/div/h1")
    private WebElementFacade Validar_Permiso;

    @FindBy(xpath = "//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_visitaSelect\"]")
    private WebElementFacade Validar_Listado;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
    }

    public void clikarPlanificaVisita() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Planifica_Visitas).click().perform();
    }

    public void validarPermiso() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class=\"evr-photographytitle__title\"]")));
        String validar = Validar_Permiso.getText();
        if(validar.contains("Visitas")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se encuentra autenticado");
        }
    }

    public void validarListado() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_visitasmodule_INSTANCE_61L1Y8gTGInZ_visitaSelect\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        Actions action = new Actions(getDriver());
        action.moveToElement(Validar_Listado).click().perform();
        List<WebElement> lista = getDriver().findElements(By.xpath("//select[@title=\"visita-select\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }
}
