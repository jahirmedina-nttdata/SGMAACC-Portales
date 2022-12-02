package org.medioAmbiente.PPB001.CAP_F_109.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Alert;
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

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[@id=\"_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet_assetVocabularies_2_menu\"]")
    private WebElementFacade icono_Config;

    @FindBy(xpath = "//a[@id=\"_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet_assetCategories_1_menu\"]")
    private WebElementFacade icono_ConfigCat;

    @FindBy(xpath = "//a[@id=\"_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet_assetVocabularies__2__menu__add_2d_category\"]")
    private WebElementFacade añadir_Categoria;

    @FindBy(xpath = "//a[contains(text(),'Contenido')][@href=\"#panel-manage-site_administration_content\"]")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//a[@id=\"_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_portlet_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet\"]")
    private WebElementFacade Categorias;

    @FindBy(xpath = "//input[@id=\"_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet_title\"]")
    private WebElementFacade Nombre_Categoria;

    @FindBy(xpath = "//textarea[@id=\"_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet_description\"]")
    private WebElementFacade Descrip_Categoria;

    @FindBy(xpath = "//button/span[contains(text(),'Guardar')]")
    private WebElementFacade btnGuardar;

    @FindBy(xpath = "(//span[@class=\"icon-monospaced\"])[7]")
    private WebElementFacade btnAtras;

    @FindBy(xpath = "//a[contains(text(),'Topic')]")
    private WebElementFacade Cat_Prueba;

    @FindBy(xpath = "//td[@class=\"table-cell-content lfr-category-column\"]/a")
    private WebElementFacade Validar_Categoria;

    @FindBy(xpath = "//a[@id=\"_com_liferay_asset_categories_admin_web_portlet_AssetCategoriesAdminPortlet_assetCategories__1__menu__delete\"]")
    private WebElementFacade Eliminar_Catego;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void accederContenidoWeb() throws InterruptedException {
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Contenido.waitUntilClickable();
            Contenido.click();
            Categorias.click();
        } else {
            Menu_Vertical.click();
            Contenido.waitUntilClickable();
            Contenido.click();
            Categorias.click();
        }
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Categorías')]")));
    }

    public void añadirCategoria() throws InterruptedException {
        icono_Config.click();
        añadir_Categoria.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Añadir una categoría')]")));
        Nombre_Categoria.sendKeys("Prueba Categoria");
        Descrip_Categoria.sendKeys("Prueba Categoria Descripción");
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        btnGuardar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Topic')]")));
    }

    public void relacionarContenido() throws InterruptedException {
        Categorias.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Categorías')]")));
        Cat_Prueba.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Topic')]")));
        String validacion = Validar_Categoria.getText();
        if(validacion.equals("Prueba Categoria")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No se guardo Categoria");
        }
    }

    public void eliminarCategoria() throws InterruptedException {
        icono_ConfigCat.click();
        Eliminar_Catego.click();
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
    }
}
