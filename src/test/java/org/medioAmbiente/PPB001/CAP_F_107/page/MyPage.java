package org.medioAmbiente.PPB001.CAP_F_107.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/publicaciones?categoryVal=")


public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[11]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[11]/a")
    private WebElementFacade Ultima_Pagina;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[12]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[1]/a")
    private WebElementFacade Anterior;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_vmsqjALduDnx_pagination\"]/li[2]/a")
    private WebElementFacade Primera_Pagina;

    public void seleccionarPaginador() throws InterruptedException {
        Paginador.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void clickarSiguientePag() throws InterruptedException {
        waitFor(2).second();
        Siguiente.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void clickarSiguienteUltimaPag() throws InterruptedException {
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Ultima_Pagina.click();
        waitFor(2).second();
        Siguiente.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void clickarAnterior() throws InterruptedException {
        waitFor(2).second();
        Anterior.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }

    public void clickarAnteriorPrimeraPag() throws InterruptedException {
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Primera_Pagina.click();
        waitFor(2).second();
        Anterior.click();
    }

}
