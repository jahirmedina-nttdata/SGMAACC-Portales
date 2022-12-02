package org.medioAmbiente.PPB006.CAP_FC_006.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("/medioambiente/portal/web/cambio-climatico/emisiones-difusas")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-ttpi0\"]/div/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"card-ttpi1\"]/div/a")
    private WebElementFacade Contenido_Flotante;

    public void visualizarContenido()throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 980)");
    }
    public void accederContenido() throws InterruptedException {
        Contenido.click();
    }
    public void validarTextoflotante() throws InterruptedException {
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Contenido_Flotante)
                .perform();
        String flotante = Contenido_Flotante.getAttribute("title");

        if(flotante.equals("Evolución de las emisiones difusas de gases de efecto invernadero en Andalucía")) {
            Assert.assertTrue(true);
        }else{
            Assert.fail("No Coincide el Texto");
        }

    }


}
