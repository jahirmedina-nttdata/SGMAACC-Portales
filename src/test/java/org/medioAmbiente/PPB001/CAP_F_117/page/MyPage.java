package org.medioAmbiente.PPB001.CAP_F_117.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[@id=\"_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_portlet_previewContenidoWeb\"]")
    private WebElementFacade Contenido_Web;

    @FindBy(xpath = "//a[contains(text(),'Contenido')][@href=\"#panel-manage-site_administration_content\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[1]")
    private WebElementFacade Select_Entradas;

    @FindBy(xpath = "//a[contains(text(),'150')]")
    private WebElementFacade Opcion_Entradas;

    @FindBy(xpath = "(//a[@class=\"dropdown-toggle\"])[1]")
    private WebElementFacade Validar_Entradas;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void accederPreviewContenidosWeb() throws InterruptedException {
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Contenido.waitUntilClickable();
            Contenido.click();
            Contenido_Web.click();
        } else {
            Menu_Vertical.click();
            Contenido.waitUntilClickable();
            Contenido.click();
            Contenido_Web.click();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Preview Contenidos Web')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void cambiarNroEntradas() throws InterruptedException {
        Select_Entradas.click();
        Opcion_Entradas.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_previewContenidoWeb_journalArticlesSearchContainerPageIteratorBottom\"]/div[2]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        String validacion = Validar_Entradas.getText();
        if(validacion.equals("150 entradas")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Entradas no validas");
        }
    }
}
