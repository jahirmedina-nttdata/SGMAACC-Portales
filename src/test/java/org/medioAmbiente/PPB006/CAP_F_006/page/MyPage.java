package org.medioAmbiente.PPB006.CAP_F_006.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[2]/label")
    private WebElementFacade Busqueda_Avan;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_category0-button\"]")
    private WebElementFacade Lista;

    @FindBy(xpath = "//div[contains(text(),'Administraciones locales')]")
    private WebElementFacade Categoria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_searchButton\"]/span")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/button[2]/span")
    private WebElementFacade btnLimpiar;

    @FindBy(xpath = "//*[@id=\"46894923\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[13]/a")
    private WebElementFacade Sig;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[14]/a")
    private WebElementFacade Ultimo;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[2]/a")
    private WebElementFacade Atras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_j9REwhPrNDhF_pagination\"]/li[1]/a")
    private WebElementFacade Primera;

    @FindBy(xpath = "//a[@title=\"Portal Andaluz de Cambio Climático\"]")
    private WebElementFacade Portal_CC;



    public void visualizarCAPF104() throws InterruptedException, URISyntaxException {
        getDriver().get(new URI(getDriver().getCurrentUrl()).resolve("/medioambiente/portal/web/cambio-climatico/buscador").toString());
        Busqueda_Avan.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");

        Texto_Buscar.sendKeys("Huella"+ "\n");
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnLimpiar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Lista.click();
        Categoria.click();
        btnBuscar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnLimpiar.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Enlace)
                .perform();
        String textflotante = Enlace.getAttribute("title");
        if(textflotante.equals("Nuevos visores de adaptación de las costas al cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Sig.waitUntilClickable();
        Sig.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Ultimo.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Atras.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        Primera.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
    }

    public void visualizarCAPF105() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        Portal_CC.click();
        j.executeScript("window.scrollBy(0, 100)");
    }

    public void visualizarCAPF106() throws InterruptedException{
        waitFor(3).second();
    }
}