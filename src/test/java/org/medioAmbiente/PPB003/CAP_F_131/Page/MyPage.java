package org.medioAmbiente.PPB003.CAP_F_131.Page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-actividad/-/asset_publisher/QYwm8uHC3ojh/content/buceo/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'PUBLICACIONES')]")
    private WebElementFacade Pestaña_Publicaciones;


    public void clickarPublicaciones() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buceo')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 400)");
        Pestaña_Publicaciones.click();
    }

    public void validarTarjetas() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        List<WebElement> lista = getDriver().findElements(By.xpath("//a[@class=\"evr-table-simple__link-icon\"]"));
        if (lista.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No existe Tarjetas");
        }

    }
}
