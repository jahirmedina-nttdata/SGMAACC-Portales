package org.medioAmbiente.PPB004.CAP_FC_016.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/caza-y-pesca/especies-cinegéticas")



public class MyPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"slick-slide01\"]/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"slick-slide-control00\"]")
    private WebElementFacade Bullet;

    @FindBy(xpath = "//*[@id=\"slick-slide02\"]")
    private WebElementFacade Card;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_SDFlr2QMFIzO\"]//div[2]/button[2]")
    private WebElementFacade Flecha_Derecha;

    @FindBy(xpath = "//*[@id=\"portlet_com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_SDFlr2QMFIzO\"]//div[2]/button[1]")
    private WebElementFacade Flecha_Izquierda;
    public void navegarContenido()throws InterruptedException  {
        Contenido.click();
    }
    public void validarTextFlotante() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();
        Thread.sleep(2000);
        String textflotante = Contenido.getAttribute("title");

        if(textflotante.equals("Emergencia cinegética")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
    }


    public void clickarBullet() throws InterruptedException {
        Bullet.click();

    }

    public void deslizarIzquierda()  throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Card,-500,0)
                .perform();
    }
    public void deslizarDerecha()  throws InterruptedException{

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Card,500,0)
                .perform();
    }

    public void clickarFDerecha() throws InterruptedException{
        Flecha_Derecha.click();
    }

    public void clickarFIzquierda() throws InterruptedException{
        Flecha_Izquierda.click();
    }
}
