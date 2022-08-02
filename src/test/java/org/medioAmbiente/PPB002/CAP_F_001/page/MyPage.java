package org.medioAmbiente.PPB002.CAP_F_001.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es//medioambiente/portal/web/guest/landing-page-noticia/-/asset_publisher/XYiggbz580YL/content/la-poblacion-del-lince-en-andalucia-crece-un-10-7-y-alcanza-el-record-de-506-ejemplares/20151?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id='mCSB_1_dragger_vertical']")
    private WebElementFacade scrollAceptarCookies;

    @FindBy(xpath = "//*[@id='accept-cookies']")
    private WebElementFacade btnAceptarCookies;

    @FindBy(xpath = "//*[@id='ahyk_column1_0_averageRatingContent']/a[1]")
    private WebElementFacade btnValorarContenido1;

    @FindBy(xpath = "//*[@id='ahyk_column1_0_averageRatingContent']/a[2]")
    private WebElementFacade btnValorarContenido2;

    @FindBy(xpath = "//*[@id='ahyk_column1_0_averageRatingContent']/a[3]")
    private WebElementFacade btnValorarContenido3;

    @FindBy(xpath = "//*[@id='ahyk_column1_0_averageRatingContent']/a[4]")
    private WebElementFacade btnValorarContenido4;

    @FindBy(xpath = "//*[@id='ahyk_column1_0_averageRatingContent']/a[5]")
    private WebElementFacade btnValorarContenido5;

    public void interacturaScrollAceptarCookies() throws InterruptedException {
        scrollAceptarCookies.click();
    }

    public void aceptarCookies() throws InterruptedException {
        btnAceptarCookies.click();
    }

    public void valorarContenido(String xValoracion) throws InterruptedException {
        switch (xValoracion) {
            case "1":
                btnValorarContenido1.click();
                break;
            case "2":
                btnValorarContenido2.click();
                break;
            case "3":
                btnValorarContenido3.click();
                break;
            case "4":
                btnValorarContenido4.click();
                break;
            case "5":
                btnValorarContenido5.click();
                break;
        }
    }

}
