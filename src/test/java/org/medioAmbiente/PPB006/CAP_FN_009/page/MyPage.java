package org.medioAmbiente.PPB006.CAP_FN_009.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/home")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"slick-slide12\"]/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"slick-slide14\"]/a")
    private WebElementFacade Deslizar;

    @FindBy(xpath = "//*[@id=\"slick-slide-control13\"]")
    private WebElementFacade Bullet;

    public void visualizarCAPFC009() throws InterruptedException{
        Contenido.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);

        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();

        String flotante = Contenido.getAttribute("title");

        if(flotante.equals("Compensación de emisiones de GEI")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }
        Thread.sleep(2000);

        Bullet.click();
        Actions actions1 = new Actions(getDriver());
        actions1.dragAndDropBy(Deslizar,-300,0)
                .perform();
        Thread.sleep(1000);
        actions1.dragAndDropBy(Deslizar,300,0)
                .perform();
    }

}