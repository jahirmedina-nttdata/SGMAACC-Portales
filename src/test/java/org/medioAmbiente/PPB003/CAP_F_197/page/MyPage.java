package org.medioAmbiente.PPB003.CAP_F_197.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/noticias?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_pagination\"]/li[4]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_asset0\"]/figure/img")
    private WebElementFacade Noticia_Andalucia;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_pUmOGVAxEAjQ_11338949\"]/div/section//div[1]/p[1]")
    private WebElementFacade Validar_Noticia;

    public void seleccionarFicha() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"reflex-grid resultados\"]")));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Siguiente.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"reflex-grid resultados\"]")));
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        Noticia_Andalucia.click();
    }

    public void validarNoticia() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Andalucía, tierra de acogida de quebrantahuesos')]")));
        String validar = Validar_Noticia.getText();
        if(validar.contains("Andalucía, tierra de acogida de quebrantahuesos")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide la Noticia");
        }
    }
}
