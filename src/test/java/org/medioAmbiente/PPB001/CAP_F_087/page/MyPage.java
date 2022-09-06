package org.medioAmbiente.PPB001.CAP_F_087.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/noticias?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_pagination\"]/li[4]/a")
    private WebElementFacade Siguiente;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_agurN6e4v7Bv_asset0\"]/figure/img")
    private WebElementFacade Noticia_Andalucia;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_pUmOGVAxEAjQ_11338949\"]/div/section//div[1]/p[1]")
    private WebElementFacade Validar_Noticia;

    public void seleccionarFicha() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Siguiente.click();
        j.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
        waitFor(2).second();
        Noticia_Andalucia.click();
    }

    public void validarNoticia() throws InterruptedException {
        String validar = Validar_Noticia.getText();
        if(validar.equals("Andalucía, tierra de acogida de quebrantahuesos")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide la Noticia");
        }
    }
}
