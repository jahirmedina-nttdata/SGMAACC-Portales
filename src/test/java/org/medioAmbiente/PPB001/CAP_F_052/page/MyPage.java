package org.medioAmbiente.PPB001.CAP_F_052.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/galería-multimedia?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_category2-button\"]")
    private WebElementFacade Tipo_Equipamiento;

    @FindBy(xpath = "//div[contains(text(),'ÁREA RECREATIVA')]")
    private WebElementFacade Area_Recreativa;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[6]/a")
    private WebElementFacade Pagina_5;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[11]/a")
    private WebElementFacade Ultima_Pagina;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[12]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[1]/a")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_CpKE9LAiUNvt_pagination\"]/li[2]/a")
    private WebElementFacade Primera_Pagina;

    public void seleccionarPaginador5() throws InterruptedException {
        Tipo_Equipamiento.click();
        Area_Recreativa.click();
        btnBuscar.click();
        Pagina_5.click();
        waitFor(2).second();
    }

    public void clickarSiguientePag() throws InterruptedException {
        Siguiente.click();
    }

    public void clickarSiguienteUltimaPag() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        Ultima_Pagina.click();
        Ultima_Pagina.click();
        Ultima_Pagina.click();
        Siguiente.click();
    }

    public void clickarAnterior() throws InterruptedException {
        Anterior.click();
    }

    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        Primera_Pagina.click();
        Primera_Pagina.click();
        Primera_Pagina.click();
        Anterior.click();
    }

}
