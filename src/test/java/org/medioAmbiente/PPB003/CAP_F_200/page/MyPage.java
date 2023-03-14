package org.medioAmbiente.PPB003.CAP_F_200.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/noticias?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_searchTextInput\"]")
    private WebElementFacade Buscar_Texto;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'CENTRO DE VISITANTES')]")
    private WebElementFacade Centro_Visitantes;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_category0-button\"]")
    private WebElementFacade Lista_Provincia;

    @FindBy(xpath = "//div[contains(text(),'CÁDIZ')]")
    private WebElementFacade Cadiz;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void escribirTextoBusqueda() throws InterruptedException {
        Buscar_Texto.sendKeys("Andalucía");
    }

    public void seleccionarTipoEquipamiento() throws InterruptedException {
        Tipo_Equipamiento.click();
        Centro_Visitantes.click();
    }

    public void seleccionarProvincia() throws InterruptedException {
        Lista_Provincia.click();
        Cadiz.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
    }

}
