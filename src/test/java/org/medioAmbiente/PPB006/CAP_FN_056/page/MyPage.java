package org.medioAmbiente.PPB006.CAP_FN_056.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/cambio-climatico/proyectos-y-casos-de-estudio")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"slick-slide00\"]/a")
    private WebElementFacade Contenido;

    public void visualizarCAPFC010() throws InterruptedException{
        Contenido.click();
        Thread.sleep(2000);
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido)
                .perform();


        String textflotante = Contenido.getAttribute("title");

        if(textflotante.equals("Coastance")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }
}