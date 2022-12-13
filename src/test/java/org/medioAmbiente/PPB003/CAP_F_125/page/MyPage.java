package org.medioAmbiente.PPB003.CAP_F_125.page;


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

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante")


public class MyPage extends PageObject {

    @FindBy(xpath = "(//li[@id=\"layout_56\"])[1]")
    private WebElementFacade Menu;

    @FindBy(xpath = "(//a[contains(text(),'Actividades')])[1]")
    private WebElementFacade SubMenu;

    @FindBy(xpath = "//a[@id=\"_AssetSearchPlugin_INSTANCE_YS0LmvJ3MRL7_follow_reading_asset2\"]")
    private WebElementFacade Ficha_Buceo;

    @FindBy(xpath = "(//a[@id=\"_AssetSearchPlugin_INSTANCE_YS0LmvJ3MRL7_follow_reading_asset2\"]//img)[2]")
    private WebElementFacade Buceo;

    @FindBy(xpath = "//button[@data-button-type=\"stop\"]//img")
    private WebElementFacade btnStop;

    @FindBy(xpath = "//button[@data-button-type=\"play\"]//img")
    private WebElementFacade btnPlay;

    @FindBy(xpath = "//button[@aria-label=\"Left\"]//img")
    private WebElementFacade btnAnterior;

    @FindBy(xpath = "//button[@aria-label=\"Right\"]//img")
    private WebElementFacade btnSiguiente;

    @FindBy(xpath = "//button[@aria-label=\"Last Picture\"]//img")
    private WebElementFacade btnPrimeraPag;

    @FindBy(xpath = "//button[@aria-label=\"Next Picture\"]")
    private WebElementFacade btnUltimaPag;

    @FindBy(xpath = "//div[@class=\"evr-carrusel slick-initialized slick-slider\"]")
    private WebElementFacade Deslizar;


    public void seleccionarMenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Menu)
                .perform();
    }

    public void seleccionarSubmenu() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(SubMenu).click().perform();
    }

    public void pulsarActividadBuceo() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Actividades')]")));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Ficha_Buceo).perform();
        actions.moveToElement(Buceo).click().perform();
    }


    public void visualizarCarrusel() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Buceo')]")));
        waitFor(3).second();
    }

    public void pulsarPausarCarrusel() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        btnStop.click();
    }

    public void pulsarReanudarCarrusel() throws InterruptedException {
        btnPlay.click();
    }

    public void pulsarAnteriorImagen() throws InterruptedException {
        btnAnterior.click();
    }

    public void deslizarCarruselalaDerecha() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Deslizar,300,0)
                .perform();
    }

    public void pulsarSiguienteImagen() throws InterruptedException {
        btnSiguiente.click();
    }

    public void deslizarCarruselalaIzquierda() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Deslizar,-300,0)
                .perform();
    }

    public void pulsarIrAlaPrimeraImagen() throws InterruptedException {
        btnPrimeraPag.click();
    }

    public void pulsarIrAlaUltimaImagen() throws InterruptedException {
        btnUltimaPag.click();
    }

}
