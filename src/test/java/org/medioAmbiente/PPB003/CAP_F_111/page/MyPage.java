package org.medioAmbiente.PPB003.CAP_F_111.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/buscador?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_k4AFpXuQNU0N_pagination\"]/li[7]/a")
    private WebElementFacade Paginador;

    @FindBy(xpath = "//*[@id=\"53226105\"]")
    private WebElementFacade Contenido;

    public void clickarPaginador() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 800)");
        Paginador.click();
    }

    public void seleccionarContenido() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        Contenido.click();
    }

    public void retrocederPagina() throws InterruptedException {
        getDriver().navigate().back();
        waitFor(2).second();
    }
}