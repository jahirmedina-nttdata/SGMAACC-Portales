package org.medioAmbiente.PPB004.CAP_FN_005.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/buscador")


public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_searchTextInput\"]")
    private WebElementFacade txtbuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_category0-button\"]/span[2]")
    private WebElementFacade Lista_Tema;

    @FindBy(xpath = "//*[@role=\"option\"][contains(text(),'Caza')]")
    private WebElementFacade Tema_Caza;

    @FindBy(xpath = "//*[@id=\"evr-formFilters\"]/div[2]/div[4]/button[2]/span")
    private WebElementFacade Limpiar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[7]")
    private WebElementFacade Pag;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[13]")
    private WebElementFacade Sig;



    public void clickarBuscar() throws InterruptedException{
        btnBuscar.click();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void clickarconTexto() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -200)");
        txtbuscar.sendKeys("Plan"+ "\n");
        j.executeScript("window.scrollBy(0, 200)");
    }

    public void seleccionarTema() throws InterruptedException{
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, -200)");
        Limpiar.click();
        Lista_Tema.click();
        Tema_Caza.click();
        btnBuscar.click();
        j.executeScript("window.scrollBy(0, 700)");
    }

    public void navegarVistas() {
        Limpiar.click();
        btnBuscar.click();
        Pag.click();
        Sig.click();
    }
}
