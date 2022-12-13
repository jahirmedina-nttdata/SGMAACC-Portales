package org.medioAmbiente.PPB003.CAP_F_128.page;


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

import java.util.Iterator;
import java.util.Set;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-actividad/-/asset_publisher/QYwm8uHC3ojh/content/buceo/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'EQUIPAMIENTOS RELACIONADOS')]")
    private WebElementFacade Pestaña_Equipamiento;

    @FindBy(xpath = "//span[contains(text(),'ALDEA DEL CEREZO - AZUEL')]")
    private WebElementFacade Ficha_Azuel;

    @FindBy(xpath = "//span[@class=\"evr-breadcrumbs__txt\"]")
    private WebElementFacade Validar_Ficha;

    private String prntw;
    private String popwnd;

    public void clickarEquipamientosRelacionados() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buceo')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 400)");
        Pestaña_Equipamiento.click();
    }

    public void clickarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        Ficha_Azuel.click();
    }

    public void validarFicha() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Aldea del Cerezo - Azuel')]")));
        String validacion = Validar_Ficha.getText();
        if(validacion.contains("Aldea del Cerezo - Azuel")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Informacion No Valida");
        }
    }
}
