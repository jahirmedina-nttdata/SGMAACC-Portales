package org.medioAmbiente.PPB001.CAP_F_037.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category2_input\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_category2_itemList\"]/ul/li[1]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_pagination\"]/li[6]/a")
    private WebElementFacade Pagina_5;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_pagination\"]/li[11]/a")
    private WebElementFacade Pagina_19;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_pagination\"]/li[12]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_pagination\"]/li[1]/a")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_pagination\"]/li[2]/a")
    private WebElementFacade Pagina_1;

    public void seleccionarPaginador5() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
        btnBuscar.click();
        Pagina_5.click();
    }

    public void clickarSiguientePag() throws InterruptedException {
        waitFor(2).second();
        Siguiente.click();
    }

    public void clickarSiguienteUltimaPag() throws InterruptedException {
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Pagina_19.click();
        Pagina_19.click();
        Pagina_19.click();
        Siguiente.click();
    }

    public void clickarAnterior() throws InterruptedException {
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Anterior.click();
    }

    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Pagina_1.click();
        Pagina_1.click();
        Pagina_1.click();
        Pagina_1.click();
        Anterior.click();
    }

}
