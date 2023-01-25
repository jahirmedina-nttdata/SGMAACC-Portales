package org.medioAmbiente.PPB007.CAP_FC_006.page;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@DefaultUrl("/medioambiente/portal/web/cae/identificaci%C3%B3n-de-la-sede-electr%C3%B3nica")


public class MyPage extends PageObject {


    @FindBy(xpath = "//li[@class=\"liIcono colapse\"]/i")
    private WebElementFacade Cerrar_Apartado;

    @FindBy(xpath = "(//li[@class=\"liIcono\"]/i)[1]")
    private WebElementFacade Abrir_Apartado;


    public void visualizarContenido() throws InterruptedException {
        waitFor(1).second();
    }


    public void desplegarContenido() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Abrir_Apartado).click().perform();
        waitFor(1).second();
        List<WebElement> apartado = getDriver().findElements(By.xpath("//li[@class=\"liIcono colapse\"]/i"));
        if (apartado.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se desplego apartado");
        }
    }

    public void ocultarContenido() throws InterruptedException {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(Cerrar_Apartado).click().perform();
        waitFor(1).second();
        List<WebElement> apartado = getDriver().findElements(By.xpath("(//li[@class=\"liIcono\"]/i)[1]"));
        if (apartado.size() != 0) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("No se oculto apartado");
        }
    }

}
