package org.medioAmbiente.PPB003.CAP_F_102.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "(//*[@id=\"layout_19\"])[1]")
    private WebElementFacade Menu_Actualidad;

    @FindBy(xpath = "(//*[@id=\"layout_24\"]/a)[1]")
    private WebElementFacade Submenu_Aviso;

    @FindBy(xpath = "(//a[@title=\"Ir a Ventana del Visitante\"]/img)[1]")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[contains(text(),'2')]")
    private WebElementFacade Paginador;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void accederSubmenuAvisos() throws InterruptedException {
        Ventana_Visitante.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id=\"layout_19\"])[1]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu_Actualidad)
                .perform();
        actions.moveToElement(Submenu_Aviso).click().perform();
    }

    public void seleccionarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-title=\"Menú\"]")));
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Menu_Vertical.click();
        } else {
            Assert.assertTrue(true);
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        Paginador.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
    }
}
