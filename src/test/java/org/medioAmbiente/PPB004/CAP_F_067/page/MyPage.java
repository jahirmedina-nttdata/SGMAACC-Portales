package org.medioAmbiente.PPB004.CAP_F_067.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/caza-y-pesca/trámites")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[4]/a")
    private WebElementFacade btnNro2;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[3]/a")
    private WebElementFacade btnNro1;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[5]/a")
    private WebElementFacade btnAdelante;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[2]/a")
    private WebElementFacade btnAtras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[6]/a")
    private WebElementFacade btnUltimapg;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[1]/a")
    private WebElementFacade btnPrimerapg;

    public void mostrarNumeracion()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
    }

    public void clickarPagina() throws InterruptedException {
        btnNro2.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro1.click();
    }

    public void clickarSiguiente() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnAdelante.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro1.click();
    }

    public void clickarUltimaPag()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnUltimapg.click();
    }

    public void clickarAtras()throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnAtras.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnNro2.click();
    }

    public void clickarPrimeraPg()throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Mostrando')]")));
        btnPrimerapg.click();
    }
}
