package org.medioAmbiente.PPB002.CAP_F_002_01.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/home")


public class MyPage extends PageObject {
    private String prntw;
    private String popwnd;

    public static WebDriver driver;
    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_UrW3Fsd7dldJ_searchTextInputMinimize\"]")
    private WebElementFacade txtbuscador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_UrW3Fsd7dldJ_searchTextInputMinimize\"]")
    private WebElementFacade txttema;

    @FindBy(xpath = "//a[contains(text(),'Agua')]")
    private WebElementFacade validar;

    public void clickBuscador() throws InterruptedException {
        txtbuscador.click();

    }

    public void escribimosenelBuscador(String tema) throws InterruptedException {
    txttema.sendKeys(tema+ "\n");

    }

    public void filtracionBusquedad() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");

        String validacion = validar.getText();
        if(validacion.contains("Agua")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Busqueda Invalida");
        }

    }

}
