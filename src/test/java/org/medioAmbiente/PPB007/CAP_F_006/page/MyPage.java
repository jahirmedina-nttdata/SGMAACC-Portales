package org.medioAmbiente.PPB007.CAP_F_006.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/medioambiente/portal/web/cae/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_qYW19nhpxSGc\"]//section/div/div[2]/ul/li[2]")
    private WebElementFacade Elemento;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_qYW19nhpxSGc\"]//section/div/div[2]/ul/li[1]/div/a")
    private WebElementFacade Enlace;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_qYW19nhpxSGc\"]//section/div/div[2]/ul/li[3]/div/a")
    private WebElementFacade Texto_Flotante;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_journal_content_web_portlet_JournalContentPortlet_INSTANCE_uBNL8eoU6LAL\"]//div[2]/div/a")
    private WebElementFacade Carpeta_ciudadana;


    public void visualizarCAPF038() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 750)");
    }

    public void visualizarCAPF040() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Elemento)
                .perform();
        Enlace.click();
        getDriver().navigate().back();

        actions.moveToElement(Texto_Flotante)
                .perform();
        String textflotante = Texto_Flotante.getAttribute("title");
        if(textflotante.equals("Calendario días inhábiles")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 300)");
        actions.moveToElement(Carpeta_ciudadana)
                .perform();
        Carpeta_ciudadana.click();
    }
}
