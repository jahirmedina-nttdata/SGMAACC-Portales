package org.medioAmbiente.PPB001.CAP_F_008.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/cerro-del-moro")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"dropdownMenu1\"]")
    private WebElementFacade Lista_Idioma;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_site_navigation_language_web_portlet_SiteNavigationLanguagePortlet\"]//li[3]/button")
    private WebElementFacade Idioma;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs16879787820169833268397378842018220284TabsSection\"]/div[2]/span")
    private WebElementFacade Validar_Idioma;

    public void cambiarIdioma() throws InterruptedException {
        Lista_Idioma.click();
        Idioma.click();
    }

    public void validarTraduccion() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor)getDriver();
        j.executeScript("window.scrollBy(0, 700)");

        String textflotante = Validar_Idioma.getText();
        if(textflotante.contains("ESPACES NATURELS")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el idioma");
        }
    }
}
