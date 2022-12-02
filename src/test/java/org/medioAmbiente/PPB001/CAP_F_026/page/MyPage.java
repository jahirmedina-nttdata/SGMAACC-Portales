package org.medioAmbiente.PPB001.CAP_F_026.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category0-button\"]")
    private WebElementFacade SelectTipo_Espacio;

    @FindBy(xpath = "//div[contains(text(),'LUGAR DE IMPORTANCIA COMUNITARIA')]")
    private WebElementFacade Importancia_Comunitaria;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_espaciosNaturales-button\"]")
    private WebElementFacade SelectNombre_Espacio;

    @FindBy(xpath = "//div[contains(text(),'DUNAS DEL ODIEL')]")
    private WebElementFacade Dunas_Odiel;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]")
    private WebElementFacade btnBuscar;


    public void seleccionarImportanciaComunitaria() throws InterruptedException {
       SelectTipo_Espacio.click();
       Importancia_Comunitaria.click();
    }

    public void seleccionarDunasOdiel() throws InterruptedException {
        SelectNombre_Espacio.click();
        Dunas_Odiel.click();
    }

    public void clickarBuscar() throws InterruptedException {
        btnBuscar.click();
    }

    public void validarResultado() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 900)");
    }

}
