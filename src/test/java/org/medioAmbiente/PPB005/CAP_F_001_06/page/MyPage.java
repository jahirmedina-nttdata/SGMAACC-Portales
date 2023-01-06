package org.medioAmbiente.PPB005.CAP_F_001_06.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/c/portal/login")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_login']")
    private WebElementFacade txtusuario;

    @FindBy(xpath = "//*[@id='_com_liferay_login_web_portlet_LoginPortlet_password']")
    private WebElementFacade txtcontraseña;

    @FindBy(xpath = "//button[@id=\"ignoreUserLocaleOptions\"]")
    private WebElementFacade btncerrar;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[contains(text(),\"Navegación\")]")
    private WebElementFacade Navegacion;

    @FindBy(xpath = "(//span[@class=\"tree-hitarea icon-plus\"])[3]")
    private WebElementFacade IconoMas;

    @FindBy(xpath = "//a[@title=\"Libro Blanco\"]")
    private WebElementFacade SubMenu_LibroBlanco;

    @FindBy(xpath = "//h2[@class=\"tituloNoticia\"]")
    private WebElementFacade Validar_Navegacion;


    public void autenticarUsuario() throws InterruptedException, URISyntaxException {
        txtusuario.sendKeys("cmaot_testing");
        txtcontraseña.sendKeys("Liferay*21" + "\n");
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/portal-conocimiento").toString());
    }


    public void clickarSubmenuLateral() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-title=\"Menú\"]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btncerrar).click().perform();
        waitFor(1).second();
        actions.moveToElement(Menu_Vertical).click().perform();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Menu_Vertical.click();
        }
        Navegacion.waitUntilClickable();
        Navegacion.click();
        List<WebElement> submenu = getDriver().findElements(By.xpath("//a[@class=\"collapse-icon collapse-icon-middle list-group-heading\"][contains(text(),\"Navegación\")]"));
        if (submenu.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Navegacion.click();
        }
        IconoMas.click();
        List<WebElement> iconoabierto = getDriver().findElements(By.xpath("//div[@class=\"tree-node-content yui3-dd-drop tree-expanded\"]/span[@class=\"tree-hitarea icon-minus\"]"));
        if (iconoabierto.size() != 0) {
            Assert.assertTrue(true);
        } else {
            IconoMas.click();
        }
        SubMenu_LibroBlanco.click();
    }

    public void validarQueNavegueAlSubmenu() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class=\"tituloNoticia\"]")));
    }
}
