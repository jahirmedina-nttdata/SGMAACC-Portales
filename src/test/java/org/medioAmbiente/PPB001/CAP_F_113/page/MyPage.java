package org.medioAmbiente.PPB001.CAP_F_113.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

    @FindBy(xpath = "//a[@id=\"toggle_id_employee_searchtoggleAdvanced\"]")
    private WebElementFacade Lupa;

    @FindBy(xpath = "//button[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "(//td[4])[1]")
    private WebElementFacade Validar_Busqueda;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void clickarLupa() throws InterruptedException {
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
        Lupa.click();
    }

    public void seleccionarEstadoBorrador() throws InterruptedException {
        Select Estado = new Select(getDriver().findElement(By.id("_previewContenidoWeb_status")));
        Estado.selectByVisibleText("Borrador");
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarBusqueda() throws InterruptedException {
        String validacion = Validar_Busqueda.getText();
        if(validacion.equals("Borrador")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Lista Invalida");
        }
    }
}
