package org.medioAmbiente.PPB006.CAP_FN_052.page;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://servintegra.cma.junta-andalucia.es/medioambiente/portal/web/guest/areas-tematicas/cambio-climatico-y-clima/escenarios-locales-de-cambio-climatico")


public class MyPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"card-cladt13-destacadosConDescripcionTresColumnas1\"]/div/h2/a")
    private WebElementFacade Contenido;

    @FindBy(xpath = "//*[@id=\"card-cladt13-destacadosConDescripcionTresColumnas0\"]/div/h2/a")
    private WebElementFacade Flotante;

    public void visualizarCAPFC010() throws InterruptedException {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0, 700)");
        Contenido.click();
        getDriver().navigate().back();
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Flotante)
                .perform();

        String textflotante = Flotante.getAttribute("title");
        if (textflotante.equals("¿Qué son los Escenarios Locales de Cambio Climático de Andalucía?")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No Coincide el Texto");
        }
    }
}