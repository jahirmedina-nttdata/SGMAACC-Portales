package org.medioAmbiente.PPB003.CAP_F_105.page;


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

    @FindBy(xpath = "//*[@id=\"layout_13\"]")
    private WebElementFacade Menu;

    @FindBy(xpath = "//*[@id=\"layout_14\"]")
    private WebElementFacade SubMenu;

    @FindBy(xpath = "//*[@id=\"heading\"]//div[2]/h1/a/img[1]")
    private WebElementFacade Ventana_Visitante;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//a[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_kldx_column1_0_menu\"]/span")
    private WebElementFacade Icono_puntos;

    @FindBy(xpath = "//a[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_kldx__column1__0__menu__configuracion\"]")
    private WebElementFacade OptionConfig;

    @FindBy(xpath = "//input[@id=\"_com_liferay_portlet_configuration_web_portlet_PortletConfigurationPortlet_delta\"]")
    private WebElementFacade Delta;

    @FindBy(xpath = "//button/span[contains(text(),'Guardar')]")
    private WebElementFacade btnGuardar;

    @FindBy(xpath = "(//div[@class=\"evr-article-collage__container\"])[3]")
    private WebElementFacade Posicionar;


    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void accederGaleriaMultimedia() throws InterruptedException {
        Actions action = new Actions(getDriver());
        action.moveToElement(Ventana_Visitante).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=\"slick-list draggable\"])[1]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
        action.moveToElement(Menu)
                .perform();
        action.moveToElement(SubMenu).click().perform();
    }

    public void configurarPaginador() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//a[@data-title=\"Menú\"]")));
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(org.openqa.selenium.By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Menu_Vertical.click();
        } else {
            Assert.assertTrue(true);
        }
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Posicionar).perform();
        actions.moveToElement(Icono_puntos).click().perform();
        actions.moveToElement(OptionConfig).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//h3[@class=\"modal-title\"]")));
        WebElement iframe = getDriver().findElement(org.openqa.selenium.By.id( "_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_configurationIframeDialog_iframe_"));
        getDriver().switchTo().frame(iframe);
        WebElement Element = getDriver().findElement(org.openqa.selenium.By.xpath("//span[contains(text(),'Opciones de resultados')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Delta.clear();
        Delta.sendKeys("24");
        btnGuardar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//div[contains(text(),'La configuración ha sido actualizada')]")));

    }

    public void recargarPagina() throws InterruptedException {
        getDriver().navigate().refresh();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//span[contains(text(),'Resultados')]")));
        List<WebElement> lista = getDriver().findElements(org.openqa.selenium.By.xpath("//div[@class=\"evr-article-collage__container\"]"));
        if (lista.size() == 24) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Lista");
        }
    }
}
