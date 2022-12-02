package org.medioAmbiente.PPB003.CAP_F_032.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/ventanadelvisitante/detalle-buscador-mapa/-/asset_publisher/Jlbxh2qB3NwR/content/parque-natural-bah-c3-ada-de-c-c3-a1diz/255035")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]//button[3]/figure/img")
    private WebElementFacade Reanudar;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]//button[4]/figure/img")
    private WebElementFacade Pausar;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]//button[2]/figure/img")
    private WebElementFacade btnAnterior;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]//button[5]/figure/img")
    private WebElementFacade btnSiguiente;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]//button[1]/figure/img")
    private WebElementFacade btnPrimerapag;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]//button[6]/figure/img")
    private WebElementFacade btnUltimapag;

    @FindBy(xpath = "//*[@id=\"_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_Jlbxh2qB3NwR_5186758\"]/div/div/section[1]/div/div[2]/div[1]/div")
    private WebElementFacade Mover_Carrusel;


    public void clickarPausar() throws InterruptedException  {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 100)");
        Pausar.click();
    }

    public void clickarReanudar()throws InterruptedException  {
        Reanudar.click();
    }

    public void clickarAnterior()throws InterruptedException  {
        Pausar.click();
        btnAnterior.click();
    }

    public void moverDerecha()throws InterruptedException  {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Mover_Carrusel,300,0)
                .perform();
    }

    public void clickarSiguiente()throws InterruptedException  {
        btnSiguiente.click();
    }

    public void moverIzquierda()throws InterruptedException  {
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Mover_Carrusel,-300,0)
                .perform();
    }

    public void clickarPrimerapag()throws InterruptedException  {
        btnPrimerapag.click();
    }

    public void clickarUltimapag()throws InterruptedException  {
        btnUltimapag.click();
    }
}
