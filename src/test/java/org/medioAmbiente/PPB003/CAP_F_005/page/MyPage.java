package org.medioAmbiente.PPB003.CAP_F_005.page;


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


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchTextInput\"]")
    private WebElementFacade Cuadro_Busqueda;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_follow_reading_asset0\"]/article/div/div[1]/figure/img")
    private WebElementFacade Ficha;

    @FindBy(xpath = "//p[@class=\"evr-carrusel-banner__txt\"]")
    private WebElementFacade Ficha_Doñana;


    public void buscarPorTexto() throws InterruptedException {
        Cuadro_Busqueda.sendKeys("Parque Nacional Doñana" + "\n");
    }

    public void accederFicha() throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_follow_reading_asset0\"]/article/div/div[1]/figure/img")));
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Resultados')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Ficha.click();
    }

    public void visualizarFicha()throws InterruptedException  {
        String validacion = Ficha_Doñana.getText();
        if(validacion.contains("Doñana")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("Ficha no valida");
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        j.executeScript("window.scrollBy(0, 200)");
    }
}
