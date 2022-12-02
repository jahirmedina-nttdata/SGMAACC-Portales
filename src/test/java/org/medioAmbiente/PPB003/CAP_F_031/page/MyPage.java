package org.medioAmbiente.PPB003.CAP_F_031.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchTextInput\"]")
    private WebElementFacade Cuadro_Busqueda;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_follow_reading_asset1\"]//figure/img")
    private WebElementFacade Ficha_Equipamiento;


    public void buscarPorTexto() throws InterruptedException {
        Cuadro_Busqueda.sendKeys("Parque Natural Bahía de Cádiz" + "\n");
    }

    public void accederFichaEquipamiento() throws InterruptedException  {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Resultados')]")));
        WebElement Element = getDriver().findElement(By.xpath("//span[contains(text(),'Resultados')]"));
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("arguments[0].scrollIntoView();", Element);
        Ficha_Equipamiento.click();
    }

    public void visualizarFicha()throws InterruptedException  {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        j.executeScript("window.scrollBy(0, 200)");
    }
}
