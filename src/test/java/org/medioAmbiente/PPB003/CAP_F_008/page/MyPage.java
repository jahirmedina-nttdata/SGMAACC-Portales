package org.medioAmbiente.PPB003.CAP_F_008.page;


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
import java.util.Iterator;
import java.util.List;
import java.util.Set;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//button[@class=\"evr-btn--add-pas\"]")
    private WebElementFacade Pasaporte;

    @FindBy(xpath = "//*[@id=\"heading\"]//a/figure/img")
    private WebElementFacade Inciar_Sesion;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    @FindBy(xpath = "//*[@id=\"portlet_Pasaportemodule_INSTANCE_PasaporteModule\"]//button[1]")
    private WebElementFacade btnPasaporte;

    public void Autenticarse() throws InterruptedException, URISyntaxException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'cmaot_testing testing')]")));
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035").toString());
    }

    public void clickarPasaporte() throws InterruptedException {
        btnPasaporte.waitUntilClickable();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        List<WebElement> OffPasaporte = getDriver().findElements(By.xpath("//button[@class=\"evr-btn--add-pas\"]"));
        if (OffPasaporte.size() != 0) {
            Actions action = new Actions(getDriver());
            action.moveToElement(Pasaporte).click().perform();
        } else {
            WebDriverWait wait = new WebDriverWait(getDriver(), 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"evr-btn--delete-pas\"]")));
        }
    }

    public void verificarIcono() throws InterruptedException {

        List<WebElement> icono = getDriver().findElements(By.xpath("//button[@class=\"evr-btn--delete-pas\"]"));
        if (icono.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se añadio pasaporte");
        }

    }
}
