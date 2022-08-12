package org.medioAmbiente.PPB006.CAP_FC_009.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"slick-slide14\"]/a")
    private WebElementFacade Deslizar;

    @FindBy(xpath = "//*[@id=\"slick-slide-control13\"]")
    private WebElementFacade Bullet;



    public void accederContenido() throws InterruptedException {
        Contenido.click();

    }

    public void validarTextoflotante() throws InterruptedException {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();

        String flotante = Contenido.getAttribute("title");

        if(flotante.equals("Compensación de emisiones de GEI")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }

    public void clickarBullet() throws InterruptedException{
        Bullet.click();
    }

    public void deslizarIzquierda() throws InterruptedException {

        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Deslizar,-300,0)
                .perform();
    }

    public void deslizarDerecha() throws InterruptedException{
        Actions actions = new Actions(getDriver());
        actions.dragAndDropBy(Deslizar,300,0)
                .perform();
    }
}
