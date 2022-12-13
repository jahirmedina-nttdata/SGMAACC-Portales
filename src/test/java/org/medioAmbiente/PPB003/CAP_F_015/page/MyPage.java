package org.medioAmbiente.PPB003.CAP_F_015.page;


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

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//a[@data-title=\"Menú\"]")
    private WebElementFacade Menu_Vertical;

    @FindBy(xpath = "//div[@class=\"evr-carrusel slick-initialized slick-slider\"]")
    private WebElementFacade Ficha;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_kldx_column1_0_menu\"]/span")
    private WebElementFacade icono_3puntos;

    @FindBy(xpath = "//a[@data-title=\"Editar BAHIA DE CADIZ\"]")
    private WebElementFacade Editar;

    @FindBy(xpath = "//button[@id=\"_com_liferay_journal_web_portlet_JournalPortlet_publishButton\"]")
    private WebElementFacade btnPublicar;

    public void autenticarUsuario() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21" + "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
    }

    public void ejecutarCAPF003() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/bahia-de-cadiz-11/255035").toString());
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title=\"Ir a Buscador de Espacios Naturales y Equipamientos\"]")));
        Menu_Vertical.click();
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"control-menu-icon lfr-portal-tooltip product-menu-toggle sidenav-toggler active open\"]"));
        if (lista.size() != 0) {
            Menu_Vertical.click();
        } else {
            Assert.assertTrue(true);
        }
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ficha)
                .perform();
        actions.moveToElement(icono_3puntos).click().perform();
        actions.moveToElement(Editar).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(text(),'Editar BAHIA DE CADIZ')]")));
        WebElement iframe = getDriver().findElement(By.xpath( "//iframe[@title=\"Editar BAHIA DE CADIZ\"]"));
        getDriver().switchTo().frame(iframe);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Identificador:')]")));
        btnPublicar.waitUntilClickable();
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Figura de Protección')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        waitFor(2).second();
    }

}
