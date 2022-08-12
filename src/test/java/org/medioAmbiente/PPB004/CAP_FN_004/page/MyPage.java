package org.medioAmbiente.PPB004.CAP_FN_004.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_uGOdEr92Rjrf_searchTextInputMinimize\"]")
    private WebElementFacade txtbuscar;

    @FindBy(xpath = "//*[@id=\"14625130\"]")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_searchButton\"]")
    private WebElementFacade btnBuscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_searchTextInput\"]")
    private WebElementFacade txtavanzado;

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


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[4]/a")
    private WebElementFacade btnNro2;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[13]/a")
    private WebElementFacade btnAdelante;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[2]/a")
    private WebElementFacade btnAtras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[14]/a")
    private WebElementFacade btnUltimapg;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_4kAjH4Yf0u8r_pagination\"]/li[1]/a")
    private WebElementFacade btnPrimerapg;


    public void buscarPortexto()throws InterruptedException {
        txtbuscar.sendKeys("Cinegetico"+ "\n");
    }

    public void clickarEnlace() throws InterruptedException {
        Enlace.click();
    }

    public void visualizarCAPFN05() throws InterruptedException{
        Limpiar.click();
        Thread.sleep(2000);
        btnBuscar.click();
        Thread.sleep(2000);
        txtavanzado.sendKeys("Plan"+ "\n");
        Thread.sleep(2000);
        Limpiar.click();
        Lista_Tema.click();
        Tema_Caza.click();
        btnBuscar.click();
        Thread.sleep(2000);
        Limpiar.click();
        btnBuscar.click();
        Pag.click();
        Sig.click();

    }

    public void visualizarCAPFC020() throws InterruptedException {
        Limpiar.click();
        btnBuscar.click();
        btnNro2.click();
        Thread.sleep(2000);
        btnAdelante.click();
        Thread.sleep(2000);
        btnUltimapg.click();
        btnAtras.click();
        Thread.sleep(2000);
        btnPrimerapg.click();

    }
}
