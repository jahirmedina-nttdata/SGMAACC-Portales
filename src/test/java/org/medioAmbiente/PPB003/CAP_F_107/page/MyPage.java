package org.medioAmbiente.PPB003.CAP_F_107.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/buscador-de-espacios-naturales-y-equipamientos?categoryVal=")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_searchTextInput\"]")
    private WebElementFacade Texto_Buscar;

    @FindBy(xpath = "//*[@id=\"_AssetSearchPlugin_INSTANCE_rbJEpPKqmqSg_follow_reading_asset0\"]/article/div/div[1]/figure/img")
    private WebElementFacade Espacio_Natural;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_tabs16567847386736865686983TabsId\"]/a")
    private WebElementFacade Pestaña_Actividades;


    public void seleccionarEspacioNatural() throws InterruptedException {
        Texto_Buscar.sendKeys("CABO DE GATA"+ "\n");
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 750)");
        Espacio_Natural.click();
    }

    public void seleccionarPestaña() throws InterruptedException {
        waitFor(2).second();
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Pestaña_Actividades.click();
        j.executeScript("window.scrollBy(0, 200)");
    }
}