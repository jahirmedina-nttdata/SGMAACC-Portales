package org.medioAmbiente.PPB003.CAP_F_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/espacio-personal")


public class MyPage extends PageObject {

    @FindBy(xpath = "//button[@class=\"evr-btn--add-pas\"]")
    private WebElementFacade Pasaporte;

    @FindBy(xpath = "//*[@id=\"heading\"]//a/figure/img")
    private WebElementFacade Inciar_Sesion;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_login\"]")
    private WebElementFacade Usuario;

    @FindBy(xpath = "//*[@id=\"_com_liferay_login_web_portlet_LoginPortlet_password\"]")
    private WebElementFacade Password;

    public void clickarPasaporte() throws InterruptedException {
        Usuario.sendKeys("cmaot_testing");
        Password.sendKeys("Liferay*21"+ "\n");
        getDriver().navigate().to("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/do-c3-b1ana-18/255035");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"evr-carrusel-banner__txt\"]")));
        WebElement Element = getDriver().findElement(By.xpath("//div[@class=\"evr-carrusel-banner__logo\"]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        List<WebElement> OffPasaporte = getDriver().findElements(By.xpath("//button[@class=\"evr-btn--add-pas\"]"));
        if (OffPasaporte.size() != 0) {
            Pasaporte.click();
        } else {
            WebDriverWait waitf = new WebDriverWait(getDriver(), 10);
            waitf.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"evr-btn--delete-pas\"]")));
        }

    }
}
