package org.medioAmbiente.PPB004.CAP_FC_020.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/trámites")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[4]/a")
    private WebElementFacade btnNro2;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[3]/a")
    private WebElementFacade btnNro1;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[5]/a")
    private WebElementFacade btnAdelante;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[2]/a")
    private WebElementFacade btnAtras;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[6]/a")
    private WebElementFacade btnUltimapg;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_Fptb3mEIwaEh_pagination\"]/li[1]/a")
    private WebElementFacade btnPrimerapg;


    public void clickarPagina() throws InterruptedException {
        btnNro2.click();
        Thread.sleep(2000);
        btnNro1.click();
    }

    public void clickarSiguiente() throws InterruptedException{
        btnAdelante.click();
        Thread.sleep(2000);
        btnNro1.click();
    }

    public void clickarUltimaPag()throws InterruptedException {
        btnUltimapg.click();
    }

    public void clickarAtras()throws InterruptedException  {
        btnAtras.click();
        Thread.sleep(2000);
        btnNro2.click();
    }

    public void clickarPrimeraPg()throws InterruptedException {
        btnPrimerapg.click();
    }
}
