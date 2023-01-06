package org.medioAmbiente.PPB002.CAP_F_090.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/guest/acceso-rediam/geoportal/servicios-ogc/catalogo-de-servicios-web?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//a[@title=\"REDIAM. WMS Siose Andalucía. Escala 1:10.000. Año 2016. Ocupación del suelo\"]")
    private WebElementFacade Detalle_Contenido;

    @FindBy(xpath = "//button/span[contains(text(),'Buscar')]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//input[@title=\"Buscar\"]")
    private WebElementFacade textBuscar;

    @FindBy(xpath = "//a[@title=\"REDIAM. WFS Riesgos naturales\"]")
    private WebElementFacade SinVisor;


    public void mostrarContenidoDelDetalle() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        Actions action = new Actions(getDriver());
        action.moveToElement(btnBuscar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(Detalle_Contenido).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//h1[@id=\"evr-menu-block__title-principal\"]")));
        j.executeScript("window.scrollBy(0, 250)");
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 600)");
        waitFor(2).second();
    }

    public void mostrarSinVisor() throws InterruptedException {
        getDriver().navigate().back();
        textBuscar.sendKeys("Riesgos naturales");
        Actions action = new Actions(getDriver());
        action.moveToElement(btnBuscar).click().perform();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//p[contains(text(),'Mostrando')]")));
        action.moveToElement(SinVisor).click().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(net.serenitybdd.core.annotations.findby.By.xpath("//h1[@id=\"evr-menu-block__title-principal\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 250)");
        waitFor(1).second();
        j.executeScript("window.scrollBy(0, 600)");
        waitFor(1).second();
    }

}
