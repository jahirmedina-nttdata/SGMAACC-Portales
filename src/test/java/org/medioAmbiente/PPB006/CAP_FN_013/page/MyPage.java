package org.medioAmbiente.PPB006.CAP_FN_013.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/el-cambio-climatico")


public class MyPage extends PageObject {
    @FindBy(xpath = "//*[@id=\"card-ttpi0\"]//a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"card-ttpi1\"]//a")
    private WebElementFacade Contenido_Flotante;



    public void visualizarCAPFC006()  throws InterruptedException{
        Contenido.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Thread.sleep(2000);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido_Flotante)
                .perform();

        String flotante = Contenido_Flotante.getAttribute("title");

        if(flotante.equals("Glosario de términos sobre cambio climático")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}